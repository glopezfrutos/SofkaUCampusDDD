package com.sofkau.DramaFestivalDDD.festival.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.festival.values.Date;
import com.sofkau.DramaFestivalDDD.festival.values.FestivalId;

public class StartDateOfFestivalUpdated extends DomainEvent {
    private final FestivalId festivalId;
    private final Date festivalStartDate;

    public StartDateOfFestivalUpdated(FestivalId festivalId, Date festivalStartDate) {
        super("sofkau.festival.StartDateOfFestivalUpdated");
        this.festivalId = festivalId;
        this.festivalStartDate = festivalStartDate;
    }

    public FestivalId getFestivalId() {
        return festivalId;
    }

    public Date getFestivalStartDate() {
        return festivalStartDate;
    }
}
