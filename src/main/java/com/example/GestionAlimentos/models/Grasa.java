package com.example.GestionAlimentos.models;

import lombok.Data;

@Data
public class Grasa extends Alimento{

    private double porcentajeGrasa;
    private boolean esSaludable;
    private  double contenidoOmega;


    @Override
    public void mostrarInfoNutricional() {
        System.out.println("Grasa: "+ getNombre()+"Calorias: "
                + getCalorias() +"porcentaje de grasa: "+porcentajeGrasa
                + "porcentaje grasa saturada : " + (esSaludable ? "si": "no")
                + "contenido omega : "+ contenidoOmega +"mg");

    }

    @Override
    public boolean esSaludable() {
        return porcentajeGrasa< 30 && !esSaludable;
    }

    @Override
    public double calcularCostoPorcion(double cantidad) {
        return cantidad*getPrecioUnidad();
    }
}
