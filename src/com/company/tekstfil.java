package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tekstfil {

    String birthday;
    String firstName;
    String lastName;
    int id;
    Scanner scanner = new Scanner(System.in);
    List<Barn> barneListeTekstfil;
    BarnCrud barncrud = new BarnCrud();

    public void writeFile() {

        try {

            FileWriter filewriter1 = new FileWriter("barneoversigt.rtf", true);
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter1);

            for (Barn b : BarnCrud.barneListe) {
                bufferedwriter.newLine();
                bufferedwriter.write(b.getFirstName() + "\t" + b.getLastName() + "\t" + b.getBirthday() + "\t" + b.getId());
            }
            bufferedwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Det er sket en fejl, prøv igen");
        }


    }

    public void readFile() throws FileNotFoundException {
        ArrayList<Barn> barneData = new ArrayList<>();
        int index = 0;
        Scanner valueScan = null;
        File FILENAME = new File("barneoversigt.rtf");
        Scanner scan = new Scanner(FILENAME);

        while(scanner.hasNext()){
         valueScan = new Scanner(scan.nextLine());
         valueScan.useDelimiter(",");
         Barn barneobjekt = new Barn(firstName, lastName, birthday, id);

         while(valueScan.hasNext()){
             String data = valueScan.next();
             switch(index){

                 case 0:
                     barneobjekt.setFirstName(data);
                     break;

                 case 1:
                     barneobjekt.setLastName(data);
                     break;

                     case 2:
                     barneobjekt.setBirthday(data);
                     break;

                 case 3:
                     barneobjekt.setId(Integer.parseInt(data));
                     break;
             }
             index++;
             barneData.add(barneobjekt);
             BarnCrud.barneListe.add(barneobjekt);
         }


        }





    }



}



    /* public void readFile() {

    String filLocation = "barneoversigt.rtf";
    try{
    Scanner input = new Scanner(new File(filLocation));

    while(input.hasNextLine()){
        Object[] insertTo = input.nextLine().split("\t");
        parseInsertTo(insertTo);
        Barn barneliste = new Barn(firstName, lastName, birthday, id);
        BarnCrud.barneListe.add(barneliste); //barneListe is my array of objects type Barn

    }



        } catch (FileNotFoundException e){
          e.printStackTrace();
    }

    }

    public void parseInsertTo(Object[] insertTo){
        firstName = insertTo[0].toString();
        lastName = insertTo[1].toString();
        birthday = insertTo[2].toString();
        id = Integer.parseInt(insertTo[3].toString());
    }

    }
*/


