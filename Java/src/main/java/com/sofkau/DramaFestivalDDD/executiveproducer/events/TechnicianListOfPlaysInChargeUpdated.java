package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianId;

import java.util.Set;

public class TechnicianListOfPlaysInChargeUpdated extends DomainEvent {
    private final TechnicianId technicianId;
    private final Set<DramaPlay> listOfPlaysInCharge;

    public TechnicianListOfPlaysInChargeUpdated(TechnicianId technicianId, Set<DramaPlay> listOfPlaysInCharge) {
        super("sofkau.executiveproducer.StageManagerAdded");
        this.technicianId = technicianId;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
    }

    public TechnicianId getTechnicianId() {
        return technicianId;
    }

    public Set<DramaPlay> getListOfPlaysInCharge() {
        return listOfPlaysInCharge;
    }
}
