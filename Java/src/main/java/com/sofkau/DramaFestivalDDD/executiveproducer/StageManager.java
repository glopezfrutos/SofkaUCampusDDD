package com.sofkau.DramaFestivalDDD.executiveproducer;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.shared.values.Name;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.StageManagerId;

import java.util.Objects;
import java.util.Set;

public class StageManager extends Entity<StageManagerId> {
    private Name stageManagerName;
    private Set<DramaPlay> listOfPlaysInCharge;

    public StageManager(StageManagerId entityId, Name stageManagerName, Set<DramaPlay> listOfPlaysInCharge) {
        super(entityId);
        this.stageManagerName = stageManagerName;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
    }

    public void updateStageManagerName(Name name){
        this.stageManagerName = Objects.requireNonNull(name);
    }

    public void updateListOfPlaysInCharge(Set<DramaPlay> listOfPlaysInCharge){
        this.listOfPlaysInCharge = Objects.requireNonNull(listOfPlaysInCharge);
    }

    public Name stageManagerName() {
        return stageManagerName;
    }

    public Set<DramaPlay> listOfPlaysInCharge() {
        return listOfPlaysInCharge;
    }
}
