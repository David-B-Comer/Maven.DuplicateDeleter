package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {

        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] minusDuplicates = new Integer[0];
        Integer[] arr;
        int occurrences = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    occurrences++;
                }
            }
            if (occurrences < maxNumberOfDuplications) {
                arr = Arrays.copyOf(minusDuplicates, minusDuplicates.length+1);
                arr[arr.length-1] = array[i];
                minusDuplicates = arr;
            }
            occurrences = 0;
        }
        return minusDuplicates;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] removeExact = new Integer[0];
        int occurrences = 0;

        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    occurrences++;
                }
            }
            if (occurrences != exactNumberOfDuplications) {
                Integer[] arr = Arrays.copyOf(removeExact, removeExact.length +1);
                arr[arr.length -1] = array[i];
                removeExact = arr;
            }
            occurrences = 0;
        }
        return removeExact;
    }
}
