import java.util.Scanner;
public class Math_operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short num1 = 50, num2 = 10; // тут можно использовать разные так как результат всё равно целое число
        int res  = num1 + num2;

        System.out.println(res);

        float num3 = 50, num4 = 33; // должны быть одинаковые типы объявляемых и делимых данных →
        float res1  = num3 / num4;  // в нашем случае float
        System.out.println(res1); // Если int бедут 1 Если int и float будет 1.0
        // То есть если хотим получить нужный тип данных нужный нужно и использовать

        float res2 = num3 % num4;
        System.out.println(res2);
    }

}
