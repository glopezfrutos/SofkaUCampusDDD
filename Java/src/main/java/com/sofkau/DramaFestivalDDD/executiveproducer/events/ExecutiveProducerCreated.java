package com.sofkau.DramaFestivalDDD.executiveproducer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.executiveproducer.StageManager;
import com.sofkau.DramaFestivalDDD.executiveproducer.Technician;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.ExecutiveProducerId;
import com.sofkau.DramaFestivalDDD.festival.Festival;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

import java.util.Set;

public class ExecutiveProducerCreated extends DomainEvent{
    private final Name name;
    private final Set<Festival> listOfFestivalsInCharge;
    private final Set<StageManager> stageManagers;
    private final Set<Technician> technicians;
    private final ExecutiveProducerId executiveProducerId;

    public ExecutiveProducerCreated(Name name, Set<Festival> listOfFestivalsInCharge, Set<StageManager> stageManagers, Set<Technician> technicians, ExecutiveProducerId executiveProducerId) {
        super("sofkau.executiveproducer.executiveproducercreated");
        this.name = name;
        this.listOfFestivalsInCharge = listOfFestivalsInCharge;
        this.stageManagers = stageManagers;
        this.technicians = technicians;
        this.executiveProducerId = executiveProducerId;
    }

    public Name getName(){
        return name;
    }

    public Set<Festival> getListOfFestivalsInCharge() {
        return listOfFestivalsInCharge;
    }

    public Set<StageManager> getStageManagers() {
        return stageManagers;
    }

    public Set<Technician> getTechnicians() {
        return technicians;
    }

    public ExecutiveProducerId getExecutiveProducerId() {
        return executiveProducerId;
    }
}
