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
public class dtoTheLoai {
    private String matl;
    private String tentl;

    public String getMatl() {
        return matl;
    }

    public void setMatl(String matl) {
        this.matl = matl;
    }

    public String getTentl() {
        return tentl;
    }

    public void setTentl(String tentl) {
        this.tentl = tentl;
    }

    public dtoTheLoai() {
    }

    public dtoTheLoai(String matl, String tentl) {
        this.matl = matl;
        this.tentl = tentl;
    }
}
