package org.example;

public class Ejercicio3 implements Iva{
    @Override
    public Double iva(Double total, Double porcentaje) {
        return null;
    }

    //create lambda function that returns the iva of a sale
    public double calcularIva(double totalValue, double percent){
        Iva iva = (total, porcentaje) -> total * porcentaje;
        System.out.println(iva.iva(totalValue, percent));
        return totalValue;
    }

    public double calcularIva(double totalValue){
        System.out.println(Iva.iva(totalValue));
        return totalValue;
    }
}
