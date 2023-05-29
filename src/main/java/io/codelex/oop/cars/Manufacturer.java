package io.codelex.oop.cars;

import java.util.Objects;

class Manufacturer {

    private String name, country;
    private int yearOfEstablishment;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, country, yearOfEstablishment);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Manufacturer)) {
            return false;
        }
        Manufacturer o = (Manufacturer) obj;
        boolean isEqual = (this.name.equals(o.name) && this.country.equals(o.country) && this.yearOfEstablishment == o.yearOfEstablishment);
        return isEqual;
    }
}
