package com.uas.prakrplbo;

public class Evolusi extends Monster{
    Monster monster1;
    Monster monster2;

    public Evolusi (Monster monster1, Monster monster2){
        System.out.println("Nama monster gabungan: " + monster1 + " " + monster2);
    }
    public String bersuara (){
        return monster2.bersuara();
    }
    public String bergerak(){
        return monster2.bergerak();
    }

}
