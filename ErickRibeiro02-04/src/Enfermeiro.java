/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ras-E
 */
public class Enfermeiro {
    private String nomeEnfermeiro;
    private String corem;


    public Enfermeiro(String nomeInfermeiro, String corem) {
        this.nomeEnfermeiro = nomeInfermeiro;
        this.corem = corem;
    }

    /**
     *
     * @return
     */
    public String getNomeInfermeiro() {
        return nomeEnfermeiro;
    }

    /**
     *
     * @param nomeInfermeiro
     */
    public void setNomeInfermeiro(String nomeInfermeiro) {
        this.nomeEnfermeiro = nomeInfermeiro;
    }

    /**
     *
     * @return
     */
    public String getCorem() {
        return corem;
    }

    /**
     *
     * @param corem
     */
    public void setCorem(String corem) {
        this.corem = corem;
    }
    
}
