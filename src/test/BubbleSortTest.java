package test;

import com.apps.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

 /**
 * Public test class for BubbleSort class
 *
 * @author: Sebastian Przeliorz
 * @version 1.0
 */
public class BubbleSortTest {

     /**
      *  String list used as input in classes
      */
    List<String> input = new ArrayList<>();

     /**
      * String list used as expectedResult returned by classes
      */
    List<String> expectedResult = new ArrayList<>();

     /**
      * Object of BubbleSort class
      */
    BubbleSort bubbleSort = new BubbleSort();

     /**
      * Function testing for input = [1,4,5,6,8,3,8] and result = [1,3,4,5,6,8,8]
      */
    @Test
    void case1Test(){
        input.add("1");
        input.add("4");
        input.add("5");
        input.add("6");
        input.add("8");
        input.add("3");
        input.add("8");
        expectedResult.add("1");
        expectedResult.add("3");
        expectedResult.add("4");
        expectedResult.add("5");
        expectedResult.add("6");
        expectedResult.add("8");
        expectedResult.add("8");
        try {
            Assertions.assertEquals(expectedResult, bubbleSort.sort(input));
        } catch (RuntimeException exception) {
            System.out.println("Error, RuntimeException thrown");
        }
    }

     /**
      * Function testing for input = [-9.3,0.2,4,0.1,5,9] and result = [-9.3,0.1,0.2,4,5,9]
      */
    @Test
    void case2Test(){
        input.add("-9.3");
        input.add("0.2");
        input.add("4");
        input.add("0.1");
        input.add("5");
        input.add("9");
        expectedResult.add("-9.3");
        expectedResult.add("0.1");
        expectedResult.add("0.2");
        expectedResult.add("4");
        expectedResult.add("5");
        expectedResult.add("9");
        try {
            Assertions.assertEquals(expectedResult, bubbleSort.sort(input));
        } catch (RuntimeException exception) {
            System.out.println("Error, RuntimeException thrown");
        }
    }

     /**
      * Function testing for input = [] and result = []
      */
    @Test
    void case3Test(){
        try {
            Assertions.assertEquals(expectedResult, bubbleSort.sort(input));
        } catch (RuntimeException exception) {
            System.out.println("Error, RuntimeException thrown");
        }
    }

     /**
      * Function testing for input = [null,5.0001] and result = [5.0001]
      */
    @Test
    void case4Test(){
        input.add(null);
        input.add("5.0001");
        expectedResult.add("5.0001");
        try {
            Assertions.assertEquals(expectedResult, bubbleSort.sort(input));
        } catch (RuntimeException exception) {
            System.out.println("Error, RuntimeException thrown");
        }
    }

     /**
      * Function testing for input = null and result = RuntimeException
      */
    @Test
    void case5Test(){
        input = null;
        try {
            Assertions.assertEquals(expectedResult, bubbleSort.sort(input));
        } catch (RuntimeException exception) {
            System.out.println("Error, RuntimeException thrown");
        }
    }
}
