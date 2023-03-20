package main.java.validare;

public class ValidareAnaliza {

    public  boolean esteNumeAnalizaValid(String input){
        return Validari.nuEsteGol(input);
    }
    public  boolean estePretValid(String input){
        return Validari.nuEsteGol(input) && Validari.esteNumar(input);
    }

}
