package com.sofkau.DramaFestivalDDD.festival.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.festival.values.SpaceId;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

public class SpaceAdded extends DomainEvent {
    private final SpaceId spaceId;
    private final Name name;

    public SpaceAdded(SpaceId spaceId, Name name) {
        super("sofkau.festival.SpaceAdded");
        this.spaceId = spaceId;
        this.name = name;
    }

    public SpaceId getSpaceId() {
        return spaceId;
    }

    public Name getName() {
        return name;
    }
}
