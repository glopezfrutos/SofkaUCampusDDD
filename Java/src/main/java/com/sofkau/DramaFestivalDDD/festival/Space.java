package com.sofkau.DramaFestivalDDD.festival;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.festival.values.Name;
import com.sofkau.DramaFestivalDDD.festival.values.SpaceId;

public class Space extends Entity<SpaceId> {
    private final Name name;

    public Space(SpaceId entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    public Name name() {
        return name;
    }
}
