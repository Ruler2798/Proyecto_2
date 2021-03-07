package com.company;

import java.io.FileWriter;
import java.util.Scanner;

public class MenuReporte {

    private Object Entrenadores;

    public void menuR() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("     Reportes-Html     ");
            System.out.println("1 Reporte de entrenadores");
            System.out.println("2 Reporte de Pokémons salvajes:");
            System.out.println("3 Reporte de comidas");
            System.out.println("4 Reporte de Peleas");
            System.out.println("5 Top 5 de Pokémons con mayor ataque");
            System.out.println("6 Top 5 de alimentos con mayor salud");
            System.out.println("7 Regresar al menu principal");
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                reporte_entrenadores();
                    //declarar accion
                    break;
                case 2:

                    //declarar accion
                    break;
                case 3:

                    //declarar accion
                    break;
                case 4:

                    //declarar acion
                    break;
                case 5:

                    //declarar accion
                    break;
                case 6:
                    //declarar accion
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalidad; ingrese nuevamente");
            }
        }
    }

    private void reporte_entrenadores() {
        try {
            FileWriter report = new FileWriter("Entrenadores.html");
            report.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Document</title>\n" +
                    "</head>\n" +
                    "<body>");
            report.write((Integer) Entrenadores);
            report.write("</body>\n" +
                    "</html>");
            report.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

}