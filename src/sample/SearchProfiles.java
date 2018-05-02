package sample;

import java.util.Scanner;

public class SearchProfiles extends Array{
    //Created by Charles Galea (March 2018)

    Scanner input = new Scanner(System.in);

    private int searchPersonNumber = 1000;
    private String searchPersonName;

    public SearchProfiles() {
    }

    //Method to select person's profile
    public void searchName() {
        System.out.println("Enter person's name: ");
        searchPersonName = input.nextLine();

        while (!searchPersonName.matches("[a-zA-Z ]+")) {
            System.out.println("Woops that's not a name!! Please try again: ");
            searchPersonName = input.nextLine();
        }

        for (int i = 0; i < list.size(); i++) {
            if (searchPersonName.equalsIgnoreCase(list.get(i).getName())) {
                searchPersonNumber = 10;
            }
        }
        if (searchPersonNumber == 1000) {
            System.out.println("This person is not in this database");
            System.out.println();
        }

        //Print profile for selected person
        for (int i=0; i<list.size(); i++) {
            if (searchPersonName.equalsIgnoreCase(list.get(i).getName())) {
                System.out.println(list.get(i));
                System.out.println();
            }
        }
    }
}