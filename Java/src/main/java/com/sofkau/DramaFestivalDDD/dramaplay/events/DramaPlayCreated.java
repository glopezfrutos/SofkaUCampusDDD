package com.sofkau.DramaFestivalDDD.dramaplay.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.Performer;
import com.sofkau.DramaFestivalDDD.dramaplay.Requirement;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

import java.util.Set;

public class DramaPlayCreated extends DomainEvent {
    private final Name name;
    private final Set<Requirement> requirements;
    private final Set<Performer> performers;

    public DramaPlayCreated(Name name, Set<Requirement> requirements, Set<Performer> performers) {
        super("sofkau.dramaplay.dramaplaycreated");
        this.name = name;
        this.requirements = requirements;
        this.performers = performers;
    }

    public Name getName(){
        return name;
    }

    public Set<Requirement> getRequirements() {
        return requirements;
    }

    public Set<Performer> getPerformers() {
        return performers;
    }
}
