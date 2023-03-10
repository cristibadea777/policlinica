package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Programare {
    private long programareId;
    private Pacient pacientId;
    private Specializare specializareId;
    List<Analiza> analize = new ArrayList<Analiza>();
    private Medic medicId;
    private Date date;
    private String stare;

    public long getProgramareId() {
        return programareId;
    }

    public void setProgramareId(long programareId) {
        this.programareId = programareId;
    }

    public Pacient getPacientId() {
        return pacientId;
    }

    public void setPacientId(Pacient pacientId) {
        this.pacientId = pacientId;
    }

    public Specializare getSpecializareId() {
        return specializareId;
    }

    public void setSpecializareId(Specializare specializareId) {
        this.specializareId = specializareId;
    }

    public List<Analiza> getAnalize() {
        return analize;
    }

    public void setAnalize(List<Analiza> analize) {
        this.analize = analize;
    }

    public Medic getMedicId() {
        return medicId;
    }

    public void setMedicId(Medic medicId) {
        this.medicId = medicId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public Programare(long programareId, Pacient pacientId, Specializare specializareId, List<Analiza> analize, Medic medicId, Date date, String stare) {
        this.programareId = programareId;
        this.pacientId = pacientId;
        this.specializareId = specializareId;
        this.analize = analize;
        this.medicId = medicId;
        this.date = date;
        this.stare = stare;
    }

    public Programare(Pacient pacientId, Specializare specializareId, List<Analiza> analize, Medic medicId, Date date, String stare) {
        this.pacientId = pacientId;
        this.specializareId = specializareId;
        this.analize = analize;
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
