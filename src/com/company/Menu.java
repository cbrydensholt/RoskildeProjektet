package com.company;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    int valg;

    public void startMenu(){ //lav switchCase

        System.out.println("Velkommen til Roskilde Børnehave");
        System.out.println("Vær venlig at indtaste dine login oplysninger");
        input.nextLine();
        System.out.println("Tryk 1 for at oprette et nyt barn i børneregisteret");
        System.out.println("Tryk 2 for at slette et barn i børneregisteret");
        System.out.println("Tryk 3 for at opdatere et barn i børneregisteret");
        System.out.println("Tryk 4 for at printe børneregisteret");


valg = input.nextInt();

switch(valg){

    case 1:
        System.out.println("Du opretter ny et nyt barn i systemet");
        //kode
        break;

    case 2:
        System.out.println("Du kan nu slette et barn i systemet");
        break;
    case 3:
        System.out.println("Du kan nu opdatere et barn i systemet");
        break;
    case 4:
        System.out.println("Du kan nu printe børneregisteret");
        break;

    default:
        System.out.println("Indtastning er ikke forstået, prøv igen");





}




    }




}
