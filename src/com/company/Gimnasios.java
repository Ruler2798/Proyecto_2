package com.company;

import java.io.Serializable;

public class Gimnasios implements Serializable {
    private int IdGimnasio;
    private String Lugar;

    public Gimnasios(int idGimnasio, String lugar) {
        IdGimnasio = idGimnasio;
        Lugar = lugar;
    }

    public int getIdGimnasio() {
        return IdGimnasio;
    }

    public void setIdGimnasio(int idGimnasio) {
        IdGimnasio = idGimnasio;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }
}
