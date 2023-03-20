package codjava.pojo;

import codjava.validare.ValidareProgramare;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Programare {
    private long programareId;
    private long pacientId;
    private long specializareId;
    List<Analiza> analize = new ArrayList<Analiza>();
    private long medicId;
    private Date date;
    private String stare;

    private ValidareProgramare validareProgramare;

    public long getProgramareId() {
        return programareId;
    }

    public void setProgramareId(long programareId) {
        this.programareId = programareId;
    }

    public long getPacientId() {
        return pacientId;
    }

    public void setPacientId(long pacientId) {
        this.pacientId = pacientId;
    }

    public long getSpecializareId() {
        return specializareId;
    }

    public void setSpecializareId(long specializareId) {
        this.specializareId = specializareId;
    }

    public List<Analiza> getAnalize() {
        return analize;
    }

    public void setAnalize(List<Analiza> analize) {
        this.analize = analize;
    }

    public long getMedicId() {
        return medicId;
    }

    public void setMedicId(long medicId) {
        this.medicId = medicId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if(validareProgramare.esteDataValida(String.valueOf(date)))
            this.date = date;
        else
            throw new IllegalArgumentException("Introdu o data valida, si din viitor");
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        if(validareProgramare.esteStareValida(stare))
            this.stare = stare;
        else
            throw new IllegalArgumentException("Introdu o stare valida");
    }

    public Programare(long programareId, long pacientId, long specializareId, List<Analiza> analize, long medicId, Date date, String stare) {
        this.programareId = programareId;
        this.pacientId = pacientId;
        this.specializareId = specializareId;
        this.analize = analize;
        this.medicId = medicId;
        this.date = date;
        this.stare = stare;
    }

    public Programare(long pacientId, long specializareId, List<Analiza> analize, long medicId, Date date, String stare) {
        this.pacientId = pacientId;
        this.specializareId = specializareId;
        this.analize = analize;
        this.medicId = medicId;
        this.date = date;
        this.stare = stare;
    }

    public Programare(long programareId, long pacientId, long specializareId, long medicId, Date date, String stare) {
        this.programareId = programareId;
        this.pacientId = pacientId;
        this.specializareId = specializareId;
        this.medicId = medicId;
        this.date = date;
        this.stare = stare;
    }

    public Programare() {
    }

    @Override
    public String toString() {
        return "Programare{" +
                "programareId=" + programareId +
                ", pacientId=" + pacientId +
                ", specializareId=" + specializareId +
                ", analize=" + analize +
                ", medicId=" + medicId +
                ", date=" + date +
                ", stare='" + stare + '\'' +
                '}';
    }
}
