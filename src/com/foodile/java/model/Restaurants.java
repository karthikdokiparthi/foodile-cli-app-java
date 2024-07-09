package com.foodile.java.model;

import java.util.List;
import java.util.Objects;

public class Restaurants {
    private String id;
    private String name;
    private String address;
    private List<String> menu;

    // Getter for restaurantId
    public String getId() {
        return id;
    }

    // Setter for restaurantId
    public Restaurants setId(String id) {
        this.id = id;
        return this;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public Restaurants setName(String name) {
        this.name = name;
        return this;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public Restaurants setAddress(String address) {
        this.address = address;
        return this;
    }

    // Getter for menu
    public List<String> getMenu() {
        return menu;
    }

    // Setter for menu
    public Restaurants setMenu(List<String> menu) {
        this.menu = menu;
        return this;
    }



    // Overriding hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, menu);
    }

    // Overriding equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Restaurants restaurant = (Restaurants) obj;
        return Objects.equals(id, restaurant.id) &&
                Objects.equals(name, restaurant.name) &&
                Objects.equals(address, restaurant.address) &&
                Objects.equals(menu, restaurant.menu);
    }

    // Overriding toString
    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                '}';
    }
}
