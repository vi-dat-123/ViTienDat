/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Microsoft Windows
 */
public class Word implements Serializable{
    private String eng;
    private String viet;

    public Word() {
    }

    public Word(String eng, String viet) {
        this.eng = eng;
        this.viet = viet;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getViet() {
        return viet;
    }

    public void setViet(String viet) {
        this.viet = viet;
    }
    
    
}
