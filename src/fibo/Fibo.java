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
        pw.format("%s", args[0]);
    }
}
