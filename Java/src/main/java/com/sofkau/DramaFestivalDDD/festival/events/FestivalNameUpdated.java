package com.sofkau.DramaFestivalDDD.festival.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.festival.values.FestivalId;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

public class FestivalNameUpdated extends DomainEvent {
    private final FestivalId festivalId;
    private final Name name;

    public FestivalNameUpdated(FestivalId festivalId, Name name) {
        super("sofkau.festival.FestivalNameUpdated");
        this.festivalId = festivalId;
        this.name = name;
    }

    public FestivalId getFestivalId() {
        return festivalId;
    }

    public Name getName() {
        return name;
    }
}
