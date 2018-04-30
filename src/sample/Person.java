package sample;
public class Person {
    //Created by Charles Galea (March 2018)

    //List instance variables
    private String name;
    private String image;
    private String status;
    private String gender;
    private String age;
    private String state;

    //Construct default Person object
    public Person() {
    }

    //Construct Person object containing specified parameters
    public Person(String name, String image, String status, String gender, String age, String state) {
        this.name = name;
        this.image = image;
        this.status = status;
        this.gender = gender;
        this.age = age;
        this.state = state;
    }

    //Return name
    public String getName() {
        return name;
    }

    //Return image
    public String getImage() {
        return image;
    }

    //Return status
    public String getStatus() {
        return status;
    }

    //Return gender
    public String getGender() {
        return gender;
    }

    //Return age
    public String getAge() {
        return age;
    }

    //Return state
    public String getState() {
        return state;
    }

    //Set new name
    public void setName(String newName) {
        this.name = newName;
    }

    //Set new image
    public void setImage(String newImage) {
        this.image = newImage;
    }

    //Set new status
    public void setStatus(String newStatus) {
        this.status = newStatus;
    }

    //Set new gender
    public void setGender(String newGender) {
        this.gender = newGender;
    }

    //Set new age
    public void setAge(String newAge) {
        this.age = newAge;
    }

    //Set new age
    public void setState(String newState) {
        this.state = newState;
    }

    public String toString() {
        return "\n" + "Name: " + getName() + "\nImage: " + getImage() + "\nStatus: " + getStatus() + "\nGender: " + getGender() + "\nAge: " + getAge() + "\nState: " + getState() + "\n";
    }
}
