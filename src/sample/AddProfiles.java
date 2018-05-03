package sample;

import java.util.Scanner;

public class AddProfiles extends Array {
    //Created by Charles Galea (March 2018)

    //List variables
    private String newName;
    private String newString;
    private String newImage;
    private String newStatus;
    private String newGender;
    private String newAge;
    private String newState;
    private boolean isNumber;


    Scanner input = new Scanner(System.in);

    public AddProfiles(String name, String image, String status, String gender, String age, String state) {
        super(name, image, status, gender, age, state);
    }

    //Construct default AddProfile object
    public AddProfiles() {
    }

    public String getNewName() {
        return newName;
    }

    public String getNewString() {
        return newString;
    }

    public String getNewImage() {
        return newImage;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public String getNewGender() {
        return newGender;
    }

    public String getNewAge() {
        return newAge;
    }

    public String getNewState() {
        return newState;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public void setNewString(String newString) {
        this.newString = newString;
    }

    public void setNewImage(String newImage) {
        this.newImage = newImage;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public void setNewGender(String newGender) {
        this.newGender = newGender;
    }

    public void setNewAge(String newAge) {
        this.newAge = newAge;
    }

    public void setNewState(String newState) {
        this.newState = newState;
    }

    //Add person's name
    public void addName() throws MyExceptions {
        boolean error = false;
        do {
            System.out.println("Enter the person's name: ");
            String newName = input.nextLine();
            if (!newName.matches("[a-zA-Z ]+")) {
                error = true;
                newString = newName;
                throw new MyExceptions("Error message", newString);
            } else {
                error = false;
            }
        } while (error == true);
    }

    //Add profile image
    public void addImage() throws MyExceptions {
        boolean error = false;
        do {
            System.out.println("Enter the profile image name: ");
            String newImage = input.nextLine();
            if (!newImage.matches("[a-zA-Z ].+")) {
                error = true;
                newString = newImage;
                throw new MyExceptions("Error message", newString);
            } else {
                error = false;
            }
        } while (error == true);
    }

    //Input the person's status
    public void addStatus() throws MyExceptions {
        boolean error = false;
        do {
            System.out.println("Enter the person's status: ");
            String newStatus = input.nextLine();
            if (!newStatus.matches("[a-zA-Z ]+")) {
                error = true;
                newString = newStatus;
                throw new MyExceptions("Error message", newString);
            } else {
                error = false;
            }
        } while (error == true);
    }

    //Input the person's gender
    public void addGender() throws MyExceptions {
        boolean error = false;
        do {
            System.out.println("Enter the person's gender: ");
            String newGender = input.nextLine();
            if (!newGender.matches("[a-zA-Z ]+")) {
                error = true;
                newString = newGender;
                throw new MyExceptions("Error message", newString);
            } else {
                error = false;
            }
        } while (error == true);
    }

    //Input the person's age
    public void addAge() {
        do {
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
        } while (!(isNumber));
    }

    //Input the person's state of residence
    public void addState() throws MyExceptions {
        boolean error = false;
        do {
            System.out.println("Enter the person's residence (e.g. VIC): ");
            String newState = input.nextLine();
            newState = input.nextLine();
            if (!newState.matches("[a-zA-Z ]+")) {
                error = true;
                newString = newState;
                throw new MyExceptions("Error message", newString);
            } else {
                error = false;
            }
        } while (error == true);
    }
}
