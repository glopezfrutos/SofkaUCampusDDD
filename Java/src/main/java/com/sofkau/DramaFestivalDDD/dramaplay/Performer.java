package com.sofkau.DramaFestivalDDD.dramaplay;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.values.Name;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerId;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerIsUnderAge;

import java.util.Objects;

public class Performer extends Entity<PerformerId> {
    private Name name;
    private PerformerIsUnderAge performerIsUnderAge;

    public Performer(PerformerId entityId, Name name, PerformerIsUnderAge performerIsUnderAge) {
        super(entityId);
        this.name = name;
        this.performerIsUnderAge = performerIsUnderAge;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updatePerformerIsUnderAge(PerformerIsUnderAge performerIsUnderAge){
        this.performerIsUnderAge = Objects.requireNonNull(performerIsUnderAge);
    }

    public Name name() {
        return name;
    }

    public PerformerIsUnderAge performerIsUnderAge() {
        return performerIsUnderAge;
    }
}
