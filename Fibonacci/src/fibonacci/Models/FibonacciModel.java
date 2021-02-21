/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateo
 */
public class FibonacciModel {

    private int size;
    private List<Integer> listFibonacci= new ArrayList<Integer>();

    public FibonacciModel(int size, List<Integer> listFibonacci) {
        this.size = size;
        this.listFibonacci = listFibonacci;
    }

    public List<Integer> getListFibonacci() {
        return listFibonacci;
    }

    public void setListFibonacci(List<Integer> listFibonacci) {
        this.listFibonacci = listFibonacci;
    }

    public FibonacciModel() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void fibonacci(int num) {
        if (num > 1) {
            listFibonacci.add(listFibonacci.get(num-1)+listFibonacci.get(num-2));
        } else if (num == 1) {
            listFibonacci.add(1);
        } else if (num == 0) {
            listFibonacci.add(0);
        } else {
            System.out.println("El tamaño debe ser igual o superior a 1");
        }
    }
    public void showFibonacci(){
        for(int i=0;i< this.size; i++){
            fibonacci(i);
            System.out.println(this.listFibonacci.get(i)+", ");
        }
    }

}
