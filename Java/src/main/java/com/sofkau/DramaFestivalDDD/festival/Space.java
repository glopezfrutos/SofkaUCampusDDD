package com.sofkau.DramaFestivalDDD.festival;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.shared.values.Name;
import com.sofkau.DramaFestivalDDD.festival.values.SpaceId;

import java.util.Objects;

public class Space extends Entity<SpaceId> {
    private Name spaceName;

    public Space(SpaceId entityId, Name spaceName) {
        super(entityId);
        this.spaceName = spaceName;
    }

    public void updateSpaceName(Name name){
        this.spaceName = Objects.requireNonNull(name);
    }

    public Name spaceName() {
        return spaceName;
    }
}
