package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.StageManagerId;
import com.sofkau.DramaFestivalDDD.festival.Festival;

import java.util.Set;

public class StageManagerListOfPlaysInChargeUpdated extends DomainEvent {
    private final StageManagerId stageManagerId;
    private final Set<DramaPlay> listOfPlaysInCharge;

    public StageManagerListOfPlaysInChargeUpdated(StageManagerId stageManagerId, Set<DramaPlay> listOfPlaysInCharge) {
        super("sofkau.executiveproducer.StageManagerListOfPlaysInChargeUpdated");
        this.stageManagerId = stageManagerId;
        this.listOfPlaysInCharge = listOfPlaysInCharge;
    }

    public StageManagerId getStageManagerId() {
        return stageManagerId;
    }

    public Set<DramaPlay> getListOfPlaysInCharge() {
        return listOfPlaysInCharge;
    }
}
