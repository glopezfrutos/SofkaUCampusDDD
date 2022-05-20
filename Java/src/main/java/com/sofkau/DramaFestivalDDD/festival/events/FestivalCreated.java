package com.sofkau.DramaFestivalDDD.festival.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.festival.Schedule;
import com.sofkau.DramaFestivalDDD.festival.Space;
import com.sofkau.DramaFestivalDDD.festival.values.Date;
import com.sofkau.DramaFestivalDDD.festival.values.FestivalId;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

import java.util.Set;

public class FestivalCreated extends DomainEvent {
    private final FestivalId festivalId;
    private final Name name;
    private final Date festivalStartDate;
    private final Date festivalEndDate;
    private final Set<Space> spaces;
    private final Set<Schedule> festivalSchedule;

    public FestivalCreated(FestivalId festivalId, Name name, Date festivalStartDate, Date festivalEndDate, Set<Space> spaces, Set<Schedule> festivalSchedule) {
        super("sofkau.festival.festivalcreated");
        this.festivalId = festivalId;
        this.name = name;
        this.festivalStartDate = festivalStartDate;
        this.festivalEndDate = festivalEndDate;
        this.spaces = spaces;
        this.festivalSchedule = festivalSchedule;
    }

    public FestivalId getFestivalId() {
        return festivalId;
    }

    public Date getFestivalStartDate() {
        return festivalStartDate;
    }

    public Date getFestivalEndDate() {
        return festivalEndDate;
    }

    public Set<Space> getSpaces() {
        return spaces;
    }

    public Set<Schedule> getFestivalSchedule() {
        return festivalSchedule;
    }

    public Name getName(){
        return name;
    }
}
