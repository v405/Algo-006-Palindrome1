package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void isPalindromeTest1(){
        String input = "aaabbbb";
        String expected = "YES";
        String actual = solution.isPalindrome(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTest2(){
        String input = "cdefghmnopqrstuvw";
        String expected = "NO";
        String actual = solution.isPalindrome(input);
        Assert.assertEquals(expected, actual);
    }

}
