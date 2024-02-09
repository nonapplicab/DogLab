// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************
import java.util.ArrayList;

public class DogTest
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
    //2
    //was missing name for dog class
        Labrador science = new Labrador("Science", "green");
    //3
    //works because get name is in dog class and labrador extends it
        System.out.println(science.getName() + "goes" +science.bark());

    //works bc spike dog is an item of a child class of dog
	System.out.println(dog.getName() + " says " + dog.bark());
    //4
    Yorkshire newEngland = new Yorkshire("New England",50);
    //5
    //yorkshire class is a child class of dog, so it has access to all methods in dog
        System.out.println(newEngland.getName() + " says "+ newEngland.bark());
    //6
    newEngland.waddle();
    //7
    //doesn't work because waddle is in yorkshire class and not labrador
    science.waddle();
    //8
    Dog[] kennel = new Dog[3];
    //9
    kennel[0] = new Dog ("Death");
    kennel[1]= new Yorkshire("Pestilence",7);
    kennel[2]= new Labrador("Famine", "Yellow");
    //10
    for(Dog d:kennel){
        System.out.println(d.bark());;
    }
    // 11
    ((Labrador) kennel[2]).waddle();
    //12
    ArrayList<Dog> pound = new ArrayList<Dog>();

    }

}
