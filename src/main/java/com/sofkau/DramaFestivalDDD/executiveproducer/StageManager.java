package com.sofkau.DramaFestivalDDD.executiveproducer;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.Name;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.StageManagerId;

import java.util.Set;

public class StageManager extends Entity<StageManagerId> {
    private final Name name;
    private final Set<DramaPlay> listOfPlaysInCharge;

    public StageManager(StageManagerId entityId, Name name, Set<DramaPlay> listOfPlaysInCharge) {
        super(entityId);
        this.name = name;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
    }

    public Name name() {
        return name;
    }

    public Set<DramaPlay> listOfPlaysInCharge() {
        return listOfPlaysInCharge;
    }
}
