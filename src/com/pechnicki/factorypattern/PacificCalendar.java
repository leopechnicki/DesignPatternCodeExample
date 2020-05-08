package com.pechnicki.factorypattern;

import java.util.List;

public class PacificCalendar extends Calendar{
    public PacificCalendar(ZoneFactory zoneFactory) {
        zone = zoneFactory.createZone("US/Central");
        // make a calendar for the pacific zone
        // ...
    }
    public void createCalendar(List<String> appointments) {
        // make calendar from appointments
        System.out.println("Making the calendar");
    }
}
