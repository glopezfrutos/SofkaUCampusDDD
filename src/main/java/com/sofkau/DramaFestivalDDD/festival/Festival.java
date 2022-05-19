package com.sofkau.DramaFestivalDDD.festival;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.DramaFestivalDDD.festival.values.FestivalId;

public class Festival extends AggregateEvent<FestivalId> {
    public Festival(FestivalId entityId) {
        super(entityId);
    }
}
