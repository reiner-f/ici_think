package org.oop.app;

public class University {
    private String name;
    private String country;
    private int ranking;

// Constructor, getteri, setteri
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

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public University(String name, String country, int ranking) {
        this.name = name;
        this.country = country;
        this.ranking = ranking;
    }
}
