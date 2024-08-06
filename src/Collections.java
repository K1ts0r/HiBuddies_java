import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String [] args) {

        //  ArrayList // лучше для "добавил элементы и работаю с ними"

        //Работает как динамический массив данных, указывать длину не обязательно
        ArrayList<Integer>numbers = new ArrayList<>();   //int → Integer , byte → Byte ...
        numbers.add(5); // Если бы был тип Byte, то → numbers.add((byte)5);     (явное конвертирование)
        numbers.add(10);
        numbers.add(1, 50); // можно вставить в коллекцию элемент по индексу (index, element)

        System.out.println(numbers.get(0)); // вывод по индексу элемента

        numbers.remove(2); // удаление по индексу
        numbers.clear(); // удаляет все элементы коллекции

        for(Integer i : numbers){
            System.out.println(i);
        }

        //LickedList // лучше если "коллекция будет постоянно меняться"

        LinkedList<Float> floatLinkedList = new LinkedList<>();

        // всё то самое что и в ArrayList
    }
}
