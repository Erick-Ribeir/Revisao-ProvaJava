/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ras-E
 */
public class Internacao {
        private int id;
        private static int contador=1;
        private Paciente paciente;
        private Medico medico;
        private Enfermeiro enfermeiro;
        private String motivo;
        private double diaria;
        private int dias;
        
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Internacao.contador = contador;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }
    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public double getDiaria() {
        return diaria;
    }
    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }
    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
     public double getValorTotal() {
        return diaria * dias;
    }
    public Internacao(int id, Paciente paciente, Medico medico, Enfermeiro enfermeiro, String motivo, double diaria, int dias) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.motivo = motivo;
        this.diaria = diaria;
        this.dias = dias;
    }
                
}
