package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.StageManagerId;
import com.sofkau.DramaFestivalDDD.festival.Festival;

import java.util.Set;

public class StageManagerListOfPlaysInChargeUpdated extends DomainEvent {
    private final StageManagerId stageManagerId;
    private final Set<Festival> listOfFestivalsInCharge;

    public StageManagerListOfPlaysInChargeUpdated(StageManagerId stageManagerId, Set<Festival> listOfFestivalsInCharge) {
        super("sofkau.executiveproducer.StageManagerListOfPlaysInChargeUpdated");
        this.stageManagerId = stageManagerId;
        this.listOfFestivalsInCharge = listOfFestivalsInCharge;
    }

    public StageManagerId getStageManagerId() {
        return stageManagerId;
    }

    public Set<Festival> getListOfFestivalsInCharge() {
        return listOfFestivalsInCharge;
    }
}
