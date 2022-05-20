package com.sofkau.DramaFestivalDDD.dramaplay.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerId;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerIsUnderAge;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

public class PerformerAdded extends DomainEvent {
    private final PerformerId performerId;
    private final Name name;
    private final PerformerIsUnderAge performerIsUnderAge;

    public PerformerAdded(PerformerId performerId, Name name, PerformerIsUnderAge performerIsUnderAge) {
        super("sofkau.dramaplay.performeradded");
        this.performerId = performerId;
        this.name = name;
        this.performerIsUnderAge = performerIsUnderAge;
    }

    public PerformerId getPerformerId() {
        return performerId;
    }

    public Name getName() {
        return name;
    }

    public PerformerIsUnderAge getPerformerIsUnderAge() {
        return performerIsUnderAge;
    }
}
