package com.sofkau.DramaFestivalDDD.executiveproducer;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementDescription;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementType;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.Name;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.StageManagerId;

import java.util.Objects;
import java.util.Set;

public class StageManager extends Entity<StageManagerId> {
    private Name name;
    private Set<DramaPlay> listOfPlaysInCharge;

    public StageManager(StageManagerId entityId, Name name, Set<DramaPlay> listOfPlaysInCharge) {
        super(entityId);
        this.name = name;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateListOfPlaysInCharge(Set<DramaPlay> listOfPlaysInCharge){
        this.listOfPlaysInCharge = Objects.requireNonNull(listOfPlaysInCharge);
    }

    public Name name() {
        return name;
    }

    public Set<DramaPlay> listOfPlaysInCharge() {
        return listOfPlaysInCharge;
    }
}
