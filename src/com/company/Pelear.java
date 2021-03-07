package com.company;

import java.io.Serializable;

public class Pelear implements Serializable {
    private int IdGimnasio;
    private int Idpokemon1;
    private int Idpokemon2;

    public Pelear(int IdGimnasio, int Idpokemon1, int Idpokemon2) {
        this.IdGimnasio = IdGimnasio;
        this.Idpokemon1 = Idpokemon1;
        this.Idpokemon2 = Idpokemon2;
    }



    public int getIdGimnasio() {
        return IdGimnasio;
    }

    public void setIdGimnasio(int idGimnasio) {
        this.IdGimnasio = idGimnasio;
    }

    public int getIdpokemon1() {
        return Idpokemon1;
    }

    public void setIdpokemon1(int idpokemon1) {
        this.Idpokemon1 = idpokemon1;
    }

    public int getIdpokemon2() {
        return Idpokemon2;
    }

    public void setIdpokemon2(int idpokemon2) {
        this.Idpokemon2 = idpokemon2;
    }
}
