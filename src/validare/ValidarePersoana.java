package validare;

import java.util.List;
import static validare.Validari.*;

public class ValidarePersoana {

    private List listaCNP = null;
    private List listaEmail = null;

    //validare nume, prenume
    public  boolean esteValidNume(String input){
        return nuEsteGol(input) && contineDoarLitere(input);
    }
    //validare CNP
    public  boolean esteValidCNP(String input){
        listaCNP = null; ///de scos lista aici cu conexiune
        return nuEsteGol(input) && contineDoarNumere(input) && input.length() == 13 && esteUnic(listaCNP, input);
    }
    //validare varsta
    public  boolean esteValidVarsta(String input){
        return nuEsteGol(input) && esteNumar(input) && Long.parseLong(input) >= 0 && Long.parseLong(input) <= 120;
    }
    //validare telefon
    public boolean esteValidTelefon(String input){
        return nuEsteGol(input) && contineDoarNumere(input);
    }
    //validate email
    public  boolean esteValidEmail(String input){
        listaEmail = null; ///de scos lista aici cu conexiune
        return nuEsteGol(input) && input.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$") && esteUnic(listaEmail, input);
    }


}
