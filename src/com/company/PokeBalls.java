package com.company;

import java.io.Serializable;

public class PokeBalls implements Serializable {
    private int IdPokeballs;
    private String Tipo;

    public PokeBalls(int idPokeballs, String tipo) {
        IdPokeballs = idPokeballs;
        Tipo = tipo;
    }

    public int getIdPokeballs() {
        return IdPokeballs;
    }

    public void setIdPokeballs(int idPokeballs) {
        IdPokeballs = idPokeballs;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
