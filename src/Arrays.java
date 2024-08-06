public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[5]; // пустой массив с 5 элементов
        float[] array2 = new float[] {5.0f, 6.45f, 33.43f}; // установка значений при создании массива

        for (byte i = 0; i < array2.length; i++) { // i < array2.length
            System.out.println("Element: " + array2[i]);
        }

        System.out.println("///////////////////////////");

        char[][] array3 = new char[2][3]; // 2 мелких массива по 3 элемента (первое это строка второе столбец)
        array3[0][0] = 't';
        array3[0][1] = 'a';
        array3[0][2] = 'm';
        array3[1][0] = 'm';
        array3[1][1] = 'o';
        array3[1][2] = 'n';

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.println(array3[i][j]);
            }
        }

        byte[][] array4 = new byte[][] { // установка значений при создании двумерного массива
                {5, 5},
                {3, 2},
                {1, 4}
        };
    }
}
