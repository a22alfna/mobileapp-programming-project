package com.example.project;

public class Cities {
    private String ID;
    private String name;
    private String location;
    private int size;
    private int cost;



    public Cities(String ID, String name, String location, int size, int cost) {
        this.ID = ID;
        this.name = name;
        this.location = location;
        this.size = size;
        this.cost = cost;
    }


    public String getid() {

        return ID;
    }

    public void setID(String ID) {

        this.ID = ID;
    }



    public String getname() {

        return name;
    }

    public void setname (String name) {

        this.name = name;
    }



    public String getlocation() {

        return location;
    }

    public void setlocation(String location) {

        this.location = location;
    }



    public int getsize() {

        return size;
    }

    public void setsize(int size) {

        this.size = size;
    }


    public int getcost() {

        return cost;
    }

    public void setcost(int cost) {

        this.cost = cost;
    }



}
