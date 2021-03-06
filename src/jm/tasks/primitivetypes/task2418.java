package jm.tasks.primitivetypes;

import java.util.Arrays;

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
 *
 * Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
 *
 * К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 *
 * Пример ввода: {0, 2, 2} и {1, 3}
 * Пример вывода: {0, 1, 2, 2, 3}
 *
 * Требования:
 * Cигнатура метода должна быть: mergeArrays(int[] a1, int[] a2)
 */
public class task2418 {
    public static void main(String[] args) {
        int[] a = {0, 2, 2};
        int[] b = {1, 3};
        System.out.println(Arrays.toString(mergeArrays(a, b)));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        // Решил не по условию
//        int[] mergeNumbers = Arrays.copyOf(a1,a1.length + a2.length);
//        System.arraycopy(a2, 0, mergeNumbers, a1.length, a2.length);
//        Arrays.sort(mergeNumbers);

        /*
        1) y == a2.length
            Это означает что мы выбрали все элементы из второго массива и поэтому мы можем добирать только из первого
            ИЛИ
            2) x < a1.length && a1[x] <= a2[y]
            Попадая под эту часть условия мы уже наверняка знаем что во втором массиве еще есть элементы (y == a2.length было false,
            значит y еще в пределах размера массива)
            Удостоверимся что и в первом массиве еще есть элементы x < a1.length
            Если это выполняется тогда мы все еще в пределах двух массивов и значит нужно взять тот который меньше a1[x] <= a2[y]
            В противном случае добираем элементы из второго массива (гарантированно они там еще есть потому что мы не прошли по первому условию)
         */
        int[] mergeNumbers = new int[a1.length + a2.length];
        int x = 0;
        int y = 0;
        for (int i = 0; i < mergeNumbers.length; i++) {
            if ((y == a2.length) || (x < a1.length) && (a1[x] <= a2[y])) {
                mergeNumbers[i] = a1[x++];
            } else {
                mergeNumbers[i] = a2[y++];
            }
        }
        return mergeNumbers;
    }
}

