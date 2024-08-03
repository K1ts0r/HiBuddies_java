import java.util.Scanner;
public class Data_from_user {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Выделяем память и передаем в параметрах строку от пользователя
//        System.out.print("Введите ваше имя: ");
//        String name = scanner.nextLine(); //Читает строку от пользователя и записиваес в переменную
//        System.out.println("Привет, " + name);

        int num1 = scanner.nextInt(); // Переводит данные в число
        byte num2 = scanner.nextByte();  // Переводит данные в тип байт
        // и так далее ...

    }
}
