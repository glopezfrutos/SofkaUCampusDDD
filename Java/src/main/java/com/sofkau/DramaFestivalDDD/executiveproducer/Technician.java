package com.sofkau.DramaFestivalDDD.executiveproducer;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.shared.values.Name;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianId;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianType;

import java.util.Objects;
import java.util.Set;

public class Technician extends Entity<TechnicianId> {
    private Name technicianName;
    private Set<DramaPlay> listOfPlaysInCharge;
    private TechnicianType technicianType;

    public Technician(TechnicianId entityId, Name technicianName, Set<DramaPlay> listOfPlaysInCharge, TechnicianType technicianType) {
        super(entityId);
        this.technicianName = technicianName;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
        this.technicianType = technicianType;
    }

    public void updateTechnicianName(Name name){
        this.technicianName = Objects.requireNonNull(name);
    }

    public void updateListOfPlaysInCharge(Set<DramaPlay> listOfPlaysInCharge){
        this.listOfPlaysInCharge = Objects.requireNonNull(listOfPlaysInCharge);
    }

    public void updateTechnicianType(TechnicianType technicianType){
        this.technicianType = Objects.requireNonNull(technicianType);
    }

    public Name technicianName() {
        return technicianName;
    }

    public Set<DramaPlay> listOfPlaysInCharge() {
        return listOfPlaysInCharge;
    }

    public TechnicianType tchnicianType() {
        return technicianType;
    }
}
