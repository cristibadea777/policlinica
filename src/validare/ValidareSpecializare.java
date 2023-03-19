package validare;

import static validare.Validari.*;

public class ValidareSpecializare {

    public boolean esteNumeSpecializareValid(String input){
        return nuEsteGol(input) && contineDoarLitere(input);
    }

}
