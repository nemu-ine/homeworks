package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {

    private String jobTitle;

    Employee(String firstName, String lastName, String address, int id, String jobTitle) {
        super(firstName, lastName, address, id);
        this.jobTitle = jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Job title: " + jobTitle);
    }

}
