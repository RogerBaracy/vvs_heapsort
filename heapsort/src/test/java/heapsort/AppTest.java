package heapsort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    HeapSort heapsort = new HeapSort();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testSort(){
        int[] v1 = {1,3,2,5,4};
        int[] v2 = {1,2,3,4,5};

        this.heapsort.sort(v1);
        assertArrayEquals(v1, v2);
    }
}
