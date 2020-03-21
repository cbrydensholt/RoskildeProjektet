package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BarnCrud barnecrud = new BarnCrud();
        Menu menu = new Menu();
        tekstfil tekstFil = new tekstfil();
        //tekstFil.readFile();
        tekstFil.readFile();
        barnecrud.opretbarn();
        tekstFil.writeFile();



    }
}
