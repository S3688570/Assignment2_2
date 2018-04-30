package sample;

import java.util.Scanner;

public class CheckStringInput extends Exception{

    Scanner input = new Scanner(System.in);

    public CheckStringInput() {
    }


    //Add option
    public void addString() throws MyExceptions {
        boolean error = false;
        do {
            String newString = input.nextLine();
            if (!newString.matches("[a-zA-Z ]+")) {
                error = true;
                throw new MyExceptions("Error message", newString);
            } else {
                error = false;
            }
        } while (!error);
    }
}



