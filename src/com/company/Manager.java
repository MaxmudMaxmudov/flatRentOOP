package com.company;

import java.util.*;

public class Manager {
    private Map<String, Flat> flatMap = new TreeMap<>();
    private Map<String , Client> clientMap = new TreeMap<>();
    private List<Booking> bookingList = new LinkedList<>();
    public Flat newFlat(String code, int smq) {
        Flat flat = new Flat(code, smq);
        flatMap.put(code, flat);
        return flat;
    }

    public Collection<Flat> getFlats() {
        return null;
    }

    public Client newClient(String name, String surname, String id) {
        Client client = new Client(name,surname,id);


       this.clientMap.put(id,client);

        return client;
    }

    public Client getClient(String id) {
        return this.clientMap.get(id);
    }

    public Collection<Client> getClients() {
        return this.clientMap.values();

    }

    public Booking bookFlat(String code, String id, int day, int month, int year, int week) {
        Flat flat = flatMap.get(code);
        Client client = clientMap.get(id);

        Booking booking = new Booking(flat,client,day,month,year,week);

        bookingList.add(booking);

        Calendar calendar= Calendar.getInstance();
        calendar.set(year,month,day);
        int weekNum= calendar.get(Calendar.WEEK_OF_YEAR);
        flat.setAvailability(weekNum,week);
        client.addWeeksNumber(week);

        return booking;
    }

}
