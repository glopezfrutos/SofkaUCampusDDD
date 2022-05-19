package com.sofkau.DramaFestivalDDD.executiveproducer;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.Name;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianId;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianType;

import java.util.Set;

public class Technician extends Entity<TechnicianId> {
    private final Name name;
    private final Set<DramaPlay> listOfPlaysInCharge;
    private final TechnicianType technicianType;

    public Technician(TechnicianId entityId, Name name, Set<DramaPlay> listOfPlaysInCharge, TechnicianType technicianType) {
        super(entityId);
        this.name = name;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
        this.technicianType = technicianType;
    }

    public Name name() {
        return name;
    }

    public Set<DramaPlay> listOfPlaysInCharge() {
        return listOfPlaysInCharge;
    }

    public TechnicianType tchnicianType() {
        return technicianType;
    }
}
