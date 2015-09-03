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

        int N = 10, i = 1, x = 0, y = 1;
        if (args.length == 0) {
            pw.println("Справка по командам.");
            pw.println("java -jar fibo.jar <первое число> <второе число> <длина последовательности>");
            pw.println("Пример запуска:");
            pw.println("java -jar fibo.jar 0 1 10");
        } else {

            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            N = Integer.parseInt(args[2]);

            for (i = 1; i < N; i++) {
                if (x <= y) {
                    x = x + y;
                    pw.format("i = %d; F = %d\r\n", i, x);
                } else {
                    y = x + y;
                    pw.format("i = %d; F = %d\r\n", i, y);
                }
            }
        }
    }
}
