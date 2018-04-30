package sample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddProfiles extends Array {
    //Created by Charles Galea (March 2018)

    //List variables
    private String newName;
    private String newImage;
    private String newStatus;
    private String newGender;
    private int newAge;
    private String newState;
    private boolean isNumber;


    Scanner input = new Scanner(System.in);


    //Construct default AddProfile object
    public AddProfiles() {
    }

    //Add profile to arrayList
    public void addProfile() throws MyExceptions {

        //Input person's name
       boolean error = false;
        do {
            try {
                System.out.println("What is the person's name: ");
                newName = input.nextLine();
                if (!newName.matches("[a-zA-Z ]+")) {
                    error = true;
                    throw new MyExceptions("Error message", newName);
                } else {
                    error = false;
                }
        } while(!error);

        //Input an image name
        System.out.println("Is there an image name: ");
        newImage = input.nextLine();

        while (!newImage.matches("[a-zA-Z1-9 ].+")) {
            System.out.println("Woops that's not a image name!! Please try again: ");
            newImage = input.nextLine();
        }

        //Input the person's status
        System.out.println("What is the person's status: ");
        newStatus = input.nextLine();

        while (!newStatus.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a status!! Please try again: ");
            newStatus = input.nextLine();
        }

        //Input the person's gender
        System.out.println("What is the person's gender (F or M): ");
        newGender = input.nextLine();

        while (!newGender.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a gender!! Please try again: ");
            newGender = input.nextLine();
        }

        //Input the person's age

        boolean success2 = false;
        do {
            try {
                System.out.print("What is the person's age: ");
                newAge = input.nextInt();

                //            if (newAge < 0 || newAge > 120) {
                //                throw new MyExceptions("Error message", newAge);
                //            } else
                //                System.out.println("You entered " + newAge);
                success2 = true;

            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Woops that is not a number. Try again: ");
            }
        } while (!success2);

    /*    do {
            System.out.println("What is the person's age: ");
            if (input.hasNext()) {
                newAge = input.next();
                isNumber = true;
            } else {
                System.out.println("Woops that is not a number. Try again: ");
                isNumber = false;
                input.next();
            }
            int newAgeInt = Integer.parseInt(newAge);
            if (newAgeInt < 0 || newAgeInt > 120) {
                System.out.println("That is an incorrect age. Try again: ");
                isNumber = false;
            }
        } while (!(isNumber)); */

        //Input the person's state of residence
        System.out.println("What is the person's state of residence (e.g. VIC): ");
        input.nextLine();
        newState = input.nextLine();

        while (!newState.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a state!! Please try again: ");
            newState = input.nextLine();
        }


        //Determine whether person is an adult or child based on age

        String newAge = "newAge";

        list.add(new Person(newName, newImage, newStatus, newGender, newAge, newState));

        //Print new profile
        for (int i = 0; i < list.size(); i++) {
            if (newName.equalsIgnoreCase(list.get(i).getName()))
                System.out.println(list.get(i));
            System.out.println();
        }
    }

}

