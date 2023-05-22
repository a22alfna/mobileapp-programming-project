package com.example.project;

public class Cities {
    private String citiesID;
    private String citiesName;
    private String citiesLocation;
    private int citiesSize;
    private int citiesCost;



    public Cities(String id, String name, String location, int size, int cost) {
        this.citiesID = id;
        this.citiesName = name;
        this.citiesLocation = location;
        this.citiesSize = size;
        this.citiesCost = cost;
    }


    public String getid() {

        return citiesID;
    }

    public void setid(String id) {

        this.citiesID = id;
    }



    public String getName() {

        return citiesName;
    }

    public void setName(String name) {

        this.citiesName = name;
    }



    public String getlocation() {

        return citiesLocation;
    }

    public void setlocation(String location) {

        this.citiesLocation = location;
    }



    public int getSize() {

        return citiesSize;
    }

    public void setSize(int size) {

        this.citiesSize = size;
    }


    public int getcost() {

        return citiesCost;
    }

    public void setcost(int cost) {

        this.citiesCost = cost;
    }


}
