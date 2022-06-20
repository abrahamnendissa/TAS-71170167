package com.uas.prakrplbo;

public class Cyclops extends Monster{
    Cyclops(String Nama){
        System.out.println(""+Nama);
    }
    @Override
    public String bersuara (){
        System.out.println("Hohohoho");
        return null;
    }

    @Override
    public String bergerak() {
        System.out.println("Berjalan");
        return null;
    }

}
