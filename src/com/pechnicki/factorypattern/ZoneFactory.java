package com.pechnicki.factorypattern;

public class ZoneFactory{
    public Zone createZone(String zoneId) {
        Zone zone = null;
        if (zoneId == "US/Central") {
            zone = new ZoneUSCentral();
        }
        else if (zoneId == "US/Eastern") {
            zone = new ZoneUSEastern();
        }
        return zone;
    }
}
