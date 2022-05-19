package com.sofkau.DramaFestivalDDD.festival;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.festival.values.Name;
import com.sofkau.DramaFestivalDDD.festival.values.SpaceId;

import java.util.Objects;

public class Space extends Entity<SpaceId> {
    private Name name;

    public Space(SpaceId entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public Name name() {
        return name;
    }
}
