package pojo;

import validare.ValidareSpecializare;

public class Specializare {
    private long specializareId;
    private String numeSpecializare;

    private ValidareSpecializare validareSpecializare;

    public long getSpecializareId() {
        return specializareId;
    }

    public void setSpecializareId(long specializareId) {
        this.specializareId = specializareId;
    }

    public String getNumeSpecializare() {
        return numeSpecializare;
    }

    public void setNumeSpecializare(String numeSpecializare) {
        if(validareSpecializare.esteNumeSpecializareValid(numeSpecializare))
            this.numeSpecializare = numeSpecializare;
        else
            throw new IllegalArgumentException("Introdu un nume de specializare valid");
    }

    public Specializare(long specializareId, String numeSpecializare) {
        this.specializareId = specializareId;
        this.numeSpecializare = numeSpecializare;
    }

    public Specializare(String numeSpecializare) {
        this.numeSpecializare = numeSpecializare;
    }

    public Specializare() {
    }

    @Override
    public String toString() {
        return "Specializare{" +
                "specializareId=" + specializareId +
                ", numeSpecializare='" + numeSpecializare + '\'' +
                '}';
    }
}
