package com.company;

import java.io.Serializable;

public class AsignarAlimentos  implements Serializable {
    private int IdAlimento;
    private int IdActividad;
    private int IdPokemon;

    public AsignarAlimentos(int idAlimento, int idActividad, int idPokemon) {
        IdAlimento = idAlimento;
        IdActividad = idActividad;
        IdPokemon = idPokemon;
    }

    public int getIdAlimento() {
        return IdAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        IdAlimento = idAlimento;
    }

    public int getIdActividad() {
        return IdActividad;
    }

    public void setIdActividad(int idActividad) {
        IdActividad = idActividad;
    }

    public int getIdPokemon() {
        return IdPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        IdPokemon = idPokemon;
    }
}
