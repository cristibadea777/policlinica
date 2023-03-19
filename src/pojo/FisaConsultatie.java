package pojo;

import validare.ValidareFisaConsultatie;

import java.util.ArrayList;
import java.util.List;

public class FisaConsultatie {
    private long fisaConsultatieId;
    private Pacient pacientId;
    private Medic medicId;
    private String diagnostic;
    private List<String> medicamente = new ArrayList<String>();
    private List<Analiza> analizeDeEfectuat = new ArrayList<Analiza>();

    private ValidareFisaConsultatie validareFisaConsultatie;

    public long getFisaConsultatieId() {
        return fisaConsultatieId;
    }

    public Pacient getPacientId() {
        return pacientId;
    }

    public Medic getMedicId() {
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

    public void setPacientId(Pacient pacientId) {
        this.pacientId = pacientId;
    }

    public void setMedicId(Medic medicId) {
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

    public FisaConsultatie(long fisaConsultatieId, Pacient pacientId, Medic medicId, String diagnostic, List<String> medicamente, List<Analiza> analizeDeEfectuat) {
        this.fisaConsultatieId = fisaConsultatieId;
        this.pacientId = pacientId;
        this.medicId = medicId;
        this.diagnostic = diagnostic;
        this.medicamente = medicamente;
        this.analizeDeEfectuat = analizeDeEfectuat;
    }

    public FisaConsultatie(Pacient pacientId, Medic medicId, String diagnostic, List<String> medicamente, List<Analiza> analizeDeEfectuat) {
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
