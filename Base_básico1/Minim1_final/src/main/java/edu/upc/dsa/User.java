package edu.upc.dsa;

import java.util.ArrayList;

public class User {

    String name;
    String surname;

    String s;

    ArrayList<Order> llistaOrdres;

    public User(String s, String n, String sur) {
        this.s = s;
        this.name = n;
        this.surname = sur;
        llistaOrdres = new ArrayList<Order>();
    }

    public void addOrder(Order o) {
        llistaOrdres.add(o);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public ArrayList<Order> orders() {
        return llistaOrdres;
    }

    public void setLlistaOrdres(ArrayList<Order> llistaOrdres) {
        this.llistaOrdres = llistaOrdres;
    }
    public User(){

    }
}
