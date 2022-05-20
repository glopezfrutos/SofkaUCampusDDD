package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.festival.Festival;

import java.util.Set;

public class ListOfFestivalsInChargeUpdated extends DomainEvent {
    private final Set<Festival> listOfFestivalsInCharge;

    public ListOfFestivalsInChargeUpdated(Set<Festival> listOfFestivalsInCharge) {
        super("sofkau.dramaplay.ListOfFestivalsInChargeUpdated");
        this.listOfFestivalsInCharge = listOfFestivalsInCharge;
    }

    public Set<Festival> getListOfFestivalsInCharge() {
        return listOfFestivalsInCharge;
    }
}
