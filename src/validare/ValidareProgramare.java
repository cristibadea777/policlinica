package validare;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static validare.Validari.*;

public class ValidareProgramare {

    public boolean esteDataValida(String input){
        if(esteData(input))
            return (LocalDate.parse(input , DateTimeFormatter.ofPattern( "dd-MM-yyyy" ))).isAfter(LocalDate.now());
        return false;
    }

    public boolean esteStareValida(String input){
        return input.equals("confirmata") || input.equals("neconfirmata");
    }

}
