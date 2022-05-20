package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.StageManagerId;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

import java.util.Set;

public class StageManagerAdded extends DomainEvent {
    private final StageManagerId stageManagerId;
    private final Name name;
    private final Set<DramaPlay> listOfPlaysInCharge;

    public StageManagerAdded(StageManagerId stageManagerId, Name name, Set<DramaPlay> listOfPlaysInCharge) {
        super("sofkau.executiveproducer.StageManagerAdded");
        this.stageManagerId = stageManagerId;
        this.name = name;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
    }

    public StageManagerId getStageManagerId() {
        return stageManagerId;
    }

    public Name getName() {
        return name;
    }

    public Set<DramaPlay> getListOfPlaysInCharge() {
        return listOfPlaysInCharge;
    }
}
