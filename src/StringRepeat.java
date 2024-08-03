//Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
//
//Examples (input -> output)
//        6, "I"     -> "IIIIII"
//        5, "Hello" -> "HelloHelloHelloHelloHello"
//
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < repeat; i++){
            sb.append(string);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Тестируем метод repeatStr
        System.out.println(repeatStr(6, "I")); // Ожидаемый результат: IIIIII
        System.out.println(repeatStr(5, "Hello")); // Ожидаемый результат: HelloHelloHelloHelloHello
        System.out.println(repeatStr(3, "abc")); // Ожидаемый результат: abcabcabc
        System.out.println(repeatStr(0, "test")); // Ожидаемый результат: (пустая строка)

        StringBuilder stringBuilder = new StringBuilder("Hellp");
        stringBuilder.append("sdfjs");

        System.out.println(stringBuilder.toString() + "dfd");
    }

}
