package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {

        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        String[] minusDuplicates = new String[0];
        String[] arr;
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] removeExact = new String[0];
        int occurrences = 0;

        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    occurrences++;
                }
            }
            if (occurrences != exactNumberOfDuplications) {
                String[] arr = Arrays.copyOf(removeExact, removeExact.length +1);
                arr[arr.length -1] = array[i];
                removeExact = arr;
            }
            occurrences = 0;
        }
        return removeExact;
    }
}
