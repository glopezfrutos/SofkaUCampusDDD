package com.sofkau.DramaFestivalDDD.dramaplay.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementDescription;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementId;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementType;

public class RequirementAdded extends DomainEvent {
    private final RequirementId requirementId;
    private final RequirementType requirementType;
    private final RequirementDescription requirementDescription;


    public RequirementAdded(RequirementId requirementId, RequirementType requirementType, RequirementDescription requirementDescription) {
        super("sofkau.dramaplay.requirementadded");
        this.requirementId = requirementId;
        this.requirementType = requirementType;
        this.requirementDescription = requirementDescription;
    }

    public RequirementId getRequirementId() {
        return requirementId;
    }

    public RequirementType getRequirementType() {
        return requirementType;
    }

    public RequirementDescription getRequirementDescription() {
        return requirementDescription;
    }
}
