package com.sofkau.DramaFestivalDDD.executiveproducer;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.DramaPlay;
import com.sofkau.DramaFestivalDDD.executiveproducer.events.ExecutiveProducerCreated;
import com.sofkau.DramaFestivalDDD.executiveproducer.values.*;
import com.sofkau.DramaFestivalDDD.executiveproducer.events.*;
import com.sofkau.DramaFestivalDDD.festival.Festival;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class ExecutiveProducer extends AggregateEvent<ExecutiveProducerId> {
    protected Name name;
    protected Set<Festival> listOfFestivalsInCharge;
    protected Set<StageManager> stageManagers;
    protected Set<Technician> technicians;
    protected ExecutiveProducerId executiveProducerId;

    public ExecutiveProducer(ExecutiveProducerId entityId,
                             Name name,
                             Set<Festival> listOfFestivalsInCharge,
                             Set<StageManager> stageManagers,
                             Set<Technician> technicians,
                             ExecutiveProducerId executiveProducerId) {
        super(entityId);
        appendChange(new ExecutiveProducerCreated(name, listOfFestivalsInCharge,
                stageManagers, technicians, executiveProducerId)).apply();
    }

    public void updateExecutiveProducerName(ExecutiveProducerId entityId, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new ExecutiveProducerNameUpdated(entityId, name)).apply();
    }

    public void updateListOfFestivalsInCharge(Set<Festival> listOfFestivalsInCharge){
        Objects.requireNonNull(listOfFestivalsInCharge);
        appendChange(new ListOfFestivalsInChargeUpdated(listOfFestivalsInCharge)).apply();
    }

    public void addStageManager(StageManagerId entityId, Name name, Set<DramaPlay> listOfPlaysInCharge){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(listOfPlaysInCharge);
        appendChange(new StageManagerAdded(entityId, name, listOfPlaysInCharge)).apply();
    }

    public void updateStageManagerName(StageManagerId entityId, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new StageManagerNameUpdated(entityId, name)).apply();
    }

    public void updateStageManagerListOfPlaysInCharge(StageManagerId entityId, Set<Festival> listOfFestivalsInCharge){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(listOfFestivalsInCharge);
        appendChange(new StageManagerListOfPlaysInChargeUpdated(entityId, listOfFestivalsInCharge)).apply();
    }

    public void addTechnician(TechnicianId entityId, Name name, Set<DramaPlay> listOfPlaysInCharge, TechnicianType technicianType){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(listOfPlaysInCharge);
        Objects.requireNonNull(technicianType);
        appendChange(new TechnicianAdded(entityId, name, listOfPlaysInCharge, technicianType)).apply();
    }

    public void updateTechnicianName(TechnicianId entityId, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new TechnicianNameUpdated(entityId, name)).apply();
    }

    public void updateTechnicianListOfPlaysInCharge(TechnicianId entityId, Set<DramaPlay> listOfPlaysInCharge){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(listOfPlaysInCharge);
        appendChange(new TechnicianListOfPlaysInChargeUpdated(entityId, listOfPlaysInCharge)).apply();
    }

    public void updateTechnicianType(TechnicianId entityId, TechnicianType technicianType){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(technicianType);
        appendChange(new TechnicianTypeUpdated(entityId, technicianType)).apply();
    }

    public Optional<StageManager> getStageManagerById(StageManagerId entityId){
        return stageManagers()
                .stream()
                .filter(stageManager -> stageManager.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Technician> getPerformerById(TechnicianId entityId){
        return technicians()
                .stream()
                .filter(technician -> technician.identity().equals(entityId))
                .findFirst();
    }

    public Name name() {
        return name;
    }

    public Set<Festival> listOfFestivalsInCharge() {
        return listOfFestivalsInCharge;
    }

    public Set<StageManager> stageManagers() {
        return stageManagers;
    }

    public Set<Technician> technicians() {
        return technicians;
    }

    public ExecutiveProducerId executiveProducerId() {
        return executiveProducerId;
    }
}
