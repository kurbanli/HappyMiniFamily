package Step1;

import java.util.Arrays;
import java.util.Random;

public class Human {
    public Human() {
    }
    String name;
    String surname;
    int year;
    byte iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule= {{"Monday","Friday","Saturday"},{"oynamaq isteyir","gezmek isteyir"}};

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public void greetpet(){
        System.out.printf("Hello, %s",name);
    }
    public void describePet(){
        String x=null;
        if(pet.tricklevel<50) x= "very sly";
        if(pet.tricklevel>50) x= "almost not sly";
        System.out.printf("I have a %s, he is a %d years old, he is %s",pet.species,pet.age,x);
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, byte iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;

    }
    public void feedPet(){
        boolean istime=false;
        Random rand = new Random();
        if(pet.tricklevel> rand.nextInt(100)) {
            istime=true;
            System.out.println("Hm... I will feed Jack's "+istime);
        }
        else if(pet.tricklevel< rand.nextInt(100)){
            istime=false;
            System.out.println("I think Jack is not hungry "+istime); }


    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
