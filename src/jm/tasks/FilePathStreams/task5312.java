package jm.tasks.FilePathStreams;
/**
 * Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных
 * чисел с точностью до шестого знака после запятой. Числом считается последовательность символов, отделенная от
 * окружающего текста пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.
 *
 * На этот раз вам надо написать программу полностью, т.е. объявить  публичный класс с именем Main  и точку входа в
 * программу — метод  main. И добавить все необходимые импорты
 *
 *
 * import java.io.*;
 * import java.nio.*;
 * import java.util.*;
 *
 * Пример ввода 1: 1 2 3
 * Пример вывода 1: 6.000000
 *
 *
 * Пример ввода 2: a1 b2 c3
 * Пример вывода 2: 0.000000
 *
 *
 * Пример ввода 3:  -1e3 18 .111 11bbb
 * Пример вывода 3: -981.889000
 *
 *
 * Требования:
 * 1. Программа должна читать текст из System.in
 * 2. Программа должна выводить число с точностью до 6 знака после запятой
 */

import java.io.*;
import java.nio.*;
import java.util.*;

public class task5312 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                sum += Double.parseDouble(sc.next());
            } else {
                sc.next();
            }
        }
        System.out.printf("%.6f", sum);
    }
}
