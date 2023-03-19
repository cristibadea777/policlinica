package validare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Validari {

    //doar numere
    public static boolean contineDoarNumere(String input){
        return input.matches("^[0-9]+$");
    }
    //doar litere
    public static boolean contineDoarLitere(String input){
        return input.matches("[a-zA-Z]+");
    }
    //tip long
    public static boolean esteNumar(String input){
        try{
            long l = Long.parseLong(input);
        }catch (NumberFormatException  nfe){
            return false;
        }
        return true;
    }
    //tip Date
    public static boolean esteData(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        //dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
    //unicitate
    public static boolean esteUnic(List lista, String input){
        return ! lista.contains(input);
    }
    //obligativitate
    public static boolean nuEsteGol(String input){
        return ! input.isBlank() && ! input.isEmpty();
    }

}
