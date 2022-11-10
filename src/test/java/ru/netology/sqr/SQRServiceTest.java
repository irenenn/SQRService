package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shoudCalcSqr() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calc(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudCalcSqrForSmallRangMinValues() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calc(100, 101);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudCalcSqrForSmallRangMaxValues() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calc(9800, 9801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudCalcSqrForMaxValues() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calc(100, 9801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudCalcSqrForBigNumber() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calc(100, 1_000_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudCalcSqrForInvalidParameters() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calc(300, 200);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudCalcSqrForZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calc(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudCalcSqrForNegativeNumber() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calc(-200, -300);

        Assertions.assertEquals(expected, actual);
    }

}