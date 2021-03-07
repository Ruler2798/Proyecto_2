package com.company;

import java.io.Serializable;

public class Alimentos implements Serializable {
    private int IdAlimento;
    private String Nombre;
    private double Vida;

    public Alimentos(int idAlimento, String nombre, double vida) {
        IdAlimento = idAlimento;
        Nombre = nombre;
        Vida = vida;
    }

    public int getIdAlimento() {
        return IdAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        IdAlimento = idAlimento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getVida() {
        return Vida;
    }

    public void setVida(double vida) {
        Vida = vida;
    }
}
