package io.codelex.classesandobjects.practice;

public class DogTest {

    public static void main(String[] args) {

        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");

        max.setMother(lady);
        max.setFather(rocky);
        coco.setMother(molly);
        coco.setFather(buster);
        rocky.setMother(molly);
        rocky.setFather(sam);
        buster.setMother(lady);
        buster.setFather(sparky);

        System.out.println(coco.fathersName());
        System.out.println(sparky.fathersName());
        System.out.println(coco.hasSameMotherAs(rocky));

    }

}
