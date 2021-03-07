package com.company;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CargarDatos {
    private Object pokemons;
    private Object alimentos;
    private Object entrenadores;
    private Object pokeballs;
    private Object gimnasios;
    private Object pelears;
    private Object food;
    private Object asignarPokeballs;

    public void cargar_pokemons() {
        try {
            FileInputStream fileInputStream = new FileInputStream("Pokemons.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Pokemons pokemons = (Pokemons) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   public void cargar_alimentos(){
       try {
           FileInputStream fileInputStream = new FileInputStream("Alimentos.rur");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           Alimentos alimentos = (Alimentos) objectInputStream.readObject();
           objectInputStream.close();
           fileInputStream.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   public void cargar_entrenadores(){
       try {
           FileInputStream fileInputStream = new FileInputStream("Entrenadores.rur");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           Entrenadores entrenadores = (Entrenadores) objectInputStream.readObject();
           objectInputStream.close();
           fileInputStream.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   public void cargar_pokeball(){
       try {
           FileInputStream fileInputStream = new FileInputStream("Pokeballs.rur");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           PokeBalls pokeBalls = (PokeBalls) objectInputStream.readObject();
           objectInputStream.close();
           fileInputStream.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   public void cargar_gimnasio(){
       try {
           FileInputStream fileInputStream = new FileInputStream("Gimnasios.rur");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           Gimnasios gimnasios = (Gimnasios) objectInputStream.readObject();
           objectInputStream.close();
           fileInputStream.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   public void cargar_pelea(){
       try {
           FileInputStream fileInputStream = new FileInputStream("Peleas.rur");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           Pelear pelears = (Pelear) objectInputStream.readObject();
           objectInputStream.close();
           fileInputStream.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   public void cargar_asigAlimentos(){
       try {
           FileInputStream fileInputStream = new FileInputStream("Alimentos Asignados.rur");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           AsignarAlimentos food = (AsignarAlimentos) objectInputStream.readObject();
           objectInputStream.close();
           fileInputStream.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   public void cargar_asigPokeballs(){
       try {
           FileInputStream fileInputStream = new FileInputStream("Pokeballs Asignadas.rur");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           AsignarPokeball asignarPokeballs = (AsignarPokeball) objectInputStream.readObject();
           objectInputStream.close();
           fileInputStream.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   }


}
