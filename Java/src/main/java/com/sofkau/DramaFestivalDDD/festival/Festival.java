package com.sofkau.DramaFestivalDDD.festival;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.DramaPlayId;
import com.sofkau.DramaFestivalDDD.festival.events.FestivalCreated;
import com.sofkau.DramaFestivalDDD.festival.values.*;
import com.sofkau.DramaFestivalDDD.festival.events.*;
import com.sofkau.DramaFestivalDDD.shared.values.Name;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Festival extends AggregateEvent<FestivalId> {
    protected Name name;
    protected Date festivalStartDate;
    protected Date festivalEndDate;
    protected Set<Space> spaces;
    protected Set<Schedule> festivalSchedule;

    public Festival(FestivalId entityId, Name name, Date festivalStartDate, Date festivalEndDate, Set<Space> spaces, Set<Schedule> festivalSchedule) {
        super(entityId);
        appendChange(new FestivalCreated(entityId, name, festivalStartDate, festivalEndDate, spaces, festivalSchedule)).apply();
    }

    public Festival(FestivalId entityId) {
        super(entityId);
        subscribe(new FestivalChange(this));
    }

    public void updateFestivalName(FestivalId entityId, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new FestivalNameUpdated(entityId, name)).apply();
    }

    public void updateStartDateOfFestival(FestivalId entityId, Date festivalStartDate){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(festivalStartDate);
        appendChange(new StartDateOfFestivalUpdated(entityId, festivalStartDate)).apply();
    }

    public void updateEndDateOfFestival(FestivalId entityId, Date festivalEndDate){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(festivalEndDate);
        appendChange(new EndDateOfFestivalUpdated(entityId, festivalEndDate)).apply();
    }

    public void addSpace(SpaceId entityId, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new SpaceAdded(entityId, name)).apply();
    }

    public void updateSpaceName(SpaceId entityId, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new SpaceNameUpdated(entityId, name)).apply();
    }

    public void addSchedule(ScheduleId entityId, DramaPlayId dramaPlayId, SpaceId spaceId, Date date){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(dramaPlayId);
        Objects.requireNonNull(spaceId);
        Objects.requireNonNull(date);
        appendChange(new ScheduleAdded(entityId, dramaPlayId, spaceId, date)).apply();
    }

    public void updateScheduleDate(ScheduleId entityId, Date date){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(date);
        appendChange(new ScheduleDateUpdated(entityId, date)).apply();
    }

    public Optional<Schedule> getScheduleById(ScheduleId entityId){
        return festivalSchedule()
                .stream()
                .filter(schedule -> schedule.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Space> getSpaceById(SpaceId entityId){
        return spaces()
                .stream()
                .filter(space -> space.identity().equals(entityId))
                .findFirst();
    }

    public Name name() {
        return name;
    }

    public Date festivalStartDate() {
        return festivalStartDate;
    }

    public Date festivalEndDate() {
        return festivalEndDate;
    }

    public Set<Space> spaces() {
        return spaces;
    }

    public Set<Schedule> festivalSchedule() {
        return festivalSchedule;
    }
}
