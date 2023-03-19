package validare;

import static validare.Validari.*;

public class ValidareAnaliza {

    public  boolean esteNumeAnalizaValid(String input){
        return nuEsteGol(input);
    }
    public  boolean estePretValid(String input){
        return nuEsteGol(input) && esteNumar(input);
    }

}
