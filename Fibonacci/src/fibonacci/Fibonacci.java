/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import fibonacci.Models.FibonacciModel;

/**
 *
 * @author Mateo
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FibonacciModel set1=new FibonacciModel();
        set1.setSize(20);
        set1.showFibonacci();
    }
    
}
