package com.example.GestionAlimentos.models;

public interface InformacionAlimento {
    public void mostrarInfoNutricional();
    public boolean esSaludable();
    public double calcularCostoPorcion(double cantidad);
}
