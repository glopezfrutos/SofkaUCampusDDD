package com.sofkau.DramaFestivalDDD.executiveproducer;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.DramaFestivalDDD.executiveproducer.events.ExecutiveProducerCreated;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.ExecutiveProducerId;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.Name;
import com.sofkau.DramaFestivalDDD.festival.Festival;

import java.util.Set;

public class ExecutiveProducer extends AggregateEvent<ExecutiveProducerId> {
    protected Name name;
    protected Set<Festival> listOfFestivalsInCharge;
    protected Set<StageManager> stageManagers;
    protected Set<Technician> technicians;
    protected ExecutiveProducerId executiveProducerId;

    public ExecutiveProducer(ExecutiveProducerId entityId, Name name) {
        super(entityId);
        appendChange(new ExecutiveProducerCreated(name)).apply();
    }
}
