package pojo;

import java.util.ArrayList;
import java.util.List;

public class RezultatAnalize {
    private long rezultatAnalizaId;
    private Pacient pacientId;
    private String rezultat;
    private List<Analiza> analize = new ArrayList<Analiza>();
    private String cod;

    public long getRezultatAnalizaId() {
        return rezultatAnalizaId;
    }

    public void setRezultatAnalizaId(long rezultatAnalizaId) {
        this.rezultatAnalizaId = rezultatAnalizaId;
    }

    public Pacient getPacientId() {
        return pacientId;
    }

    public void setPacientId(Pacient pacientId) {
        this.pacientId = pacientId;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }

    public List<Analiza> getAnalize() {
        return analize;
    }

    public void setAnalize(List<Analiza> analize) {
        this.analize = analize;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public RezultatAnalize(long rezultatAnalizaId, Pacient pacientId, String rezultat, List<Analiza> analize, String cod) {
        this.rezultatAnalizaId = rezultatAnalizaId;
        this.pacientId = pacientId;
        this.rezultat = rezultat;
        this.analize = analize;
        this.cod = cod;
    }

    public RezultatAnalize(Pacient pacientId, String rezultat, List<Analiza> analize, String cod) {
        this.pacientId = pacientId;
        this.rezultat = rezultat;
        this.analize = analize;
        this.cod = cod;
    }

    public RezultatAnalize() {
    }

    @Override
    public String toString() {
        return "RezultatAnalize{" +
                "rezultatAnalizaId=" + rezultatAnalizaId +
                ", pacientId=" + pacientId +
                ", rezultat='" + rezultat + '\'' +
                ", analize=" + analize +
                ", cod='" + cod + '\'' +
                '}';
    }
}
