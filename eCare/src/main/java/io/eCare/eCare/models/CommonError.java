/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.models;

import java.util.Date;

/**
 *
 * @author gabriel.leme
 */
public class CommonError {
    
    private String codigoErro;
    private Date dataErro;
    private String mensagemErro;

    public CommonError(String codigoErro, Date dataErro, String mensagemErro) {
        this.codigoErro = codigoErro;
        this.dataErro = dataErro;
        this.mensagemErro = mensagemErro;
    }
    

    public String getCodigoErro() {
        return codigoErro;
    }

    public void setCodigoErro(String codigoErro) {
        this.codigoErro = codigoErro;
    }

    public Date getDataErro() {
        return dataErro;
    }

    public void setDataErro(Date dataErro) {
        this.dataErro = dataErro;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public void setMensagemErro(String mensagemErro) {
        this.mensagemErro = mensagemErro;
    }
    
    
    
    
    
}
