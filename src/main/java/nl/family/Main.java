package nl.family;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int result = method1(10,10);
        System.out.println(result);


        Person Peter = new Person("Peter","Bakker","M",90);
        Person Jessica = new Person("Jessica","Jansen","F",90);

        Person Ron = new Person("Ron","Bakker","M",65);
        Person Sheila = new Person("Sheila","Bakker","F",64);
        Person Robert = new Person("Robert","Bakker","M",63);
        Person David = new Person("David","Boer","M",64);
        Person Eva = new Person("Eva","Smeets","F",60);

        Person Cynthia = new Person("Cynthia","Bakker","F",30);
        Person Steven = new Person("Steven","Bakker","M",33);
        Person Francisco = new Person("Francisco","Bakker","M",32);
        Person Donald = new Person("Donald","Bosch","M",30);
        Person Sandra = new Person("Sandra","Koning","F",30);
        Person Amanda = new Person("Amanda","Hermans","F",30);

        Person Mark = new Person("Mark","Bakker","M",7);
        Person Lula = new Person("Lula","Bakker","F",6);
        Person Perdo = new Person("Perdo","Bakker","M",4);
        Person Zula = new Person("Zula","Bakker","F",5);
        Person Cleveland = new Person("Cleveland","Bakker","M",3);





    }

    public static int method1(int x, int y){
        int result = x + y;
        return result;
    }
}