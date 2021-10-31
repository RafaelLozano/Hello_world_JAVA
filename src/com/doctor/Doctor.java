package com.doctor;

public class Doctor {
    static int id = 0;
    public Doctor(){
        System.out.println("Contruyendo objeto");
        id++;
    }
    public void showId(){
        System.out.println("El id es: " + id);
    }
}
