package validare;

import postgresql.JDBCPosgreSQLConexiune;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static validare.Validari.*;

public class ValidarePersoana {

    //validare nume, prenume
    public  boolean esteValidNume(String input){
        return nuEsteGol(input) && contineDoarLitere(input);
    }

    //validare CNP
    public boolean esteValidCNP(String input) {
        return nuEsteGol(input) && contineDoarNumere(input) && input.length() == 13 && esteCNPUnic(input);
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
        return nuEsteGol(input) && input.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$") && esteEmailUnic(input);
    }

}
