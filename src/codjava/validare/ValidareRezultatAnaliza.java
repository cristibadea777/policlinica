package codjava.validare;

public class ValidareRezultatAnaliza {
    public  boolean esteRezultatValid(String input){
        return Validari.nuEsteGol(input);
    }
    public  boolean esteCodValid(String input){
        return Validari.nuEsteGol(input) && Validari.esteCodUnic(input);
    }

}
