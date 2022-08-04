package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { 12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12 };

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxInMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { 12, 5, 8, 13, 5, 3, 8, 6, 11, 11, 12 };

        long expected = 13;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIf0() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { 0, 0, 0, 0 };

        long expected = 0;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxInEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { 2, 1, 6, 3, 10 };

        long expected = 10;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
