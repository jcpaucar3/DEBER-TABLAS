package com.mycomany.prydebertablas;

import java.util.Scanner;
import java.util.ArrayList;


public class PryDeberTablas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el numero maximo de tablas (desde 2 a n): ");
        int maxNumero = scanner.nextInt();

        ArrayList<MultiplicacionTabla> tablas = new ArrayList<>();
        for (int i = 2; i <= maxNumero; i++) {
            tablas.add(new TablaAscendente(i));
        }

        double totalSuma = 0;
        for (MultiplicacionTabla tabla : tablas) {
            tabla.mostrarTabla();
            double sumatabla = tabla.sumaTabla();
            System.out.println("Suma de la tabla " + tabla.numero + " = " + sumatabla);
            totalSuma += sumatabla;
        }

        System.out.println("Suma total de todas las tablas " + totalSuma);

        System.out.println("\nQuieres ver las tablas en orden descendente (si/no): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("si")) {
            double newTotalSuma = 0;
            for (int i = 2; i <= maxNumero; i++) {
                TablaDescendente tabladescendente = new TablaDescendente(i);
                tabladescendente.mostrarTabla();
                newTotalSuma += tabladescendente.sumaTabla();
            }
            System.out.println("Total de suma de tablas descendentes: " + newTotalSuma);
            System.out.println("Suma total de tablas combinadas " + (totalSuma + newTotalSuma));
        }

        System.out.println("\nGracias");
        scanner.close();
    }
}
