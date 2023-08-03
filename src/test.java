import java.util.*;
import java.lang.*;




class Test
{
    public static void main(String args[])
    {
        Dog d = new Dog(); // Both Calling Same Constructor of Parent Class i.e. 0 args Constructor.
        Dog cs = new Dog("Bite"); // Both Calling Same Constructor of Parent Class i.e. 0 args Constructor.

        // You need to Explicitly tell the java compiler to use Argument constructor so you need to use "super" key word
        System.out.println("------------------------------");
        Cat c = new Cat();
        Cat caty = new Cat("10");

        System.out.println("------------------------------");
        // Self s = new Self();
        Self ss = new Self("self");
    }
}

class Animal
{
    String i;

    public Animal()
    {
        i = "10";
        System.out.println("Animal Constructor :" +i);
    }
    public Animal(String h)
    {
        i = "20";
        System.out.println("Animal Constructor Habit :"+ i);
    }
}

class Dog extends Animal
{
    public Dog()
    {
        System.out.println("Dog Constructor");
    }
    public Dog(String h)
    {
        System.out.println("Dog Constructor with habit");
    }
}

class Cat extends Animal
{
    public Cat()
    {
        System.out.println("Cat Constructor");
    }
    public Cat(String i)
    {
        super(i); // Calling Super Class Paremetrize Constructor.
        System.out.println("Cat Constructor with habit");
    }
}

class Self
{
    public Self()
    {
        System.out.println("Self Constructor");
    }
    public Self(String h)
    {
        this(); // Explicitly calling 0 args constructor.
        System.out.println("Slef Constructor with value");
    }
}
