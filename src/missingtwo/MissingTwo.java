/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingtwo;

import java.security.InvalidParameterException;

/**
 *
 * @author matt
 */
public class MissingTwo {

    public int[] findMissingPair(int[] input, int maxValue) {
        throwIfInvalid(input, maxValue);

        int firstMissingElement = 0;
        int secondMissingElement = 0;
        int expectedValue = 1;
        int inputIndex = 0;
        
        while (expectedValue <= maxValue) {
            if (inputIndex >= input.length-1){
                inputIndex = input.length-1;
            }
            int arrayElement = input[inputIndex];
            if (expectedValue != arrayElement) {
                if (firstMissingElement > 0) {
                    secondMissingElement = expectedValue;
                    break;
                } else {
                    firstMissingElement = expectedValue;
                    inputIndex--;
                }
            }
            expectedValue++;
            inputIndex++;
        }
        return new int[]{firstMissingElement, secondMissingElement};
    }

    private void throwIfInvalid(int[] input, int maxValue) {
        if (input == null || input.length < 2 || input[0] < 1 || input[input.length - 1] > maxValue) {
            throw new InvalidParameterException();
        }
        if (maxValue < 2 || maxValue > input.length + 2) {
            throw new InvalidParameterException();
        }
    }

}
