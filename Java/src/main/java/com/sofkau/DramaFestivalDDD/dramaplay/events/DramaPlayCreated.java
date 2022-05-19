package com.sofkau.DramaFestivalDDD.dramaplay.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.Name;

public class DramaPlayCreated extends DomainEvent {
    private final Name name;

    public DramaPlayCreated(Name name) {
        super("sofkau.dramaplay.dramaplaycreated");
        this.name = name;
    }

    public Name getName(){
        return name;
    }
}
