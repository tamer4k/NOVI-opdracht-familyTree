package nl.family;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person Robert = new Person("Robert","Bakker","M",63);
        Person Eva = new Person("Eva","Smeets","F",60);

        Person Francisco = new Person("Francisco","Bakker","M",32);
        Person Amanda = new Person("Amanda","Hermans","F",30);

        Person Steven = new Person("Steven","deJong","M",32);
        Person Sandra = new Person("Sandra","Bakker","F",30);



        Person Zula = new Person("Zula","Bakker","F",5);
        Person Cleveland = new Person("Cleveland","Bakker","M",3);

        Person Perdo = new Person("Perdo","deJong","M",3);


        Robert.addChild(Francisco);
        Robert.addChild(Sandra);

        Eva.addChild(Francisco);
        Eva.addChild(Sandra);

        Francisco.addParents(Robert,Eva);
        Sandra.addParents(Robert,Eva);

        Francisco.addChild(Zula);
        Francisco.addChild(Cleveland);

        Sandra.addChild(Perdo);


        Zula.addParents(Francisco,Amanda);
        Cleveland.addParents(Francisco,Amanda);

        Perdo.addParents(Steven, Sandra);

        List<Person> grandChildren = Robert.getGrandChildren();


        for (Person grandChild : grandChildren) {

            System.out.println("het kleinkind van Robert is: " + grandChild.getName() + " " + grandChild.getLastName());

        }

    }
}