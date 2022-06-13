package test;

import com.apps.BalancedWordsCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Public test class for BalancedWordsCounter class
 *
 * @author: Sebastian Przeliorz
 * @version 1.0
 */

public class BalancedWordsCounterTest {

     /**
      * Variable storing input for classes
       */
    String input;

     /**
      * Variable storing expected results returned by classes
      */
    int expectedResult = 0;

     /**
      * Object of BalancedWordsCounter class
      */
    BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

     /**
      * Function testing for input = input = “aabbabcccba” and result = 28
      */
    @Test
    void case1Test(){
        input = "aabbabcccba";
        expectedResult = 28;
        Assertions.assertEquals(expectedResult, balancedWordsCounter.count(input));
    }

     /**
      * Function testing for input = “” and result = 0
      */
    @Test
    void case2Test(){
        input = "";
        expectedResult = 0;
        Assertions.assertEquals(expectedResult, balancedWordsCounter.count(input));
    }

     /**
      * Function testing for input = “abababa1” and result = RuntimeException
      */
    @Test
    void case3Test(){
        input = "abababa1";
        try {
            Assertions.assertEquals(expectedResult, balancedWordsCounter.count(input));
        } catch (RuntimeException exception) {
            System.out.println("Error, RuntimeException thrown");
        }
    }

     /**
      * Function testing for input = null and result = RuntimeException
      */
    @Test
    void case4Test(){
        input = null;
        try {
            Assertions.assertEquals(expectedResult, balancedWordsCounter.count(input));
        } catch (RuntimeException exception) {
            System.out.println("Error, RuntimeException thrown");
        }
    }
}