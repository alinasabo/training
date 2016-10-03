package com.msgsystems.training.w02d02.model;

import java.util.ArrayList;

/**
 * Created by saboa on 26/09/2016.
 */
public class Store {

    private int floor;
    private String name;
    private String adress;
    private String telepone;
    private ArrayList<Product> productsList;

    public Store(int floor, String name, String adress, String telepone, ArrayList<Product> productsList) {
        this.floor = floor;
        this.name = name;
        this.adress = adress;
        this.telepone = telepone;
        this.productsList = productsList;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelepone() {
        return telepone;
    }

    public void setTelepone(String telepone) {
        this.telepone = telepone;
    }

    @Override
    public String toString() {
        return "Store{" +
                "floor=" + floor +
                ", name='" + name + '\'' +
                ", productsList=" + productsList +
                '}';
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }
}
