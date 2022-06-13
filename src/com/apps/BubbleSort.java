package com.apps;

import java.util.List;

 /**
 * Public class sorting numbers using "bubble sort" algorithm
 *
 * @author: Sebastian Przeliorz
 * @version 1.0
 */
public class BubbleSort {

         /**
          * Private function sorting numbers using "Bubble sort" algorithm
          *
          * @param input List type String of data given to sort
          * @return Returns sorted data
          */
        private List<String> bubble(List<String> input){
                String temp;
                Boolean sorted = false;
                while (!sorted){
                        sorted = true;
                        for (int i = 0; i < input.size()-1; i++){
                                if (input.get(i) == null) {input.remove(i); continue; }
                                if (input.get(i).compareTo(input.get(i + 1)) > 0) {
                                        sorted = false;
                                        temp = input.get(i);
                                        input.set(i, input.get(i + 1));
                                        input.set(i + 1, temp);
                                }
                        }
                }
                return input;
        }

         /**
          * Sorting public function running function bubble and returning sorted numbers
          *
          * @param input List type String of data given to sort
          * @return Returns sorted data
          * @throws RuntimeException Throws exception if given input is empty
          */
        public List<String> sort(List<String> input) throws RuntimeException{
                if (input.equals(null)) {
                        throw new RuntimeException();
                }
                input = bubble(input);
                return input;
        }
}