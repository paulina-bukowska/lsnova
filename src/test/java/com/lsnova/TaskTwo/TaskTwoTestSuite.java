package com.lsnova.TaskTwo;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TaskTwoTestSuite {
    TaskTwo taskTwo = new TaskTwo();

    @Test
    public void shouldFetchSortedAndUniqueNum() {
        //Given
        int[] input = new int[]{3, 321, 2, 421, 5, 22567, 1, 6, 2354, 2, 6, 368, 4, 2, 1, 5, 7, 9, 8, 13, 124, 126, 464};

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(6);
        expectedResult.add(7);
        expectedResult.add(8);
        expectedResult.add(9);
        expectedResult.add(13);
        expectedResult.add(124);
        expectedResult.add(126);
        expectedResult.add(321);
        expectedResult.add(368);
        expectedResult.add(421);
        expectedResult.add(464);
        expectedResult.add(2354);
        expectedResult.add(22567);

        // When
        List result = taskTwo.fetchSortedAndUniqueNum(input);

        // Then
        Assert.assertEquals(expectedResult, result);
    }
}