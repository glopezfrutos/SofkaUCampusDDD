package com.sofkau.DramaFestivalDDD.executiveproducer;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.DramaFestivalDDD.executiveproducer.events.*;

import java.util.HashSet;

public class ExecutiveProducerChange extends EventChange {
    public ExecutiveProducerChange(ExecutiveProducer executiveProducer) {
        apply((ExecutiveProducerCreated event) -> {
            executiveProducer.name = event.getName();
            executiveProducer.listOfFestivalsInCharge = new HashSet<>();
            executiveProducer.stageManagers = new HashSet<>();
            executiveProducer.technicians = new HashSet<>();
        });

        apply((ExecutiveProducerNameUpdated event) -> {
            executiveProducer.name = event.getName();
        });

        apply((ListOfFestivalsInChargeUpdated event) -> {
            executiveProducer.listOfFestivalsInCharge = event.getListOfFestivalsInCharge();
        });

        apply((StageManagerAdded event) -> {
            executiveProducer.stageManagers.add(new StageManager(
                    event.getStageManagerId(),
                    event.getName(),
                    event.getListOfPlaysInCharge()
            ));
        });

        apply((StageManagerNameUpdated event) -> {
            var stageManager = executiveProducer.getStageManagerById(event.getStageManagerId())
                    .orElseThrow(() -> new IllegalArgumentException("Stage Manager not found."));
            stageManager.updateStageManagerName(event.getName());
        });

        apply((StageManagerListOfPlaysInChargeUpdated event) -> {
            var stageManager = executiveProducer.getStageManagerById(event.getStageManagerId())
                    .orElseThrow(() -> new IllegalArgumentException("Stage Manager not found."));
            stageManager.updateListOfPlaysInCharge(event.getListOfPlaysInCharge());
        });

        apply((TechnicianAdded event) -> {
            executiveProducer.technicians.add(new Technician(
                    event.getTechnicianId(),
                    event.getName(),
                    event.getListOfPlaysInCharge(),
                    event.getTechnicianType()
            ));
        });

        apply((TechnicianNameUpdated event) -> {
            var technician = executiveProducer.getTechnicianById(event.getTechnicianId())
                    .orElseThrow(() -> new IllegalArgumentException("Technician not found."));
            technician.updateTechnicianName(event.getName());
        });

        apply((TechnicianListOfPlaysInChargeUpdated event) -> {
            var technician = executiveProducer.getTechnicianById(event.getTechnicianId())
                    .orElseThrow(() -> new IllegalArgumentException("Technician not found."));
            technician.updateListOfPlaysInCharge(event.getListOfPlaysInCharge());
        });

        apply((TechnicianTypeUpdated event) -> {
            var technician = executiveProducer.getTechnicianById(event.getTechnicianId())
                    .orElseThrow(() -> new IllegalArgumentException("Technician not found."));
            technician.updateTechnicianType(event.getTechnicianType());
        });
    }
}
