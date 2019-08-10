package com.github.aleksanderweber;

import java.time.LocalDateTime;
import java.util.UUID;

public class Beeper {

    Beeper(int nrZestawu, int cena) {
        this.idZamowienia = UUID.randomUUID().toString();
        this.nrZestawu = nrZestawu;
        this.cena = cena;
        this.createdAt = LocalDateTime.now();
    }

    final String idZamowienia;
    int nrZestawu;
    int cena;
    LocalDateTime createdAt;
    LocalDateTime calledAt;

    public void sygnalDoKuchni(int nrZestawu) {

    }

}