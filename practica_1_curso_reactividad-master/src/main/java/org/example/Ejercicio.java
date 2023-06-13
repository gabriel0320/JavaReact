package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio implements Descuento  {

    /**
     * 1. Con la intención de encontrar el número mayor en una lista y a su vez el número menor, cree un método que le permita
     * estas dos funciones, siguiendo los principios de las funciones puras.
     * */
      public void ejemplo1(){
       List<Integer> lista = new ArrayList();
       lista.add(10);
       lista.add(8);
       lista.add(6);
       lista.add(28);
          System.out.println("El mayor es: "+largestNumber(lista));
          System.out.println("El menor es: "+smallestNumber(lista));
      }


    // create a method that returns the largest number in a list in lambda function
    public int largestNumber(List<Integer> lista){
        int max = lista.stream().max((x,y)->x.compareTo(y)).get();
        return max;
    }
    // create a method that returns the smallest number in a list in lambda function
    public int smallestNumber(List<Integer> lista){
        int min = lista.stream().min((x,y)->x.compareTo(y)).get();
        return min;
    }
    // create a method that returns the largest number in a list in method reference
    public int largestNumberMethodReference(List<Integer> lista){
        int max = lista.stream().max(Integer::compare).get();
        return max;
    }
    // create a method that returns the smallest number in a list in method reference
    public int smallestNumberMethodReference(List<Integer> lista){
        int min = lista.stream().min(Integer::compare).get();
        return min;
    }
    // create a method that returns the largest number in a list in pure function
    public int largestNumberPureFunction(List<Integer> lista){
        int max = lista.stream().max((x,y)->x.compareTo(y)).get();
        return max;
    }
    // create a method that returns the smallest number in a list in pure function
    public int smallestNumberPureFunction(List<Integer> lista){
        int min = lista.stream().min((x,y)->x.compareTo(y)).get();
        return min;
    }

    @Override
    public Double descuento(Double total, Double porcentaje) {
        return null;
    }


    /**
     * 3. Necesitamos calcular el iva de una venta, para esto es necesario que usted cree un método
     * Tendremos dos escenarios posibles, en el primero se le pasará únicamente el valor al cual se le debe
     * aplicar el iva, sin especificar el porcentaje, en este caso se debe aplicar un 21% siempre.
     * En el segundo escenario se le pasará tanto el precio de la venta como el porcentaje de iva.
     * Cree una sola función que pueda lograr estos dos propósitos
     * */

    //create lambda function that returns the iva of a sale
   /* public double calcularIva(double totalValue, Double IvaPercent){
        Iva iva = (total,porcentaje) -> total * porcentaje;
        System.out.println(iva.iva(totalValue, IvaPercent));
        return totalValue;
    }
*/




}
