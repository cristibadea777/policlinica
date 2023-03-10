package pojo;

import java.util.ArrayList;
import java.util.List;

public class Pacient extends Persoana{
    //mosteneste Persoana
    private long pacientId;
    private List<Programare> programari = new ArrayList<Programare>();
    private List<FisaConsultatie> fise_consultatie = new ArrayList<FisaConsultatie>();
    private List<RezultatAnalize> rezultate_analize = new ArrayList<RezultatAnalize>();

    public long getPacientId() {
        return pacientId;
    }

    public void setPacientId(long pacientId) {
        this.pacientId = pacientId;
    }

    public List<Programare> getProgramari() {
        return programari;
    }

    public void setProgramari(List<Programare> programari) {
        this.programari = programari;
    }

    public List<FisaConsultatie> getFise_consultatie() {
        return fise_consultatie;
    }

    public void setFise_consultatie(List<FisaConsultatie> fise_consultatie) {
        this.fise_consultatie = fise_consultatie;
    }

    public List<RezultatAnalize> getRezultate_analize() {
        return rezultate_analize;
    }

    public void setRezultate_analize(List<RezultatAnalize> rezultate_analize) {
        this.rezultate_analize = rezultate_analize;
    }

    public Pacient(String nume, String prenume, long varsta, String nrtelefon, String cnp, String email, String img, long pacientId, List<Programare> programari, List<FisaConsultatie> fise_consultatie, List<RezultatAnalize> rezultate_analize) {
        super(nume, prenume, varsta, nrtelefon, cnp, email, img);
        this.pacientId = pacientId;
        this.programari = programari;
        this.fise_consultatie = fise_consultatie;
        this.rezultate_analize = rezultate_analize;
    }

    public Pacient(String nume, String prenume, long varsta, String nrtelefon, String cnp, String email, String img, List<Programare> programari, List<FisaConsultatie> fise_consultatie, List<RezultatAnalize> rezultate_analize) {
        super(nume, prenume, varsta, nrtelefon, cnp, email, img);
        this.programari = programari;
        this.fise_consultatie = fise_consultatie;
        this.rezultate_analize = rezultate_analize;
    }

    public Pacient() {
    }


}
