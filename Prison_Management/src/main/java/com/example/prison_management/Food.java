package com.example.prison_management;

public class Food {
    protected String name;
    protected String type;
    protected String Date;

    public Food(String name, String type, String Date) {
        this.name = name;
        this.type = type;
        this.Date = Date;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
