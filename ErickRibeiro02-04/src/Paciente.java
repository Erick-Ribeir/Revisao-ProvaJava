/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ras-E
 */
public class Paciente {
    private String nomePaciente;
    private String cpfPaciente;

    public Paciente(String nomePaciente, String cpfPaciente) {
        this.nomePaciente = nomePaciente;
        this.cpfPaciente = cpfPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getCpf() {
        return cpfPaciente;
    }
    
}
