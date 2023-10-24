package nl.family;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void addParents() {
    }

    @Test
    public void addChild() {
    }

    @Test
    public void addSibling() {
    }

    @Test
    public void addPet() {
    }

    @Test
    public void getGrandChildren() {
    }

    @Test
    public void getName() {
        // Arrange
        Person person = new Person();
        person.setName("tamer");

        // Act
        String name = person.getName();

        // Assert
        assertEquals("tamer", name);
    }

    @Test
    public void setName() {
        // Arrange
        Person person = new Person();

        // Act
        person.setName("tamer");

        // Assert
        assertEquals("tamer", person.getName());
    }

    @Test
    public void getMiddleName() {

        // Arrange
        Person person = new Person();
        person.setMiddleName("Al");

        // Act
        String middleName = person.getMiddleName();

        // Assert
        assertEquals("Al",middleName);

    }

    @Test
    public void setMiddleName() {
        // Arrange
        Person person = new Person();

        // Act
        person.setMiddleName("Al");

        // Assert

        assertEquals("Al", person.getMiddleName());
    }

    @Test
    public void getLastName() {

        // Arrange
        Person person= new Person();
        person.setLastName("alashraf");

        // Act
        String lastName = person.getLastName();

        // Assert
        assertEquals("alashraf", lastName);
    }

    @Test
    public void setLastName() {
        // Arrange
        Person person = new Person();

        // Act
        person.setLastName("alashraf");

        // Assert

        assertEquals("alashraf", person.getLastName());
    }

    @Test
    public void getSex() {
        // Arrange
        Person person= new Person();
        person.setSex("man");

        // Act
        String sex = person.getSex();

        // Assert
        assertEquals("man", sex);


    }

    @Test
    public void setSex() {
        // Arrange
        Person person= new Person();

        //Act
        person.setSex("man");

        // Assert
        assertEquals("man",person.getSex());

    }

    @Test
    public void getAge() {
        // Arrange
        Person person= new Person();
        person.setAge(33);
        // Act
        int age = person.getAge();

        // Assert
        assertEquals(33, age);

    }

    @Test
    public void setAge() {
        // Arrange
        Person person= new Person();
        //Act
        person.setAge(33);

        // Assert
        assertEquals(33,person.getAge());

    }

    @Test
    public void getFather() {
        // Arrange
        Person person= new Person();
        Person father = new Person();
        person.setFather(father);
        // Act
        Person retrievedFather = person.getFather();
        // Assert
        assertEquals(father, retrievedFather);

    }

    @Test
    public void setFather() {
        // Arrange
        Person person = new Person();
        Person father = new Person();
        // Act
        person.setFather(father);
        // Assert
        assertEquals(father, person.getFather());
    }

    @Test
    public void getMother() {
        // Arrange
        Person person = new Person();
        Person mother = new Person();
        person.setMother(mother);

        // Act
        Person retrievedMother = person.getMother();

        // Assert
        assertEquals(mother, retrievedMother);
    }

    @Test
    public void setMother() {
        // Arrange
        Person person = new Person();
        Person mother = new Person();

        // Act
        person.setMother(mother);

        // Assert
        assertEquals(mother, person.getMother());
    }

    @Test
    public void getSiblings() {
        // Arrange
        Person person = new Person();
        List<Person> siblings = new ArrayList<>();
        siblings.add(new Person());
        person.setSiblings(siblings);

        // Act
        List<Person> retrievedSiblings = person.getSiblings();

        // Assert
        assertEquals(siblings, retrievedSiblings);

    }

    @Test
    public void setSiblings() {
        // Arrange
        Person person = new Person();
        List<Person> siblings = new ArrayList<>();

        // Act
        person.setSiblings(siblings);

        // Assert
        assertEquals(siblings, person.getSiblings());
    }

    @Test
    public void testGetChildren() {
        // Arrange
        Person person = new Person();
        List<Person> children = new ArrayList<>();
        children.add(new Person());
        children.add(new Person());
        person.setChildren(children);

        // Act
        List<Person> retrievedChildren = person.getChildren();

        // Assert
        assertEquals(children, retrievedChildren);
    }

    @Test
    public void testSetChildren() {
        // Arrange
        Person person = new Person();
        List<Person> children = new ArrayList<>();
        children.add(new Person());
        children.add(new Person());

        // Act
        person.setChildren(children);

        // Assert
        assertEquals(children, person.getChildren());
    }

    @Test
    public void testGetPets() {
        // Arrange
        Person person = new Person();
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Dog", 5, "Bulldog"));
        pets.add(new Pet("Cat", 3, "Siamese"));
        person.setPet(pets);

        // Act
        List<Pet> retrievedPets = person.getPet();

        // Assert
        assertEquals(pets, retrievedPets);
    }

    @Test
    public void testSetPets() {
        // Arrange
        Person person = new Person();
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Dog", 5, "Bulldog"));
        pets.add(new Pet("Cat", 3, "Siamese"));

        // Act
        person.setPet(pets);

        // Assert
        assertEquals(pets, person.getPet());
    }

    @Test
    public void testAddParents() {
        // Arrange
        Person person = new Person();
        Person father = new Person("John","Wolf","Man",33);
        Person mother = new Person("Mary","Lekker","Vrouw",25);

        // Act
        person.addParents(father, mother);

        // Assert
        assertEquals("John", person.getFather().getName());
        assertEquals("Mary", person.getMother().getName());
    }

    @Test
    public void testAddChild() {
        // Arrange
        Person person = new Person("Tamer", "Al", "Man", 33);
        Person child = new Person("Shara", "Wolf", "Female", 4);

        // Act
        person.addChild(child);

        // Assert
        assertTrue(person.getChildren().contains(child));
        assertEquals("Shara", person.getChildren().get(0).getName());
        assertEquals(1, person.getChildren().size());
        assertNotNull(person.getChildren());
        assertNotEquals("Mari",person.getChildren().get(0).getName());
    }

    @Test
    public void testAddSibling() {
        // Arrange
        Person person = new Person("Tamer", "Al", "Man", 33);
        Person sibling1 = new Person("Kamer", "Al", "Man", 23);
        Person sibling2 = new Person("Hamer", "Al", "Man", 22);

        // Act
        person.addSibling(sibling1);
        person.addSibling(sibling2);

        // Assert
        assertTrue(person.getSiblings().contains(sibling1));
        assertEquals("Hamer", person.getSiblings().get(1).getName());
        assertEquals(2,person.getSiblings().size());
    }
    @Test
    public void testAddPet() {
        // Arrange
        Person person = new Person("Tamer", "Al", "Man", 33);
        Pet pet1 = new Pet("Cat", 3, "Siamese");
        Pet pet2 = new Pet("Dog", 5, "Bulldog");

        // Act
        person.addPet(pet1);
        person.addPet(pet2);
        // Assert
        assertTrue(person.getPet().contains(pet1));
        assertEquals("Cat", person.getPet().get(0).getName());
        assertEquals(2, person.getPet().size());
    }
    @Test
    public void testGetGrandChildren() {

    }
}