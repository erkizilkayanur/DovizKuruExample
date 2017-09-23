package com.example.nurerkizilkaya.dovizkuruexample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by a s u s on 18.9.2017.
 */
public class Doviz {

    @SerializedName("dolar")
    @Expose
    private String dolar;
    @SerializedName("euro")
    @Expose
    private String euro;
    @SerializedName("dolar2")
    @Expose
    private String dolar2;
    @SerializedName("euro2")
    @Expose
    private String euro2;
    @SerializedName("ddolar")
    @Expose
    private String ddolar;
    @SerializedName("deuro")
    @Expose
    private String deuro;
    @SerializedName("ddolar2")
    @Expose
    private String ddolar2;
    @SerializedName("deuro2")
    @Expose
    private String deuro2;
    @SerializedName("sonkayit")
    @Expose
    private String sonkayit;
    @SerializedName("guncelleme")
    @Expose
    private String guncelleme;

    public String getDolar() {
        return dolar;
    }

    public void setDolar(String dolar) {
        this.dolar = dolar;
    }

    public String getEuro() {
        return euro;
    }

    public void setEuro(String euro) {
        this.euro = euro;
    }

    public String getDolar2() {
        return dolar2;
    }

    public void setDolar2(String dolar2) {
        this.dolar2 = dolar2;
    }

    public String getEuro2() {
        return euro2;
    }

    public void setEuro2(String euro2) {
        this.euro2 = euro2;
    }

    public String getDdolar() {
        return ddolar;
    }

    public void setDdolar(String ddolar) {
        this.ddolar = ddolar;
    }

    public String getDeuro() {
        return deuro;
    }

    public void setDeuro(String deuro) {
        this.deuro = deuro;
    }

    public String getDdolar2() {
        return ddolar2;
    }

    public void setDdolar2(String ddolar2) {
        this.ddolar2 = ddolar2;
    }

    public String getDeuro2() {
        return deuro2;
    }

    public void setDeuro2(String deuro2) {
        this.deuro2 = deuro2;
    }

    public String getSonkayit() {
        return sonkayit;
    }

    public void setSonkayit(String sonkayit) {
        this.sonkayit = sonkayit;
    }

    public String getGuncelleme() {
        return guncelleme;
    }

    public void setGuncelleme(String guncelleme) {
        this.guncelleme = guncelleme;
    }
}
