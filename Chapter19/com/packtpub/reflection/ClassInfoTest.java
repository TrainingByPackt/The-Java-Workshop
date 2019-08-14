package com.packtpub.reflection;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ClassInfoTest {
    @Test
    public void toStringForObject() {
        final ClassInfo classInfo = new ClassInfo(Object.class);

        final String result = classInfo.toString();

        assertTrue(result.contains("Object - java.lang.Object"));
        assertTrue(result.contains("super class: null"));
        assertTrue(result.contains("is enum: false"));
        assertTrue(result.contains("is annotation: false"));
        assertTrue(result.contains("is interface: false"));
        assertTrue(result.contains("is assignable from Mammal: false"));
        assertTrue(result.contains("interfaces: none"));
    }

    @Test
    public void toStringForAnimal() {
        final ClassInfo classInfo = new ClassInfo(Animal.class);

        final String result = classInfo.toString();

        assertTrue(result.contains("Animal - com.packtpub.reflection.Animal"));
        assertTrue(result.contains("super class: null"));
        assertTrue(result.contains("is enum: false"));
        assertTrue(result.contains("is annotation: false"));
        assertTrue(result.contains("is interface: true"));
        assertTrue(result.contains("is assignable from Mammal: false"));
        assertTrue(result.contains("interfaces: none"));
    }

    @Test
    public void toStringForMammal() {
        final ClassInfo classInfo = new ClassInfo(Mammal.class);

        final String result = classInfo.toString();

        assertTrue(result.contains("Mammal - com.packtpub.reflection.Mammal"));
        assertTrue(result.contains("super class: null"));
        assertTrue(result.contains("is enum: false"));
        assertTrue(result.contains("is annotation: false"));
        assertTrue(result.contains("is interface: true"));
        assertTrue(result.contains("is assignable from Mammal: true"));
        assertTrue(result.contains("interfaces: Animal"));
    }

    @Test
    public void toStringForTiger() {
        final ClassInfo classInfo = new ClassInfo(Tiger.class);

        final String result = classInfo.toString();

        assertTrue(result.contains("Tiger - com.packtpub.reflection.Tiger"));
        assertTrue(result.contains("super class: java.lang.Object"));
        assertTrue(result.contains("is enum: false"));
        assertTrue(result.contains("is annotation: false"));
        assertTrue(result.contains("is interface: false"));
        assertTrue(result.contains("is assignable from Mammal: true"));
        assertTrue(result.contains("interfaces: Mammal Serializable"));
    }

    @Test
    public void toStringForSiberianTiger() {
        final ClassInfo classInfo = new ClassInfo(SiberianTiger.class);

        final String result = classInfo.toString();

        assertTrue(result.contains("SiberianTiger - com.packtpub.reflection.SiberianTiger"));
        assertTrue(result.contains("super class: com.packtpub.reflection.Tiger"));
        assertTrue(result.contains("is enum: false"));
        assertTrue(result.contains("is annotation: false"));
        assertTrue(result.contains("is interface: false"));
        assertTrue(result.contains("is assignable from Mammal: true"));
        assertTrue(result.contains("interfaces: none"));
    }

    @Test
    public void toStringForPets() {
        final ClassInfo classInfo = new ClassInfo(Pets.class);

        final String result = classInfo.toString();

        assertTrue(result.contains("Pets - com.packtpub.reflection.Pets"));
        assertTrue(result.contains("super class: java.lang.Enum"));
        assertTrue(result.contains("is enum: true"));
        assertTrue(result.contains("is annotation: false"));
        assertTrue(result.contains("is interface: false"));
        assertTrue(result.contains("is assignable from Mammal: false"));
        assertTrue(result.contains("interfaces: none"));
    }
}