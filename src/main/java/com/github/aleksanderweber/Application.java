package com.github.aleksanderweber;

public class Application {

    public static void main(String[] args) {

        Kasa pierwszaKasa = new Kasa();
        Kuchnia kuchnia = new Kuchnia();

        while (true) {
            pierwszaKasa.skladanieZamowienia();
        }

    }

}