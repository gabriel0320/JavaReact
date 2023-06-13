package org.example;

public interface Iva {
    Double iva(Double total, Double porcentaje);

    static Double iva(Double total) {
        return total * 0.19;
    }
}
