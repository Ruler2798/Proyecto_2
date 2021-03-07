package com.company;

import java.io.Serializable;

public class Pokemons implements Serializable {
    private int IdPokemon;
    private String Tipo;
    private String Nombre;
    private double Vida;
    private double PuntosdeAtaque;
    private boolean Capturado;
    private boolean Estado;

    public Pokemons(int idPokemon, String tipo, String nombre, double vida, double puntosdeAtaque, boolean capturado, boolean estado) {
        IdPokemon = idPokemon;
        Tipo = tipo;
        Nombre = nombre;
        Vida = vida;
        PuntosdeAtaque = puntosdeAtaque;
        Capturado = capturado;
        Estado = estado;
    }

    public int getIdPokemon() {
        return IdPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        IdPokemon = idPokemon;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
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

    public double getPuntosdeAtaque() {
        return PuntosdeAtaque;
    }

    public void setPuntosdeAtaque(double puntosdeAtaque) {
        PuntosdeAtaque = puntosdeAtaque;
    }

    public boolean isCapturado() {
        return Capturado;
    }

    public void setCapturado(boolean capturado) {
        Capturado = capturado;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }
}





