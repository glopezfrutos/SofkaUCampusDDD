package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.ExecutiveProducerId;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

public class ExecutiveProducerNameUpdated extends DomainEvent {
    private final ExecutiveProducerId executiveProducerId;
    private final Name name;

    public ExecutiveProducerNameUpdated(ExecutiveProducerId executiveProducerId, Name name) {
        super("sofkau.dramaplay.ExecutiveProducerNameUpdated");
        this.executiveProducerId = executiveProducerId;
        this.name = name;
    }

    public ExecutiveProducerId getExecutiveProducerId() {
        return executiveProducerId;
    }

    public Name getName() {
        return name;
    }
}
