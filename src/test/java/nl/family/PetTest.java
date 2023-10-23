package nl.family;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {

    @Test
    public void getName() {
        Pet pet = new Pet("kat",3,"British");
        // arrange
        String nameExpect = "kat";

        // act
        String result = pet.getName();

        // assert
        assertEquals(nameExpect, result);
    }

    @Test
    public void setName() {

        Pet pet = new Pet();

        // arrange
        String nameExpect = "kat";

        // act
        pet.setName("kat");

        // assert
        assertEquals(nameExpect, pet.getName());
    }

    @Test
    public void getAge() {
        Pet pet = new Pet("kat",3,"British");
        // arrange
        int ageExpect = 3;

        // act
        int result = pet.getAge();

        // assert
        assertEquals(ageExpect, result);
    }

    @Test
    public void setAge() {
        Pet pet = new Pet();

        // arrange
        int ageExpect = 4;

        // act
        pet.setAge(4);

        // assert
        assertEquals(ageExpect, pet.getAge());
    }

    @Test
    public void getSpecies() {

        Pet pet = new Pet("kat",3,"British");
        // arrange
        String speciesExpect = "British";

        // act
        String result = pet.getSpecies();

        // assert
        assertEquals(speciesExpect, result);
    }

    @Test
    public void setSpecies() {

        Pet pet = new Pet();

        // arrange
        String speciesExpect = "British";

        // act
        pet.setSpecies("British");

        // assert
        assertEquals(speciesExpect, pet.getSpecies());
    }

    @Test
    public void getOwner() {

        Person person = new Person("tamer","alashraf","male",33);
        Pet pet = new Pet();
        pet.setOwner(person);

        // act
        Person result = pet.getOwner();

        // assert
        assertEquals(person, result);

    }

    @Test
    public void testSetOwner() {
        // Arrange
        Person person = new Person();
        person.setName("tamer");
        Pet pet = new Pet("kat", 3, "British");

        // Act
        pet.setOwner(person);

        // Assert
        assertEquals("tamer", pet.getOwner().getName());
    }
}