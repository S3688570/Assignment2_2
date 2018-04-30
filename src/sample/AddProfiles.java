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

    //Construct default AddProfile object
    public AddProfiles() {
    }

    //Add person's name
    public void addName() throws MyExceptions{
        System.out.println("Enter the person's name: ");
        CheckStringInput inputString = new CheckStringInput();
        inputString.addString();
        newName = newString;
    }

    //Add profile image
    public void addImage() throws MyExceptions{
        System.out.println("Enter the profile image name: ");
        CheckStringInput inputString2 = new CheckStringInput();
        inputString2.addString();
        newImage = newString;
    }

    //Input the person's status
    public void addStatus() throws MyExceptions{
        System.out.println("Enter the person's status: ");
        CheckStringInput inputString3 = new CheckStringInput();
        inputString3.addString();
        newStatus = newString;
    }

    //Input the person's gender
    public void addGender() throws MyExceptions{
        System.out.println("Enter the person's gender (M or F): ");
        CheckStringInput inputString4 = new CheckStringInput();
        inputString4.addString();
        newGender = newString;
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
    public void addState() throws MyExceptions{
        System.out.println("Enter the person's state of residence (e.g. VIC): ");
        CheckStringInput inputString5 = new CheckStringInput();
        inputString5.addString();
        newState = newString;
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

    //Add new profile to ArrayList
    public void addProfile() {

        list.add(new Person(getNewName(), getNewImage(), getNewStatus(), getNewGender(), getNewAge(), getNewState()));

        //Print new profile
        for (int i = 0; i < list.size(); i++) {
            if (getNewName().equalsIgnoreCase(list.get(i).getName()))
                System.out.println(list.get(i));
            System.out.println();
        }
    }

}

