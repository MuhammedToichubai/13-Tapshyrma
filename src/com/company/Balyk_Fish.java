package com.company;

public class Balyk_Fish {
    private String nameAty;
    private String breedParoda;
    private byte ageJashy;
    private String colorTusu;
    private int volumeKolomu;

    public String getNameAty() {
        return nameAty;
    }

    public void setNameAty(String nameAty) {
        this.nameAty = nameAty;
    }

    public String getBreedParoda() {
        return breedParoda;
    }

    public void setBreedParoda(String breedParoda) {
        this.breedParoda = breedParoda;
    }

    public byte getAgeJashy() {
        return ageJashy;
    }

    public void setAgeJashy(byte ageJashy) {
        this.ageJashy = ageJashy;
    }

    public String getColorTusu() {
        return colorTusu;
    }

    public void setColorTusu(String colorTusu) {
        this.colorTusu = colorTusu;
    }

    public int getValumekolomu() {
        return volumeKolomu;
    }

    public void setValumeKolomu(int valumekolomu) {
        this.volumeKolomu = valumekolomu;
    }

    public void actionsDeistvia(){
        System.out.println("The fish is able to swim ");

    }

}