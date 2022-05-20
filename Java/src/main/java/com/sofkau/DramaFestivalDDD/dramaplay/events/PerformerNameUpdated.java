package com.sofkau.DramaFestivalDDD.dramaplay.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerId;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

public class PerformerNameUpdated extends DomainEvent {
    private final PerformerId performerId;
    private final Name name;

    public PerformerNameUpdated(PerformerId performerId, Name name) {
        super("sofkau.dramaplay.PerformerNameUpdated");
        this.performerId = performerId;
        this.name = name;
    }

    public PerformerId getPerformerId() {
        return performerId;
    }

    public Name getName() {
        return name;
    }
}
