package ru.netology.javaqa.javaqa_qa6.services;

public class SQRService {
    public int interval(int begin, int end) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= begin && i * i <= end) {
                count++;
            }
        }
        return count;
    }
}
