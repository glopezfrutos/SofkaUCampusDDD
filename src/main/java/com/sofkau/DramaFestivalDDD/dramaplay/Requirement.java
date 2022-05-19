package com.sofkau.DramaFestivalDDD.dramaplay;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementDescription;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementId;
import com.sofkau.DramaFestivalDDD.dramaplay.values.RequirementType;

public class Requirement extends Entity<RequirementId> {
    private final RequirementType requirementType;
    private final RequirementDescription requirementDescription;

    public Requirement(RequirementId entityId, RequirementType requirementType, RequirementDescription requirementDescription) {
        super(entityId);
        this.requirementType = requirementType;
        this.requirementDescription = requirementDescription;
    }

    public RequirementType requirementType() {
        return requirementType;
    }

    public RequirementDescription requirementDescription() {
        return requirementDescription;
    }
}
