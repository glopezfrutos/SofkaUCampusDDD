package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianId;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

public class TechnicianNameUpdated extends DomainEvent {
    private final TechnicianId technicianId;
    private final Name name;

    public TechnicianNameUpdated(TechnicianId technicianId, Name name) {
        super("sofkau.executiveproducer.TechnicianNameUpdated");
        this.technicianId = technicianId;
        this.name = name;
    }

    public TechnicianId getTechnicianId() {
        return technicianId;
    }

    public Name getName() {
        return name;
    }
}
