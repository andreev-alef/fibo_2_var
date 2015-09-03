/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

import java.io.PrintWriter;

/**
 *
 * @author alef
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
//        pw.format("Количество аргументов: %s\n", args.length);

        float x = 0, y = 1;
        int N = 10, i = 1;
        if (args.length == 0) {
            pw.println("Справка по командам.");
            pw.println("java -jar fibo.jar <первое число> <второе число> <длина последовательности>");
            pw.println("Пример запуска:");
            pw.println("java -jar fibo.jar 0 1 10");
        } else {
            for (i = 1; i < N; i++) {
                if (x <= y) {
                    x = x + y;
                    pw.println(x);

                } else {
                    y = x + y;
                    pw.println(y);
                }
            }
        }
    }
}
