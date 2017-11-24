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
public class dtoChiTietMuon {
    private String mapm,mash,ngaythue,ngaytra,ghichu;

    public String getMapm() {
        return mapm;
    }

    public void setMapm(String mapm) {
        this.mapm = mapm;
    }

    public String getMash() {
        return mash;
    }

    public void setMash(String mash) {
        this.mash = mash;
    }

    public String getNgaythue() {
        return ngaythue;
    }

    public void setNgaythue(String ngaythue) {
        this.ngaythue = ngaythue;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public dtoChiTietMuon(String mapm, String mash, String ngaythue, String ngaytra, String ghichu) {
        this.mapm = mapm;
        this.mash = mash;
        this.ngaythue = ngaythue;
        this.ngaytra = ngaytra;
        this.ghichu = ghichu;
    }

    public dtoChiTietMuon() {
    }
}
