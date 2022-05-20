package com.sofkau.DramaFestivalDDD.dramaplay.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementId;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementType;

public class RequirementTypeUpdated extends DomainEvent {
    private final RequirementId requirementId;
    private final RequirementType requirementType;

    public RequirementTypeUpdated(RequirementId requirementId, RequirementType requirementType) {
        super("sofkau.dramaplay.requirementtypeupdated");
        this.requirementId = requirementId;
        this.requirementType = requirementType;
    }

    public RequirementId getRequirementId() {
        return requirementId;
    }

    public RequirementType getRequirementType() {
        return requirementType;
    }
}
