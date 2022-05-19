package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.Name;

public class ExecutiveProducerCreated extends DomainEvent {
    private final Name name;

    public ExecutiveProducerCreated(Name name) {
        super("sofkau.executiveproducer.executiveproducercreated");
        this.name = name;
    }

    public Name getName(){
        return name;
    }
}
