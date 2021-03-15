package array.q2;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void maxProfitTest01() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        assertThat( Solution.maxProfit( prices ), is( 7 ) );
    }

    @Test
    public void maxProfitTest02() {
        int[] prices = new int[]{1,2,3,4,5};

        assertThat( Solution.maxProfit( prices ), is( 4 ) );
    }

    @Test
    public void maxProfitTest03() {
        int[] prices = new int[]{7,6,4,3,1};
        assertThat( Solution.maxProfit( prices ), is( 0 ) );
    }
}