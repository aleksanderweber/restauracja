package com.github.aleksanderweber;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Kasa {

    List<String> lista = new ArrayList<>();

    public void skladanieZamowienia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz zestaw:");
        System.out.println("nr 1: cena 10 zł");
        System.out.println("nr 2: cena 12 zł");
        System.out.println("nr 3: cena 15 zł");

        String x = sc.nextLine();
        int y = 0;

        if (!x.equals("1") && !x.equals("2") && !x.equals("3")) {
            System.out.println("Niepoprawny nr zamówienia");
        }


        if (x.equals("1") || x.equals("2") || x.equals("3")) {
            y = Integer.parseInt(x);
            if (y == 1) {
                Beeper beeper = new Beeper(y, 10);
            }
            if (y == 2) {
                Beeper beeper = new Beeper(y, 12);
            }
            if (y == 3)){
                Beeper beeper = new Beeper(y, 15);
            }

            lista.add(beeper.idZamowienia);
        }
//       System.out.println(lista);
    }

}