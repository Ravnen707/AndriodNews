package com.example.andriodnews.businessLogic;

public class Nyhedsindslag {

    public String overskrift;
    public String teasertekst;
    public String linktilvideo;
    public String linktilbillede;
    public String udgivelsedato;
    public Boolean udgivetellerej;
    public Boolean slettet;


    public String getOverskrift() {
        return overskrift;
    }

    public void setOverskrift(String overskrift) {
        this.overskrift = overskrift;
    }

    public String getTeasertekst() {
        return teasertekst;
    }

    public void setTeasertekst(String teasertekst) {
        this.teasertekst = teasertekst;
    }

    public String getLinktilvideo() {
        return linktilvideo;
    }

    public void setLinktilvideo(String linktilvideo) {
        this.linktilvideo = linktilvideo;
    }

    public String getLinktilbillede() {
        return linktilbillede;
    }

    public void setLinktilbillede(String linktilbillede) {
        this.linktilbillede = linktilbillede;
    }

    public String getUdgivelsedato() {
        return udgivelsedato;
    }

    public void setUdgivelsedato(String udgivelsedato) {
        this.udgivelsedato = udgivelsedato;
    }

    public Boolean getUdgivetellerej() {
        return udgivetellerej;
    }

    public void setUdgivetellerej(Boolean udgivetellerej) {
        this.udgivetellerej = udgivetellerej;
    }

    public Boolean getSlettet() {
        return slettet;
    }

    public void setSlettet(Boolean slettet) {
        this.slettet = slettet;
    }
    public Nyhedsindslag() {

    }

    public Nyhedsindslag(String overskrift, String teasertekst, String linktilbillede) {
        this.overskrift = overskrift;
        this.teasertekst = teasertekst;
        this.linktilbillede = linktilbillede;



    }
}
