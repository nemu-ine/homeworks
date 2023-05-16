package io.codelex.classesandobjects.practice;

class Dog {
    final private String name, gender;
    private Dog mother, father;

    public Dog(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ")";
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        }
        return father.name;
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother == null || otherDog.mother == null) {
            return false;
        }
        return mother.name.equals(otherDog.mother.name);
    }

}

