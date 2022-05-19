package com.sofkau.DramaFestivalDDD.dramaplay;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.values.Name;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerId;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerIsUnderAge;

public class Performer extends Entity<PerformerId> {
    private final Name name;
    private final PerformerIsUnderAge performerIsUnderAge;

    public Performer(PerformerId entityId, Name name, PerformerIsUnderAge performerIsUnderAge) {
        super(entityId);
        this.name = name;
        this.performerIsUnderAge = performerIsUnderAge;
    }

    public Name name() {
        return name;
    }

    public PerformerIsUnderAge getPerformerIsUnderAge() {
        return performerIsUnderAge;
    }
}
