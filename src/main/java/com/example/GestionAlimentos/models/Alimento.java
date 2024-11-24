package com.example.GestionAlimentos.models;


import lombok.Data;

@Data//lombock para no escribir getters y setters
public abstract class Alimento implements InformacionAlimento {
    private String nombre;
    private double calorias;
    private String origen;
    private double precioUnidad;

    @Override
    public abstract void mostrarInfoNutricional();
    @Override
    public abstract boolean esSaludable();
    @Override
    public abstract double calcularCostoPorcion(double cantidad);

}
