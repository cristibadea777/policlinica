package codjava.validare;

public class ValidarePersoana {

    //validare nume, prenume
    public  boolean esteValidNume(String input){
        return Validari.nuEsteGol(input) && Validari.contineDoarLitere(input);
    }

    //validare CNP
    public boolean esteValidCNP(String input) {
        return Validari.nuEsteGol(input) && Validari.contineDoarNumere(input) && input.length() == 13 && Validari.esteCNPUnic(input);
    }

    //validare varsta
    public  boolean esteValidVarsta(String input){
        return Validari.nuEsteGol(input) && Validari.esteNumar(input) && Long.parseLong(input) >= 0 && Long.parseLong(input) <= 120;
    }

    //validare telefon
    public boolean esteValidTelefon(String input){
        return Validari.nuEsteGol(input) && Validari.contineDoarNumere(input);
    }

    //validate email
    public  boolean esteValidEmail(String input){
        return Validari.nuEsteGol(input) && input.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$") && Validari.esteEmailUnic(input);
    }

}
