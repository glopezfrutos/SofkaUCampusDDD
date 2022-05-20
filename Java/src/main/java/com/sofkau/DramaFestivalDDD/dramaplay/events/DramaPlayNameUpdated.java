package com.sofkau.DramaFestivalDDD.dramaplay.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.DramaPlayId;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

public class DramaPlayNameUpdated extends DomainEvent {
    private final DramaPlayId dramaPlayId;
    private final Name name;

    public DramaPlayNameUpdated(DramaPlayId dramaPlayId, Name name) {
        super("sofkau.dramaplay.dramaplaynameupdated");
        this.dramaPlayId = dramaPlayId;
        this.name = name;
    }

    public DramaPlayId getDramaPlayId() {
        return dramaPlayId;
    }

    public Name getName() {
        return name;
    }
}
