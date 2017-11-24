/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author USER
 */
public class dtoVitri {
    private String mavt;
    private String tenke;

    public String getMavt() {
        return mavt;
    }

    public void setMavt(String mavt) {
        this.mavt = mavt;
    }

    public String getTenke() {
        return tenke;
    }

    public void setTenke(String tenke) {
        this.tenke = tenke;
    }

    public dtoVitri(String mavt, String tenke) {
        this.mavt = mavt;
        this.tenke = tenke;
    }

    public dtoVitri() {
    }
}
