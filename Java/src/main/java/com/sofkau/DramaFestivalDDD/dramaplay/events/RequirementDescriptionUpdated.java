package com.sofkau.DramaFestivalDDD.dramaplay.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementDescription;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementId;

public class RequirementDescriptionUpdated extends DomainEvent {
    private final RequirementId requirementId;
    private final RequirementDescription requirementDescription;

    public RequirementDescriptionUpdated(RequirementId requirementId, RequirementDescription requirementDescription) {
        super("sofkau.dramaplay.requirementdescriptionupdated");
        this.requirementId = requirementId;
        this.requirementDescription = requirementDescription;
    }

    public RequirementId getRequirementId() {
        return requirementId;
    }

    public RequirementDescription getRequirementDescription() {
        return requirementDescription;
    }
}
