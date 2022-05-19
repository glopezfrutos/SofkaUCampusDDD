package com.sofkau.DramaFestivalDDD.dramaplay;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.values.*;

import java.util.Objects;

public class Requirement extends Entity<RequirementId> {
    private RequirementType requirementType;
    private RequirementDescription requirementDescription;

    public Requirement(RequirementId entityId, RequirementType requirementType, RequirementDescription requirementDescription) {
        super(entityId);
        this.requirementType = requirementType;
        this.requirementDescription = requirementDescription;
    }

    public void updateRequirementType(RequirementType requirementType){
        this.requirementType = Objects.requireNonNull(requirementType);
    }

    public void updateRequirementDescription(RequirementDescription requirementDescription){
        this.requirementDescription = Objects.requireNonNull(requirementDescription);
    }

    public RequirementType requirementType() {
        return requirementType;
    }

    public RequirementDescription requirementDescription() {
        return requirementDescription;
    }
}
