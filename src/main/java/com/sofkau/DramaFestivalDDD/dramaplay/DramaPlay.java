package com.sofkau.DramaFestivalDDD.dramaplay;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.DramaPlayId;

public class DramaPlay extends AggregateEvent<DramaPlayId> {
    public DramaPlay(DramaPlayId entityId) {
        super(entityId);
    }
}
