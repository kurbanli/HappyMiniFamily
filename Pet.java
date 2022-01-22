package Step1;

import java.util.Arrays;

public class Pet {
    public Pet(){
    }
    String species;
    String nickname;
    byte age;
    int tricklevel;
    String [] habits;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, byte age, byte tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.printf("Hello, owner. -%s. I am I miss you!",nickname);
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species+"{" +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

}
