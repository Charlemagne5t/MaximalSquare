import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maximalSquareTest1(){
        char[][] matrix = {
                {'1','0', '1', '0', '0'},
                {'1','0', '1', '1', '1'},
                {'1','1', '1', '1', '1'},
                {'1','0', '0', '1', '0'}
        };

        Assert.assertEquals(4, new Solution().maximalSquare(matrix));
    }
   // [["1","1","1","1","0"],
   // ["1","1","1","1","0"],
   // ["1","1","1","1","1"],
   // ["1","1","1","1","1"],
   // ["0","0","1","1","1"]]
   @Test
   public void maximalSquareTest2(){
       char[][] matrix = {
               {'1','1', '1', '1', '0'},
               {'1','1', '1', '1', '0'},
               {'1','1', '1', '1', '1'},
               {'1','1', '1', '1', '1'},
               {'0','0', '1', '1', '1'}
       };

       Assert.assertEquals(16, new Solution().maximalSquare(matrix));
   }
}


