package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianId;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianType;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

import java.util.Set;

public class TechnicianAdded extends DomainEvent {
    private final TechnicianId technicianId;
    private final Name name;
    private final Set<DramaPlay> listOfPlaysInCharge;
    private final TechnicianType technicianType;

    public TechnicianAdded(TechnicianId technicianId, Name name, Set<DramaPlay> listOfPlaysInCharge, TechnicianType technicianType) {
        super("sofkau.executiveproducer.TechnicianAdded");
        this.technicianId = technicianId;
        this.name = name;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
        this.technicianType = technicianType;
    }

    public TechnicianId getTechnicianId() {
        return technicianId;
    }

    public Name getName() {
        return name;
    }

    public Set<DramaPlay> getListOfPlaysInCharge() {
        return listOfPlaysInCharge;
    }

    public TechnicianType getTechnicianType() {
        return technicianType;
    }
}
