package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Array extends Person{
    //Created by Charles Galea (March 2018)
    static ArrayList<Person> list = new ArrayList<>();

    public Array() {
    }

    public Array(String name, String image, String status, String gender, String age, String state) {
        super(name, image, status, gender, age, state);
    }

    public Array(ArrayList list) {
        this.list = list;
    }

    //Load array
    public void loadArray() {
        Scanner input = null;
        String line = null;

        try {
            input = new Scanner(new File("C:\\Data\\Database2.txt"));
            while (input.hasNextLine()) {
                String data[] = input.nextLine().split(",");
                list.add(new Person(data[0], data[1], data[2], data[3], data[4], data[5]));
            }

        } catch (FileNotFoundException e) {
            System.err.println("No Such File.");
            System.exit(0);
        }

        input.close();
    }

    //Print the social network
    public void printArray() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
            System.out.println();
        }
    }

    //Add new profile to ArrayList
    public void addProfile() {

        AddProfiles person = new AddProfiles();

        list.add(new Person(person.getNewName(), person.getNewImage(), person.getNewStatus(), person.getNewGender(), person.getNewAge(), person.getNewState()));

    }
}

