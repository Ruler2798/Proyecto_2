package com.company;

import java.io.Serializable;

public class Entrenadores implements Serializable {
    private int IdEntrenador;
    private String Nombre;

    public Entrenadores(int idEntrenador, String nombre) {
        IdEntrenador = idEntrenador;
        Nombre = nombre;
    }

    public int getIdEntrenador() {
        return IdEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        IdEntrenador = idEntrenador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
