package com.sofkau.DramaFestivalDDD.festival.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.festival.values.Date;
import com.sofkau.DramaFestivalDDD.festival.values.FestivalId;

public class EndDateOfFestivalUpdated extends DomainEvent {
    private final FestivalId festivalId;
    private final Date festivalEndDate;

    public EndDateOfFestivalUpdated(FestivalId festivalId, Date festivalEndDate) {
        super("sofkau.festival.EndDateOfFestivalUpdated");
        this.festivalId = festivalId;
        this.festivalEndDate = festivalEndDate;
    }

    public FestivalId getFestivalId() {
        return festivalId;
    }

    public Date getFestivalEndDate() {
        return festivalEndDate;
    }
}
