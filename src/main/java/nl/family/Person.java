package nl.family;

import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    String middleName;
    String lastName;
    String sex;
    int age;
    Person father;
    Person mother;

    List<Person> siblings = new ArrayList<>();
    List<Person> children = new ArrayList<>();

    List<Pet> pets = new ArrayList<>();

    // constractor // ------------------------------------------------

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(){

    }


    // Methods // ---------------------------------------------------------
    public void addParents(Person father, Person mother){
        this.father = father;
        this.mother = mother;
    }

    public void addChild(Person child){
        children.add(child);
    }

    public void addSibling(Person sibling){
        siblings.add(sibling);
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public List<Person> getGrandChildren(){

        List<Person> grandChildren = new ArrayList<>();
        for (Person child : children) {
            grandChildren.addAll(child.children);
        }
        return grandChildren;
    }





    // getter and setter // ---------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPet() {
        return pets;
    }

    public void setPet(List<Pet> pet) {
        this.pets = pet;
    }
}
