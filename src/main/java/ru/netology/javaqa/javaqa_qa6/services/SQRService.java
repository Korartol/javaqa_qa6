package ru.netology.javaqa.javaqa_qa6.services;

public class SQRService {
    public int interval(int begin, int end) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (end >= 100) {  // если конечное значение меньше минимального корня, то прервать цикл.
                if (i * i >= begin && i * i <= end) {
                    count++;
                }
            } else {
                break; // прерываем цикл, если i * i < 100
            }
        }
        return count;
    }
}
