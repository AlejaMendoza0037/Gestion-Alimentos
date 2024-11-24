package com.example.GestionAlimentos.models;

import lombok.Data;

@Data
public class FrutaVerdura extends Alimento{
    private String color;
    private boolean esOrganico;
    private double contenidoVitamina;
    private boolean necesitaRefrigeracion;


    @Override
    public void mostrarInfoNutricional() {
        System.out.println("Informacion nutricional de :  "+getNombre());

    }

    @Override
    public boolean esSaludable() {

        return getCalorias()<100 &&contenidoVitamina>20;
    }

    @Override
    public double calcularCostoPorcion(double cantidad) {
        return cantidad*getPrecioUnidad();
    }
}
