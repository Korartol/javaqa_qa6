import ru.netology.javaqa.javaqa_qa6.services.SQRService;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int x = 100;
        int y = 100;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                count++;
                System.out.println("Квадарат числа: " + i);
            }
        }
        System.out.println("всего таких числе: " + count);

//        SQRService service = new SQRService();
//
//        int expected = 3;
//        int actual = service.interval(0, 10000);
//        System.out.println(expected + " == ? == " + actual);
//        System.out.println("Всего таких чисел: " + actual);

    }
}