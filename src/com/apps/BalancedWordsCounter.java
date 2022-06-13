package com.apps;

/**
 * Public class counting every balanced word occurring in subwords of given word
 *
 * @author: Sebastian Przeliorz
 * @version 1.0
 */
public class BalancedWordsCounter {

    /**
     * Private static variable used to navigate trough table with generated subwords
     */
    private static int index;

    /**
     * Private static function returning true if word is balanced and false if not
     *
     * @param letters char table of word to check
     * @return Returning true if word is balanced and false if not
     */
    private static boolean checkIfWordIsBalanced(char[] letters){
        int[] timesLetterOccurrence = new int[letters.length];
        if (letters.length == 1) {
            return true;
        } {
            for (int i = 0; i < letters.length; i++) {
                timesLetterOccurrence[i] = 0;
                for (int j = 0; j < letters.length; j++) {
                    if (letters[i] == letters[j]) {
                        timesLetterOccurrence[i]++;
                    }
                }
            }
            if (timesLetterOccurrence.length != 1){
                for (int i = 0; i < timesLetterOccurrence.length; i++) {
                    for (int j = 0; j < timesLetterOccurrence.length; j++) {
                        if (timesLetterOccurrence[i] != timesLetterOccurrence[j]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     * Private static function returning balanced words from given input
     *
     * @param subwords String table of subwords
     * @return Returns counted how many subwords are balanced
     */
    private static int countBalancedWords(String[] subwords){
        int counter = 0;
        for (int i = 0; i < index; i++){
            if (checkIfWordIsBalanced(subwords[i].toCharArray())){
                counter++;
            }
        }
        return counter;
    }

    /**
     * Private static function returning balanced words from given input
     *
     * @param input input word
     * @param subwords String table of subwords
     */
    private static void generateSubwords(String input, String[] subwords) {
        String s;
        index = 0;
        for(int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++){
                s = input.substring(i, j);
                if (s.length() < input.length()){
                    subwords[index] = s;
                    index++;
                }
            }
        }
    }

    /**
     * Private function generating all subwords from given word running generateSubwords function
     *
     * @param input input word
     * @return counted how many subwords are balanced
     */
    private static String[] generateAllSubwords(String input) {
        String[] subwords = new String[(int)Math.pow(2, input.length()) - 1];
        generateSubwords(input, subwords);
        return subwords;
    }

    /**
     * Counting public function running class generateAllSubwords
     *
     * @param input Given word to check how many it's subwords are balanced
     * @throws RuntimeException Throws exceptions where input is empty or no number character were given.
     */
    public int count(String input) throws RuntimeException{
        String[] subwords;
        if (input.length() == 0) {
            return 0;
        }
        for (int i = 0; i < input.length(); i++){
            if (!Character.isLetter(input.charAt(i))) {
                throw new RuntimeException();
            }
        }
        subwords = generateAllSubwords(input);
        return countBalancedWords(subwords);
    }
}