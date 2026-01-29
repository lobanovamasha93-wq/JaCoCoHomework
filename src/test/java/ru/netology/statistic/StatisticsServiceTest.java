package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax_MaxValueNotAtStart() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {5, 3, 8, 2, 1}; // максимум (8) не в начале
        long expected = 8;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}
