import org.geekbrains.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestArray1 {

    @Test
    public void testAdd1(){
        int[] expected = {1,7};
        int[] testArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        Assert.assertArrayEquals(expected, Main.subListArray(testArray));
    }

    @Test(expected = RuntimeException.class)
    public void testAdd2() {
        int[] testArray = {1, 2, 2, 3, 1, 7};
        Main.subListArray(testArray);
    }

    @Test
    public void testAdd3(){
        int[] expected = {};
        int[] testArray = {1, 2, 4, 4, 2, 3, 4, 1, 7, 4};
        Assert.assertArrayEquals(expected, Main.subListArray(testArray));
    }

}
