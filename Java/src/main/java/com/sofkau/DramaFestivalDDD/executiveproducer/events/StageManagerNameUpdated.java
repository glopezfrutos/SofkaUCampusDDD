package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.StageManagerId;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

public class StageManagerNameUpdated extends DomainEvent {
    private final StageManagerId stageManagerId;
    private final Name name;

    public StageManagerNameUpdated(StageManagerId stageManagerId, Name name) {
        super("sofkau.executiveproducer.StageManagerNameUpdated");
        this.stageManagerId = stageManagerId;
        this.name = name;
    }

    public StageManagerId getStageManagerId() {
        return stageManagerId;
    }

    public Name getName() {
        return name;
    }
}
