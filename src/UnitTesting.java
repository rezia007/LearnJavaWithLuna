import junit.framework.Assert;
import org.junit.Test;

public class UnitTesting {
    @Test
    public void firstTest(){
        String expected="Expected Data";
        String actual="Actual Data";
        Assert.assertEquals(expected,actual);
    }

}
