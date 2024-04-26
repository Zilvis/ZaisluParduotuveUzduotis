package Parduotuve;

import Enmus.Sukuosena;
import Zaislai.Konstruktorius;
import Zaislai.Lele;
import Zaislai.Zaislas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parduotuve {
    private List<Zaislas> zaisluSarasas = new ArrayList<>();
    private boolean veikia = true;
    private Scanner scannerStr = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);
    private List<Zaislas> prekiuKrepselis = new ArrayList<>();
    private double prekiuKrepselioBendraSuma = 0;


    public Parduotuve() {
        zaisluSarasas.add(new Konstruktorius("Traktorius", "Maxima", 12, 20.5, 120));
        zaisluSarasas.add(new Lele("barbe", "Norfa", 12, 20.5, Sukuosena.GARBANOTI));
    }

    public void run() {
        System.out.println("\n1. Zaislu sarasas");
        System.out.println("2. Sukurti nauja");
        System.out.println("3. Istrinti pagal pavadinima");
        System.out.println("4. Apspaikciuoti bendra verte");
        System.out.println("5. Prekiu krepselis");
        System.out.println("6. Iseiti");
        String pasirinkimas = scannerStr.nextLine();

        while (veikia) {
            switch (pasirinkimas) {
                case "1":
                    zaisluSarasas();
                    break;
                case "2":
                    sukurtiNauja();
                    break;
                case "3":
                    istrintiPagalPavadinima();
                    break;
                case "4":
                    apspaikciuotiBendraVerte();
                    break;
                case "5":
                    prekiuKrepselis();
                    break;
                case "6":
                    veikia = false;
                    break;
                default:
                    veikia = false;
                    break;
            }
        }
    }

    private void prekiuKrepselis() {
        boolean apsipirkineja = true;

        while (apsipirkineja) {

            System.out.println("\n Prekiu krepselio verte: " + prekiuKrepselioBendraSuma + " EUR\n DABARTINES PREKES: " + prekiuKrepselis+"\n");

            for (Zaislas z : zaisluSarasas) {
                System.out.println(z);
            }

            if (zaisluSarasas.isEmpty()){
                System.err.println("Prekiu lentyna tuscia !");
            }
            System.err.println("\nIveskite norimos prekes pavadinima arba X kad iseitumete.");

            String pasirinkimas = scannerStr.nextLine();

            if (pasirinkimas.equalsIgnoreCase("x")) {
                apsipirkineja = false;
                run();
            }

            for (int i = 0; i < zaisluSarasas.size(); i++) {
                if (pasirinkimas.equalsIgnoreCase(zaisluSarasas.get(i).getPavadinimas())) {
                    prekiuKrepselioBendraSuma += zaisluSarasas.get(i).getKaina();
                    System.out.println(zaisluSarasas.get(i).getPavadinimas() + " " + zaisluSarasas.get(i).getKaina() + " EUR");
                    prekiuKrepselis.add(zaisluSarasas.get(i));
                    zaisluSarasas.remove(i);
                }
            }

        }
    }

    private void apspaikciuotiBendraVerte() {
        double suma = 0;
        for (int i = 0; i < zaisluSarasas.size(); i++) {
            suma += zaisluSarasas.get(i).getKaina();
        }
        System.out.println("Bendra zaislu verte: " + suma);
        run();
    }

    private void istrintiPagalPavadinima() {
        System.out.println("Iveskite norimo zaislo pavadinima: ");
        String pavadinimas = scannerStr.nextLine();

        for (int i = 0; i < zaisluSarasas.size(); i++) {
            if (pavadinimas.equalsIgnoreCase(zaisluSarasas.get(i).getPavadinimas())) {
                System.out.println(zaisluSarasas.get(i).getPavadinimas() + " Istrintas");
                zaisluSarasas.remove(i);
            }
        }
        run();
    }

    private void sukurtiNauja() {

        System.out.println("1. Konstruktorius");
        System.out.println("2. Lele");
        String tipas = scannerStr.nextLine();
        switch (tipas) {
            case "1":
                tipas = "1";
                break;
            case "2":
                tipas = "2";
                break;
            default:
                System.out.println("Neteisingas pasirinkimas");
        }

        System.out.print("Iveskite zaislo pavadinima: ");
        String pavadinimas = scannerStr.nextLine();

        System.out.print("Iveskite zaislo gamintoja: ");
        String gamintojas = scannerStr.nextLine();

        System.out.print("Iveskite zaislo kaina: ");
        double kaina = scannerInt.nextDouble();

        System.out.print("Iveskite zaislo amziaus riba: ");
        int amziausRiba = scannerInt.nextInt();

        if (tipas.equals("1")) {
            System.out.print("Iveskite zaislo detaliu skaiciu: ");
            int detaliuSkaicius = scannerInt.nextInt();
            zaisluSarasas.add(new Konstruktorius(pavadinimas, gamintojas, amziausRiba, kaina, detaliuSkaicius));
            run();

        } else {
            System.out.print("Pasirinkite zaislo sukuosena: ");
            System.out.print("1. ILGI 2. TRUMPI 3. GARBANOTI 4. TIESUS");

            String sukuosena = scannerStr.nextLine();
            switch (sukuosena) {
                case "1":
                    sukuosena = "ILGI";
                    break;
                case "2":
                    sukuosena = "TRUMPI";
                    break;
                case "3":
                    sukuosena = "GARBANOTI";
                    break;
                case "4":
                    sukuosena = "TIESUS";
                    break;
                default:
                    System.out.println("Neteisingas pasirinkimas");
            }

            zaisluSarasas.add(new Lele(pavadinimas, gamintojas, amziausRiba, kaina, Sukuosena.valueOf(sukuosena)));
            run();
        }
    }

    private void zaisluSarasas() {
        System.out.println();
        for (Zaislas z : zaisluSarasas) {
            System.out.println(z);
        }
        System.out.println();
        run();
    }
}


























