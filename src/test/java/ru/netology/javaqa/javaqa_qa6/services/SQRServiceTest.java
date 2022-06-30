package ru.netology.javaqa.javaqa_qa6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/interval.csv")
    public void normInterval(int expected, int begin, int end) {
        SQRService service = new SQRService();
//        int expected = 3;
        int actual = service.interval(begin, end);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void smallInterval() {
//        SQRService service = new SQRService();
//        int expected = 0;
//        int actual = service.interval(0, 0);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void startBorderInterval() {
//        SQRService service = new SQRService();
//        int expected = 89;
//        int actual = service.interval(0, 9_800);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void finishBorderInterval() {
//        SQRService service = new SQRService();
//        int expected = 90;
//        int actual = service.interval(0, 9_802);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void bigInterval() {
//        SQRService service = new SQRService();
//        int expected = 90;
//        int actual = service.interval(0, 100_000_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void littleBigInterval() {
//        SQRService service = new SQRService();
//        int expected = 1;
//        int actual = service.interval(0, 101);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void littleSmallInterval() {
//        SQRService service = new SQRService();
//        int expected = 0;
//        int actual = service.interval(0, 99);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void negativeInterval() {
//        SQRService service = new SQRService();
//        int expected = 0;
//        int actual = service.interval(-100, 99);
//
//        Assertions.assertEquals(expected, actual);
//    }
}

