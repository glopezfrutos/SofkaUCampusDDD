package com.sofkau.DramaFestivalDDD.dramaplay;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.shared.values.Name;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerId;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerIsUnderAge;

import java.util.Objects;

public class Performer extends Entity<PerformerId> {
    private Name performerName;
    private PerformerIsUnderAge performerIsUnderAge;

    public Performer(PerformerId entityId, Name performerName, PerformerIsUnderAge performerIsUnderAge) {
        super(entityId);
        this.performerName = performerName;
        this.performerIsUnderAge = performerIsUnderAge;
    }

    public void updatePerformerName(Name name){
        this.performerName = Objects.requireNonNull(name);
    }

    public void updatePerformerIsUnderAge(PerformerIsUnderAge performerIsUnderAge){
        this.performerIsUnderAge = Objects.requireNonNull(performerIsUnderAge);
    }

    public Name performerName() {
        return performerName;
    }

    public PerformerIsUnderAge performerIsUnderAge() {
        return performerIsUnderAge;
    }
}
