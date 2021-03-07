package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GuardarDatos {

    private Object Pokemons[];
    private Object alimentos;
    private Object entrenadores;
    private Object pokeballs;
    private Object gimnasios;
    private Object pelears;
    private Object food;
    private Object asignarPokeballs;

    public void guardar_pokemons() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Pokemons.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(Pokemons);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void guardar_alimentos() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Alimentos.rur");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(alimentos);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void guardar_entrenadores() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Entrenadores.rur");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(entrenadores);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void guardar_pokeballs() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Pokeballs.rur");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(pokeballs);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void guardar_gimnasios() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Gimnasios.rur");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(gimnasios);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void guardar_pelea() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Peleas.rur");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(pelears);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void guardar_asigAlimentos() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Alimentos Asignados.rur");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(food);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void guardar_asigPokeball (){
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("Pokeballs Asignadas.rur");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(asignarPokeballs);
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
