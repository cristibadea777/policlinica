package codjava.validare;

public class ValidareSpecializare {

    public boolean esteNumeSpecializareValid(String input){
        return Validari.nuEsteGol(input) && Validari.contineDoarLitere(input);
    }

}
