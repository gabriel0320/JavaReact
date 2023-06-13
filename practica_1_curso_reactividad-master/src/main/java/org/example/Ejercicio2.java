package org.example;

public class Ejercicio2 implements Descuento{
    /**
     * 2. En una tienda de ropa necesitamos aplicar un descuento a las ventas que se hacen, este descuento
     * es variable por lo que necesitamos que usted cree un método que reciba el total de la venta y el porcentaje a descontar
     * y devuelva el nuevo precio total.
     * */

    //create lambda function that returns the total price of a sale with a discount
    public double totalPriceSaleWithDiscount(double totalPrice, double discount){
        return totalPrice - (totalPrice * discount);
    }

    public double calcularDescuento(double totalValue, double percent){
        Descuento descuento = (total, porcentaje) -> total - (total * porcentaje);
        System.out.println(descuento.descuento(totalValue, percent));
        return totalValue;
    }

    @Override
    public Double descuento(Double total, Double porcentaje) {
        return null;
    }
    //create lambda function that returns the discount of a sale
    public double calcularDescuento(double totalValue, Double discountPercent){
        Descuento descuento = (total,porcentaje) -> total * porcentaje;
        System.out.println(descuento.descuento(totalValue, discountPercent));
        return totalValue;
    }
}
