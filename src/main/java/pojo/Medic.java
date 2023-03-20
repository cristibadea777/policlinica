package main.java.pojo;

import java.util.ArrayList;
import java.util.List;

public class Medic extends Persoana{
    //mosteneste Persoana
    private long medicId;
    List<Specializare> specializari = new ArrayList<Specializare>();
    private List<FisaConsultatie> fise_consultatie = new ArrayList<FisaConsultatie>();;
    private List<Programare> programari= new ArrayList<Programare>();;

    public long getMedicId() {
        return medicId;
    }

    public void setMedicId(long medicId) {
        this.medicId = medicId;
    }

    public List<Specializare> getSpecializari() {
        return specializari;
    }

    public void setSpecializari(List<Specializare> specializari) {
        this.specializari = specializari;
    }

    public List<FisaConsultatie> getFise_consultatie() {
        return fise_consultatie;
    }

    public void setFise_consultatie(List<FisaConsultatie> fise_consultatie) {
        this.fise_consultatie = fise_consultatie;
    }

    public List<Programare> getProgramari() {
        return programari;
    }

    public void setProgramari(List<Programare> programari) {
        this.programari = programari;
    }

    public Medic(String nume, String prenume, long varsta, String nrtelefon, String cnp, String email, String img, long medicId, List<Specializare> specializari, List<FisaConsultatie> fise_consultatie, List<Programare> programari) {
        super(nume, prenume, varsta, nrtelefon, cnp, email, img);
        this.medicId = medicId;
        this.specializari = specializari;
        this.fise_consultatie = fise_consultatie;
        this.programari = programari;
    }

    public Medic(String nume, String prenume, long varsta, String nrtelefon, String cnp, String email, String img, List<Specializare> specializari, List<FisaConsultatie> fise_consultatie, List<Programare> programari) {
        super(nume, prenume, varsta, nrtelefon, cnp, email, img);
        this.specializari = specializari;
        this.fise_consultatie = fise_consultatie;
        this.programari = programari;
    }

    //id, nume, prenume, varsta, nrtelefon, cnp, email, img, specializari, fise_consultatie, programari
    public Medic(long medicId, String nume, String prenume, long varsta, String nrtelefon, String cnp, String email, String img, List<Specializare> specializari, List<FisaConsultatie> fise_consultatie, List<Programare> programari) {
        super(nume, prenume, varsta, nrtelefon, cnp, email, img);
        this.medicId = medicId;
        this.specializari = specializari;
        this.fise_consultatie = fise_consultatie;
        this.programari = programari;
    }

    public Medic(String nume, String prenume, long varsta, String nrtelefon, String cnp, String email, String img) {
        super(nume, prenume, varsta, nrtelefon, cnp, email, img);
    }

    public Medic() {
    }

}
