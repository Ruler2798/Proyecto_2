package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Menu {

    private Pokemons[] pokemons;
    private Entrenadores[] entrenadores;
    private PokeBalls[] pokeBalls;
    private Gimnasios[] gimnasios;
    private Alimentos[] alimentos;
    private AsignarPokeball[] asignarPokeballs;
    private Pelear[] pelears;
    private AsignarAlimentos[] food;

    public Menu() {
        pokemons = new Pokemons[150];
        entrenadores = new Entrenadores[25];
        pokeBalls = new PokeBalls[4];
        gimnasios = new Gimnasios[25];
        alimentos = new Alimentos[15];
        asignarPokeballs = new AsignarPokeball[5];
        pelears = new Pelear[3];
        food = new AsignarAlimentos[3];
    }

    public void menuGeneral() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("     Pokemon Game Ruler ϞϞ(๑⚈ ․̫ ⚈๑)∩     ");
            System.out.println("1  Ingrese Pokemons");
            System.out.println("2  Ingrese Entrenadores");
            System.out.println("3  Ingrese PokeBalls");
            System.out.println("4  Ingrese Gimnasios");
            System.out.println("5  Ingrese Alimentos");
            System.out.println("6  Asignar Pokeball");
            System.out.println("7  Asignar Alimentos");
            System.out.println("8  Generar Pelea");
            System.out.println("9  Guardar Datos");
            System.out.println("10 Cargar Datos");
            System.out.println("11 Generar Reporte");
            System.out.println("12 Salir");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    archivos_pokemon();
                    //declarar accion
                    break;
                case 2:
                    archivos_entrenadores();
                    //declarar accion
                    break;
                case 3:
                    archivos_pokeball();
                    //declarar accion
                    break;
                case 4:
                    archivos_gimnasios();
                    //declarar acion
                    break;
                case 5:
                    archivos_alimentos();
                    //declarar accion
                    break;
                case 6:
                    archivos_AsignarPokeball();
                    //declarar accion
                    break;
                case 7:
                    archivos_AsignarAlimentos();
                    //declarar accion
                    break;
                case 8:
                    archivos_pelea();
                    //declarar accion
                    break;
                case 9:
                    GuardarDatos guardarDatos = new GuardarDatos();
                    guardarDatos.guardar_pokemons();
                    guardarDatos.guardar_entrenadores();
                    guardarDatos.guardar_alimentos();
                    guardarDatos.guardar_pokeballs();
                    guardarDatos.guardar_gimnasios();
                    guardarDatos.guardar_pelea();
                    guardarDatos.guardar_asigPokeball();
                    guardarDatos.guardar_asigAlimentos();
                    //declarar accion
                    break;
                case 10:
                    CargarDatos cargarDatos = new CargarDatos();
                    cargarDatos.cargar_pokemons();
                    cargarDatos.cargar_entrenadores();
                    cargarDatos.cargar_alimentos();
                    cargarDatos.cargar_pokeball();
                    cargarDatos.cargar_gimnasio();
                    cargarDatos.cargar_pelea();
                    cargarDatos.cargar_asigPokeballs();
                    cargarDatos.cargar_asigAlimentos();

                    //declarar accion
                    break;
                case 11:
                    MenuReporte menuReporte = new MenuReporte();
                    menuReporte.menuR();
                    //declarar accion
                    break;
                case 12:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalidad; ingrese nuevamente");
            }
        }
    }

    public void archivos_pokemon() {
        System.out.println("Ingrese la ruta del archivo");
        Scanner lector = new Scanner((System.in));
        File archivo = new File(lector.nextLine());
        try {
            lector = new Scanner(archivo);
            lector.nextLine();
            int contadorPokemons = 0;
            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(",");
                pokemons[contadorPokemons] = new Pokemons(Integer.parseInt(datos[0]), datos[1], datos[2], Double.parseDouble(datos[3]), Double.parseDouble(datos[4]), Boolean.parseBoolean(datos[5]), Boolean.parseBoolean(datos[6]));
                System.out.println(pokemons[contadorPokemons].getNombre() + " Pokemon creado");
                contadorPokemons++;
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("La ruta no ha sido encontrada");
            e.printStackTrace();
        }
    }

    public void archivos_entrenadores() {
        System.out.println("Ingrese la ruta del archivo");
        Scanner lector = new Scanner((System.in));
        File archivo = new File(lector.nextLine());
        try {
            lector = new Scanner(archivo);
            lector.nextLine();
            int contadorEntrenador = 0;
            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(",");
                entrenadores[contadorEntrenador] = new Entrenadores(Integer.parseInt(datos[0]), datos[1]);
                System.out.println(entrenadores[contadorEntrenador].getNombre() + " Entrenador creado");
                contadorEntrenador++;
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("La ruta no ha sido encontrada");
            e.printStackTrace();
        }
    }

    public void archivos_pokeball() {
        System.out.println("Ingrese la ruta del archivo");
        Scanner lector = new Scanner((System.in));
        File archivo = new File(lector.nextLine());
        try {
            lector = new Scanner(archivo);
            lector.nextLine();
            int contadorPokeball = 0;
            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(",");
                pokeBalls[contadorPokeball] = new PokeBalls(Integer.parseInt(datos[0]), datos[1]);
                System.out.println(pokeBalls[contadorPokeball].getTipo() + " PokeBall creada");
                contadorPokeball++;
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("La ruta no ha sido encontrada");
            e.printStackTrace();
        }
    }

    public void archivos_gimnasios() {
        System.out.println("Ingrese la ruta del archivo");
        Scanner lector = new Scanner((System.in));
        File archivo = new File(lector.nextLine());
        try {
            lector = new Scanner(archivo);
            lector.nextLine();
            int contadorGimnasio = 0;
            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(",");
                gimnasios[contadorGimnasio] = new Gimnasios(Integer.parseInt(datos[0]), datos[1]);
                System.out.println(gimnasios[contadorGimnasio].getLugar() + " Gimnasio creado");
                contadorGimnasio++;
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("La ruta no ha sido encontrada");
            e.printStackTrace();
        }
    }

    public void archivos_alimentos() {
        System.out.println("Ingrese la ruta del archivo");
        Scanner lector = new Scanner((System.in));
        File archivo = new File(lector.nextLine());
        try {
            lector = new Scanner(archivo);
            lector.nextLine();
            int contadorAlimentos = 0;
            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(",");
                alimentos[contadorAlimentos] = new Alimentos(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]));
                System.out.println(alimentos[contadorAlimentos].getNombre() + " Alimento creado");
                contadorAlimentos++;
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("La ruta no ha sido encontrada");
            e.printStackTrace();
        }
    }

    public void archivos_pelea() {
        System.out.println("Ingrese la ruta del archivo");
        Scanner lector = new Scanner((System.in));
        File archivo = new File(lector.nextLine());
        try {
            lector = new Scanner(archivo);
            lector.nextLine();
            int contadorPelea = 0;
            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(",");
                pelears[contadorPelea] = new Pelear(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Integer.parseInt(datos[2]));
                System.out.println(pelears[contadorPelea] + " Pelea generada");
                contadorPelea++;
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("La ruta no ha sido encontrada");
            e.printStackTrace();
        }
    }

    public void archivos_AsignarPokeball() {
        System.out.println("Ingrese la ruta del archivo");
        Scanner lector = new Scanner((System.in));
        File archivo = new File(lector.nextLine());
        try {
            lector = new Scanner(archivo);
            lector.nextLine();
            int contadorAsiginarPokeball = 0;
            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(",");
                asignarPokeballs[contadorAsiginarPokeball] = new AsignarPokeball(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]));
                System.out.println(asignarPokeballs[contadorAsiginarPokeball].getIdPokeball() + " Pokeball creada");
                contadorAsiginarPokeball++;
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("La ruta no ha sido encontrada");
            e.printStackTrace();
        }
    }

    public void archivos_AsignarAlimentos() {
        System.out.println("Ingrese la ruta del archivo");
        Scanner lector = new Scanner((System.in));
        File archivo = new File(lector.nextLine());
        try {
            lector = new Scanner(archivo);
            lector.nextLine();
            int contadorAsignaralimentos = 0;
            while (lector.hasNextLine()) {
                String[] datos = lector.nextLine().split(",");
                food[contadorAsignaralimentos] = new AsignarAlimentos(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Integer.parseInt(datos[2]));
                System.out.println(food[contadorAsignaralimentos].getIdActividad() + " Actividad creada");
                contadorAsignaralimentos++;
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("La ruta no ha sido encontrada");
            e.printStackTrace();
        }
    }



}



