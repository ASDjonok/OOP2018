import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMyBrilliantSet extends Assert{
    MyBrilliantSet myBrilliantSet;

    @Before
    public void before(){
        System.out.println(Thread.currentThread().getId());
        System.out.println(myBrilliantSet);
        myBrilliantSet= new MyBrilliantSet();
        System.out.println(":)");
    }

    @Test
    public void firstTestMethod() {
        System.out.println("firstTestMethod");
        assertEquals(1, myBrilliantSet.size());
    }

    @Test
    public void isEmptyTest() {
        System.out.println("isEmptyTest");
//        MyBrilliantSet myBrilliantSet = new MyBrilliantSet();
        assertTrue(myBrilliantSet.isEmpty());
    }

    @Test
    public void addTest() throws WrongCostException {
        System.out.println("addTest");
//        MyBrilliantSet myBrilliantSet = new MyBrilliantSet();
        myBrilliantSet.add(new Brilliant(1,1));
        assertFalse(myBrilliantSet.isEmpty());
        assertTrue(myBrilliantSet.add(new Brilliant(2,2)));
        assertFalse(myBrilliantSet.isEmpty());
        assertEquals(2, myBrilliantSet.size());
    }

    @Test(expected = WrongCostException.class)
    public void exceptionTest() throws WrongCostException {
        System.out.println("exceptionTest");
        Brilliant brilliant = new Brilliant(0, -2);
    }
}
