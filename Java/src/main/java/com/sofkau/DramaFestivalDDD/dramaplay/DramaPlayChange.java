package com.sofkau.DramaFestivalDDD.dramaplay;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.DramaFestivalDDD.dramaplay.events.*;

import java.util.HashSet;

public class DramaPlayChange extends EventChange {
    public DramaPlayChange(DramaPlay dramaPlay) {
        apply((DramaPlayCreated event) -> {
          dramaPlay.name = event.getName();
          dramaPlay.requirements = new HashSet<>();
          dramaPlay.performers = new HashSet<>();
        });

        apply((DramaPlayNameUpdated event) -> {
            dramaPlay.name = event.getName();
        });

        apply((RequirementAdded event) -> {
            var maxAllowed = dramaPlay.requirements().size();
            if (maxAllowed == 4) {
                throw new IllegalArgumentException("Maximum 4 requirements allowed.");
            }
            dramaPlay.requirements.add(new Requirement(
                    event.getRequirementId(),
                    event.getRequirementType(),
                    event.getRequirementDescription()
            ));
        });

        apply((RequirementTypeUpdated event) -> {
            var requirement = dramaPlay.getRequirementById(event.getRequirementId())
                    .orElseThrow(() -> new IllegalArgumentException("Requirement not found."));
            requirement.updateRequirementType(event.getRequirementType());
        });

        apply((RequirementDescriptionUpdated event) -> {
            var requirement = dramaPlay.getRequirementById(event.getRequirementId())
                    .orElseThrow(() -> new IllegalArgumentException("Requirement not found."));
            requirement.updateRequirementDescription(event.getRequirementDescription());
        });

        apply((PerformerAdded event) -> {
            var maxAllowed = dramaPlay.performers().size();
            if (maxAllowed == 20) {
                throw new IllegalArgumentException("Maximum 20 performers allowed.");
            }
            dramaPlay.performers.add(new Performer(
                    event.getPerformerId(),
                    event.getName(),
                    event.getPerformerIsUnderAge()
            ));
        });

        apply((PerformerNameUpdated event) -> {
            var performer = dramaPlay.getPerformerById(event.getPerformerId())
                    .orElseThrow(() -> new IllegalArgumentException("Performer not found."));
            performer.updatePerformerName(event.getName());
        });

        apply((PerformerIsUnderAgeUpdated event) -> {
            var performer = dramaPlay.getPerformerById(event.getPerformerId())
                    .orElseThrow(() -> new IllegalArgumentException("Performer not found."));
            performer.updatePerformerIsUnderAge(event.getPerformerIsUnderAge());
        });
    }
}
