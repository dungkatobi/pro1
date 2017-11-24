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
public class dtoHoaDonMuon {
    private String mapm;
    private String madg;
    private String manv;
    private String tiencoc;

    public String getMapm() {
        return mapm;
    }

    public void setMapm(String mapm) {
        this.mapm = mapm;
    }

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTiencoc() {
        return tiencoc;
    }

    public void setTiencoc(String tiencoc) {
        this.tiencoc = tiencoc;
    }

    public dtoHoaDonMuon(String mapm, String madg, String manv, String tiencoc) {
        this.mapm = mapm;
        this.madg = madg;
        this.manv = manv;
        this.tiencoc = tiencoc;
    }

    public dtoHoaDonMuon() {
    }
}
