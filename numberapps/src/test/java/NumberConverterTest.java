import com.number.app.NubmerConverter;
import com.number.exception.NumberConverterException;
import org.junit.Assert;
import org.junit.Test;

public class NumberConverterTest {
    @Test
    public void tsetPositiveNumbers() throws Exception {
        int number=187;
        String result=NubmerConverter.convert(number);
        Assert.assertTrue("One Hundred Eighty Seven".equalsIgnoreCase(result));
}

    @Test
    public void tsetZeroNumbers() throws Exception {
        int number=0;
        String result= NubmerConverter.convert(number);
        Assert.assertTrue("Zero".equalsIgnoreCase(result));
    }

    @Test
    public void tsetLargeNumbers() throws Exception {
        int number=147483647;
        String result=NubmerConverter.convert(number);
        Assert.assertTrue("One Hundred Forty Seven million Four Hundred Eighty Three thousand Six Hundred Forty Seven".equalsIgnoreCase(result));
    }

    @Test(expected = NumberConverterException.class)
    public void tsetVeryLargeNumbers() throws Exception {
        int number=2147483647;
        NubmerConverter.convert(number);
    }

    @Test
    public void tsetZeroPaddingNumbers() throws Exception {
        int number=001;
        String result=NubmerConverter.convert(number);
        Assert.assertTrue("One".equalsIgnoreCase(result));
    }
}
