package com.uas.prakrplbo;

public class Manticore extends Monster{
    Manticore(String Nama){
        System.out.println(""+Nama);
    }
    public String bersuara (){
        System.out.println("Roarroar");

        return getInfo();
    }

    @Override
    public String bergerak() {
        System.out.println("Terbang");
        return null;
    }

}
