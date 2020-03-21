package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarnCrud {
static List<Barn> barneListe = new ArrayList<>();
Scanner input = new Scanner(System.in);



    public void opretbarn(){

        String birthday;
        String firstName;
        String lastName;
        int id;

        System.out.println("Hvad er barnets fornavn?");
        firstName = input.nextLine();
        System.out.println("Hvad er barnets efternavn?");
        lastName = input.nextLine();
        System.out.println("Hvad er barnets fødselsdag?");
        birthday = input.nextLine();
        System.out.println("Hvad er barnets ID?");
        id = input.nextInt();

        Barn barn = new Barn(firstName, lastName, birthday, id);
        barneListe.add(barn);

    }




    public void deleteBarn(){

    int idchoice;

    //print liste af børn
        System.out.println("Her er en liste af børn der kan slettes, skriv id der skal slettes");

        idchoice = input.nextInt();
        for(int i = 0; i< barneListe.size(); i++){
        if(idchoice == barneListe.get(i).getId()){
            System.out.println(barneListe.get(i).getFirstName() + " " + barneListe.get(i).getLastName() + "bliver nu slettet");
            barneListe.remove(barneListe.get(i));
        }
        }


    }

    public void opdaterBarn(){

    int idchoice;
    int switchchoice;
     //print liste af børn

        System.out.println("Her er en listen af børn der kan opdateres");
        idchoice = input.nextInt();

        for(Barn b : barneListe){
            if(idchoice == b.getId()){
                System.out.println(b.getFirstName());
                System.out.println(b.getLastName());
                System.out.println(b.getBirthday());
                System.out.println(b.getId());

                System.out.println("Hvilken information skal ændres?");
                switchchoice = input.nextInt();

                switch(switchchoice){

                    case 1:
                        System.out.println("Opdater first name");
                        b.setFirstName(input.next());
                        break;

                    case 2:
                        System.out.println("Opdater last name");
                        b.setLastName(input.next());
                        break;

                    case 3:
                        System.out.println("Opdater fødselsdag");
                        b.setBirthday(input.next());
                        break;
                    case 4:
                        System.out.println("Opdater ID");
                        b.setId(input.nextInt());
                        break;
                }

            }
        }

    }

}
