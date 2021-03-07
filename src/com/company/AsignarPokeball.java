package com.company;

import java.io.Serializable;

public class AsignarPokeball implements Serializable {
    private int IdPokeball;
    private int IdEntrenador;

    public AsignarPokeball(int idPokeball, int idEntrenador) {
        IdPokeball = idPokeball;
        IdEntrenador = idEntrenador;
    }

    public int getIdPokeball() {
        return IdPokeball;
    }

    public void setIdPokeball(int idPokeball) {
        IdPokeball = idPokeball;
    }

    public int getIdEntrenador() {
        return IdEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        IdEntrenador = idEntrenador;
    }
}
