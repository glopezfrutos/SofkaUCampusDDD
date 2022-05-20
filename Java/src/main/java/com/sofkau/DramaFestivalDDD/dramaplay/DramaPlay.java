package com.sofkau.DramaFestivalDDD.dramaplay;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.events.DramaPlayCreated;
import com.sofkau.DramaFestivalDDD.dramaplay.values.*;
import com.sofkau.DramaFestivalDDD.shared.values.Name;
import com.sofkau.DramaFestivalDDD.dramaplay.events.*;


import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class DramaPlay extends AggregateEvent<DramaPlayId> {
    protected Name name;
    protected Set<Requirement> requirements;
    protected Set<Performer> performers;

    public DramaPlay(DramaPlayId entityId, Name name, Set<Requirement> requirements, Set<Performer> performers) {
        super(entityId);
        appendChange(new DramaPlayCreated(name, requirements, performers)).apply();
    }

    public DramaPlay(DramaPlayId entityId) {
        super(entityId);
        subscribe(new DramaPlayChange(this));
    }

    public void updateDramaPlayName(DramaPlayId entityId, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new DramaPlayNameUpdated(entityId, name)).apply();
    }

    public void addRequirement(RequirementId entityId, RequirementType requirementType, RequirementDescription requirementDescription){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(requirementType);
        Objects.requireNonNull(requirementDescription);
        appendChange(new RequirementAdded(entityId, requirementType, requirementDescription)).apply();
    }

    public void updateRequirementType(RequirementId entityId, RequirementType requirementType){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(requirementType);
        appendChange(new RequirementTypeUpdated(entityId, requirementType)).apply();
    }

    public void updateRequirementDescription(RequirementId entityId, RequirementDescription requirementDescription){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(requirementDescription);
        appendChange(new RequirementDescriptionUpdated(entityId, requirementDescription)).apply();
    }

    public void addPerformer(PerformerId entityId, Name name, PerformerIsUnderAge performerIsUnderAge){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(performerIsUnderAge);
        appendChange(new PerformerAdded(entityId, name, performerIsUnderAge)).apply();
    }

    public void updatePerformerName(PerformerId entityId, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new PerformerNameUpdated(entityId, name)).apply();
    }

    public void updatePerformerIsUnderAge(PerformerId entityId, PerformerIsUnderAge performerIsUnderAge){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(performerIsUnderAge);
        appendChange(new PerformerIsUnderAgeUpdated(entityId, performerIsUnderAge)).apply();
    }

    public Optional<Requirement> getRequirementById(RequirementId entityId){
        return requirements()
                .stream()
                .filter(requirement -> requirement.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Performer> getPerformerById(PerformerId entityId){
        return performers()
                .stream()
                .filter(performer -> performer.identity().equals(entityId))
                .findFirst();
    }

    public Name name() {
        return name;
    }

    public Set<Requirement> requirements() {
        return requirements;
    }

    public Set<Performer> performers() {
        return performers;
    }
}
