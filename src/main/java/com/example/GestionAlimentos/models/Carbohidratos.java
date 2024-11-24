package com.example.GestionAlimentos.models;

import lombok.Data;

@Data
public class Carbohidratos  extends Alimento{

    private boolean esIntegral;
    private double contenidoFibra;
    private boolean contenidoGluten;






    @Override
    public void mostrarInfoNutricional() {
        System.out.println("Carbohidratos:  "
                + getNombre() +"Calorias: "
                +getOrigen() +" Es integral : "+ (esIntegral ? "si" : "No")+ "contenido de fibra : "
                + contenidoFibra + "contenido de gluten : " + (contenidoGluten ? "si " : "no "));


    }

    @Override
    public boolean esSaludable() {
        return esIntegral&& contenidoFibra>3;
    }

    @Override
    public double calcularCostoPorcion(double cantidad) {
        return cantidad*getPrecioUnidad();
    }
}
