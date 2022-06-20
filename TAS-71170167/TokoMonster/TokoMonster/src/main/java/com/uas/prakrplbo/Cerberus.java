package com.uas.prakrplbo;

public class Cerberus extends Monster{
    Cerberus(String Nama) {
        System.out.println(""+Nama);
    }

    public String bersuara (){

        Monster cerberus = new Cerberus("Rawrrawr");
        return null;
    }

    @Override
    public String bergerak() {
        System.out.println("Berlari");
        return null;
    }
}
