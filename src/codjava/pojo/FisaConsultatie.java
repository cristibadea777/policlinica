package codjava.pojo;

import codjava.validare.ValidareFisaConsultatie;

import java.util.ArrayList;
import java.util.List;

public class FisaConsultatie {
    private long fisaConsultatieId;
    private long pacientId;
    private long medicId;
    private String diagnostic;
    private List<String> medicamente = new ArrayList<String>();
    private List<Analiza> analizeDeEfectuat = new ArrayList<Analiza>();

    private ValidareFisaConsultatie validareFisaConsultatie;

    public long getFisaConsultatieId() {
        return fisaConsultatieId;
    }

    public long getPacientId() {
        return pacientId;
    }

    public long getMedicId() {
        return medicId;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public List<String> getMedicamente() {
        return medicamente;
    }

    public List<Analiza> getAnalizeDeEfectuat() {
        return analizeDeEfectuat;
    }

    public void setFisaConsultatieId(long fisaConsultatieId) {
        this.fisaConsultatieId = fisaConsultatieId;
    }

    public void setPacientId(long pacientId) {
        this.pacientId = pacientId;
    }

    public void setMedicId(long medicId) {
        this.medicId = medicId;
    }

    public void setDiagnostic(String diagnostic) {
        if(validareFisaConsultatie.esteDiagnosticValid(diagnostic))
            this.diagnostic = diagnostic;
        else
            throw new IllegalArgumentException("Introdu un diagnostic valid");
    }

    public void setMedicamente(List<String> medicamente) {
        this.medicamente = medicamente;
    }

    public void setAnalizeDeEfectuat(List<Analiza> analizeDeEfectuat) {
        this.analizeDeEfectuat = analizeDeEfectuat;
    }
//long, pacient, medic, string list, list
    public FisaConsultatie(long fisaConsultatieId, long pacientId, long medicId, String diagnostic, List<String> medicamente, List<Analiza> analizeDeEfectuat) {
        this.fisaConsultatieId = fisaConsultatieId;
        this.pacientId = pacientId;
        this.medicId = medicId;
        this.diagnostic = diagnostic;
        this.medicamente = medicamente;
        this.analizeDeEfectuat = analizeDeEfectuat;
    }

    public FisaConsultatie(long pacientId, long medicId, String diagnostic, List<String> medicamente, List<Analiza> analizeDeEfectuat) {
        this.pacientId = pacientId;
        this.medicId = medicId;
        this.diagnostic = diagnostic;
        this.medicamente = medicamente;
        this.analizeDeEfectuat = analizeDeEfectuat;
    }

    public FisaConsultatie() {
    }

    @Override
    public String toString() {
        return "FisaConsultatie{" +
                "fisaConsultatieId=" + fisaConsultatieId +
                ", pacientId=" + pacientId +
                ", medicId=" + medicId +
                ", diagnostic='" + diagnostic + '\'' +
                ", medicamente=" + medicamente +
                ", analizeDeEfectuat=" + analizeDeEfectuat +
                '}';
    }
}
