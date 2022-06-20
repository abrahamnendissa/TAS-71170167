package com.uas.prakrplbo;

public abstract class Monster implements Monsterinterface {
    private String nama;

    public Monster(){

    }
    public String bersuara(){
        return null;
    }
    public String getNama(){
        return nama;
    }

    public String getInfo() {
        System.out.println("Nama: "+ nama);
        System.out.println("Suara: "+ bersuara());
        System.out.println("Gerak: "+ bergerak());
        return getNama();
    }

}
