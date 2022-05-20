package com.sofkau.DramaFestivalDDD.festival.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

public class FestivalCreated extends DomainEvent {
    private final Name name;

    public FestivalCreated(Name name) {
        super("sofkau.festival.festivalcreated");
        this.name = name;
    }

    public Name getName(){
        return name;
    }
}
