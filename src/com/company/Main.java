package com.company;

public class Main {

    public static void main(String[] args) {
//        Балык, Попугай, мышык жана ит деген класс тузунуз
//        Алардын свойстваларын ойлоп табыныз
//        Бир канча объектилерин тузуп жана аларга маанилерин бериниз
//        Аларды консольго чыгарыныз
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек

    Balyk_Fish balyk_fish = new Balyk_Fish();
    balyk_fish.setNameAty("Nemo");
    balyk_fish.setBreedParoda("Sazan");
    balyk_fish.setAgeJashy((byte) 20);
    balyk_fish.setColorTusu("Orange");
    balyk_fish.setValumeKolomu((byte)4);
        System.out.println(balyk_fish.getNameAty()+"\n"+balyk_fish.getBreedParoda()+"\n"+
                balyk_fish.getAgeJashy()+"\n"+balyk_fish.getColorTusu()+"\n"+balyk_fish.getValumekolomu());
        balyk_fish.actionsDeistvia();
        System.out.println("+---------------------------+");

    Papugai_Parrot papugai_parrot =new Papugai_Parrot();
    papugai_parrot.setNameAty("Popugai");
    papugai_parrot.setBreedParoda("Kakadu");
    papugai_parrot.setAgeJashy((byte) 60);
    papugai_parrot.setColorTusu("White");
    papugai_parrot.setVolumeKolomu(1);
        System.out.println(papugai_parrot.getNameAty()+"\n"+papugai_parrot.getBreedParoda()+"\n"+
                papugai_parrot.getAgeJashy()+"\n"+papugai_parrot.getColorTusu()+"\n"+
                papugai_parrot.getVolumeKolomu());
        papugai_parrot.actionsDeistvia();
        System.out.println("+---------------------------+");

    Myshyk_Cat myshyk_cat =new Myshyk_Cat();
    myshyk_cat.setNameAty("Guzel");
    myshyk_cat.setBreedParoda("Bosch");
    myshyk_cat.setAgeJashy((byte) 15);
    myshyk_cat.setColorTusu("Black and white");
    myshyk_cat.setVolumeKolomu(3);
    myshyk_cat.setGrowthRost(25);
        System.out.println(myshyk_cat.getNameAty()+"\n"+myshyk_cat.getBreedParoda()+"\n"+
                myshyk_cat.getAgeJashy()+"\n"+myshyk_cat.getColorTusu()+"\n"+myshyk_cat.getVolumeKolomu()+"\n"
                +myshyk_cat.getGrowthRost());
        myshyk_cat.actionsDeistvia();
        System.out.println("+---------------------------+");

    It_Dog it_dog = new It_Dog();
    it_dog.setNameAty("Kumaiyk");
    it_dog.setBreedParoda("Taygan");
    it_dog.setAgeJashy((byte) 22);
    it_dog.setColorTusu("Grey");
    it_dog.setVolumeKolomu(17);
    it_dog.setGrowthRost(65);
        System.out.println(it_dog.getNameAty()+"\n"+it_dog.getBreedParoda()+"\n"+it_dog.getAgeJashy()+"\n"
        +it_dog.getColorTusu()+"\n"+it_dog.getVolumeKolomu()+"\n"+it_dog.getGrowthRost());
        it_dog.actionsDeistvia();


    }
}
