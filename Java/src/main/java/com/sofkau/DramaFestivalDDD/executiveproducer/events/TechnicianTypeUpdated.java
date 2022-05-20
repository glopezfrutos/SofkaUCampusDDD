package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianId;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.TechnicianType;

public class TechnicianTypeUpdated extends DomainEvent {
    private final TechnicianId technicianId;
    private final TechnicianType technicianType;

    public TechnicianTypeUpdated(TechnicianId technicianId, TechnicianType technicianType) {
        super("sofkau.executiveproducer.TechnicianTypeUpdated");
        this.technicianId = technicianId;
        this.technicianType = technicianType;
    }

    public TechnicianId getTechnicianId() {
        return technicianId;
    }

    public TechnicianType getTechnicianType() {
        return technicianType;
    }
}
