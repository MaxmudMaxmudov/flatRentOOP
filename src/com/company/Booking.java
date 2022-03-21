package com.company;

public class Booking {

    private Flat flat;
    private Client client;
    private int day;
    private int month;
    private int year;
    private int week;

    public Booking() {
    }

    public Booking(Flat flat, Client client, int day, int month, int year, int week) {
        this.flat = flat;
        this.client = client;
        this.day = day;
        this.month = month;
        this.year = year;
        this.week = week;
    }

    public Flat getFlat() {
        return flat;
    }

    public Client getClient() {
        return client;
    }

    public double getPrice() {
        if ((month == 7) || (month == 11 && day >= 20) || (month == 0 && day <= 6)) {
            return week *flat.getTariffs()[2] ;
        }else if(month==6){
            return week*flat.getTariffs()[1];
        }else {
            return week*flat.getTariffs()[0];
        }


    }

}
