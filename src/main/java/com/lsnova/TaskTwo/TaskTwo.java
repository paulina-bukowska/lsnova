package com.lsnova.TaskTwo;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// Consider following input:
// int[] input = new int[] {3,321,2,421,5,22567,1,6,2354,2,6,368,4,2,1,5,7,9,8,13,124,126,464};
// Create list that will be sorted and unique (without duplicates) using the newest Java language mechanisms.
public class TaskTwo {
    public List fetchSortedAndUniqueNum(int[] input) {
        Set<Integer> numbers = new TreeSet<>();

        for (int num : input) {
            numbers.add(num);
        }

        return numbers.stream().collect(Collectors.toList());
    }
}