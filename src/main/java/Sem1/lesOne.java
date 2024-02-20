package Sem1;

public class lesOne {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };


        System.out.println(foo(ints));
    }

    private static int foo(int[][] ints) {
        /** Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
         Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
         метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
         */
        int size = ints.length;
        int sum = 0;
        try {
            for (int i = 0; i < size; i++) {
                if (ints[i].length != size) {
                    throw new RuntimeException("Invalid size of row_i: " + (i + 1) +
                            "\nints[i].length = " + ints[i].length + ", array_size = " + size);
                }
                for (int j = 0; j < ints[i].length; j++) {
                    //System.out.printf("%d ", ints[i][j]);
                    if (ints[i][j] != 0 && ints[i][j] != 1) {
                        throw new IllegalArgumentException("Invalid data at position " + (i + 1) + "," + (j + 1)); //
                    } else {
                        sum += ints[i][j];
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
}
