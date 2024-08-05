import java.util.Scanner;
public class Conditional_constructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usernum = scanner.nextInt();

        switch (usernum) { // после каждого условия если мы проверяем условие нужно писать break;
            // Если не писать будет выполняться дальше
            case 1:
                System.out.println("Было передано 1");
            case 131223:
                System.out.println("Выполнился вторый case");
            default: System.out.println("hipo"); // Если не прописать default то программа просто остановиться на первой строке; (как ошибка)
        }

        Scanner scanner1 = new Scanner(System.in);
        int usernum1 = scanner.nextInt();

        switch (usernum1) { // после каждого условия если мы проверяем условие нужно писать break;
            // Если не писать будет выполняться дальше
            case 1:
                System.out.println("Было передано 1");
                break;
            case 131223:
                System.out.println("Выполнился второй case");
                break;
            default: System.out.println("hipo"); // после default break не пишем
        }
    }
}