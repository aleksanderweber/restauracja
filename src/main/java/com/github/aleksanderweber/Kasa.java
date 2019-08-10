package com.github.aleksanderweber;

import java.util.*;

public class Kasa {

    List<String> lista = new ArrayList<>();
    int cena;

    public void skladanieZamowienia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz zestaw:");
        System.out.println("nr 1: cena 10 zł");
        System.out.println("nr 2: cena 12 zł");
        System.out.println("nr 3: cena 15 zł");

        String x = sc.nextLine();
        int y = 0;

        if (x.equalsIgnoreCase("exit")) { System.exit(0); }

        if (!x.equals("1") && !x.equals("2") && !x.equals("3")) {
            System.out.println("Niepoprawny nr zamówienia");
        } else {
            y = Integer.parseInt(x);

            if (y == 1) { cena = 10; }
            if (y == 2) { cena = 12; }
            if (y == 3) { cena = 15; }

            Beeper beeper = new Beeper(y, cena);
            beeper.sygnalDoKuchni(y);
            System.out.println(lista);
        }
    }
}