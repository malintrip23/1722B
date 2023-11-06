import java.util.Scanner;

public class Problema3_Dog {

    private String name;
    private String breed;

    public Problema3_Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }


    public static void main(String[] args) {
        Problema3_Dog dog1 = new Problema3_Dog("max", "labrador");
        Problema3_Dog dog2 = new Problema3_Dog("rex", "pitbull");

        dog1.setName("ice");
        dog2.setBreed("chow");

        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
        System.out.println(dog2.getName());
        System.out.println(dog2.getBreed());
    }
}
