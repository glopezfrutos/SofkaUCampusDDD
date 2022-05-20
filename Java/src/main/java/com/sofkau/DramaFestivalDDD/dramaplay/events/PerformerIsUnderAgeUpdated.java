package com.sofkau.DramaFestivalDDD.dramaplay.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerId;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerIsUnderAge;

public class PerformerIsUnderAgeUpdated extends DomainEvent {
    private final PerformerId performerId;
    private final PerformerIsUnderAge performerIsUnderAge;

    public PerformerIsUnderAgeUpdated(PerformerId performerId, PerformerIsUnderAge performerIsUnderAge) {
        super("sofkau.dramaplay.PerformerIsUnderAgeUpdated");
        this.performerId = performerId;
        this.performerIsUnderAge = performerIsUnderAge;
    }

    public PerformerId getPerformerId() {
        return performerId;
    }

    public PerformerIsUnderAge getPerformerIsUnderAge() {
        return performerIsUnderAge;
    }
}
