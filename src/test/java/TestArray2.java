import org.geekbrains.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestArray2 {
    //                [ 1 1 1 4 4 1 4 4 ] -> true
//                [ 1 1 1 1 1 1 ] -> false
//                [ 4 4 4 4 ] -> false
//                [ 1 4 4 1 1 4 3 ] -> false
    @Test
    public void testAdd1(){
        int[] testArray = {1, 1, 1, 4, 4, 1, 4, 4};
        Assert.assertEquals(true, Main.chekArray(testArray));
    }

    @Test
    public void testAdd2(){
        int[] testArray = {1, 1, 1, 1, 1, 1};
        Assert.assertEquals(false, Main.chekArray(testArray));
    }

    @Test
    public void testAdd3(){
        int[] testArray = {4, 4, 4, 4, };
        Assert.assertEquals(false, Main.chekArray(testArray));
    }

    @Test
    public void testAdd4(){
        int[] testArray = {1, 4, 4, 1, 1, 4, 3 };
        Assert.assertEquals(false, Main.chekArray(testArray));
    }
}
