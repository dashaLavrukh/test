import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class MassSortTest {
    ArrayList arr = new ArrayList();
    ArrayList arrEx = new ArrayList();

    @Before
    public void init(){
        arr.add(3); arr.add(2); arr.add(4); arr.add(1); arr.add(5);

        arrEx.add(1); arrEx.add(2); arrEx.add(3); arrEx.add(4); arrEx.add(5);
    }

    @Test
    public void conformityTest(){
        MassSort massSort = new MassSort();
        assertEquals("Expected array: [1,2,3,4,5]",arrEx,massSort.sort(arr));
    }

    @Test
    public void bordersTest(){
        MassSort massSort = new MassSort();
        assertEquals("Expected value of the first element: 1",1, massSort.sort(arr).get(0));
        assertEquals("Expected value of the last element: 5",5, massSort.sort(arr).get(arr.size()-1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void exceptionTest(){
         MassSort massSort = new MassSort();
        //выход за границы массива
        massSort.sortWithException(arr);
    }
}
