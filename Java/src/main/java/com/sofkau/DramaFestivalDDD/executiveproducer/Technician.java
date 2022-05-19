package com.sofkau.DramaFestivalDDD.executiveproducer;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.Name;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianId;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianType;

import java.util.Objects;
import java.util.Set;

public class Technician extends Entity<TechnicianId> {
    private Name name;
    private Set<DramaPlay> listOfPlaysInCharge;
    private TechnicianType technicianType;

    public Technician(TechnicianId entityId, Name name, Set<DramaPlay> listOfPlaysInCharge, TechnicianType technicianType) {
        super(entityId);
        this.name = name;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
        this.technicianType = technicianType;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateListOfPlaysInCharge(Set<DramaPlay> listOfPlaysInCharge){
        this.listOfPlaysInCharge = Objects.requireNonNull(listOfPlaysInCharge);
    }

    public void updateTechnicianType(TechnicianType technicianType){
        this.technicianType = Objects.requireNonNull(technicianType);
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
