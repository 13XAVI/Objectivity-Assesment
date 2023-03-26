// package FirstQuestion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author t
 */
public class compareArray {
    
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] updatedArray = {2, 3, 5, 6, 7};
        int[] newElements = AddNew(originalArray, updatedArray);
        int[] removedElements = getRemoved(originalArray, updatedArray);
        System.out.println("New elements: " + Arrays.toString(newElements));
        System.out.println("Removed elements: " + Arrays.toString(removedElements));
    }
    
    public static int[] AddNew(int[] originalArray, int[] updatedArray) {
        ArrayList<Integer> newElements = new ArrayList<Integer>();
        for (int i = 0; i < updatedArray.length; i++) {
            boolean result = false;
            for (int j = 0; j < originalArray.length; j++) {
                if (updatedArray[i] == originalArray[j]) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                newElements.add(updatedArray[i]);
            }
        }
        int[] result = new int[newElements.size()];
        for (int i = 0; i < newElements.size(); i++) {
            result[i] = newElements.get(i);
        }
        return result;
    }
    
    public static int[] getRemoved(int[] originalArray, int[] updatedArray) {
        ArrayList<Integer> removedElements = new ArrayList<Integer>();
        for (int i = 0; i < originalArray.length; i++) {
            boolean result = false;
            for (int j = 0; j < updatedArray.length; j++) {
                if (originalArray[i] == updatedArray[j]) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                removedElements.add(originalArray[i]);
            }
        }
        int[] result = new int[removedElements.size()];
        for (int i = 0; i < removedElements.size(); i++) {
            result[i] = removedElements.get(i);
        }
        return result;
    }
}