package com.sofkau.DramaFestivalDDD.festival;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.DramaFestivalDDD.festival.events.*;

import java.util.HashSet;

public class FestivalChange extends EventChange {
    public FestivalChange(Festival festival){
        apply((FestivalCreated event) -> {
            festival.name = event.getName();
            festival.festivalStartDate = event.getFestivalStartDate();
            festival.festivalEndDate = event.getFestivalEndDate();
            festival.spaces = new HashSet<>();
            festival.festivalSchedule = new HashSet<>();
        });

        apply((FestivalNameUpdated event) -> {
            festival.name = event.getName();
        });

        apply((StartDateOfFestivalUpdated event) -> {
            festival.festivalStartDate = event.getFestivalStartDate();
        });

        apply((EndDateOfFestivalUpdated event) -> {
            festival.festivalEndDate = event.getFestivalEndDate();
        });

        apply((SpaceAdded event) -> {
            festival.spaces.add(new Space(
                    event.getSpaceId(),
                    event.getName()
            ));
        });

        apply((SpaceNameUpdated event) -> {
            var space = festival.getSpaceById(event.getSpaceId())
                    .orElseThrow(() -> new IllegalArgumentException("Space not found."));
            space.updateSpaceName(event.getName());
        });

        apply((ScheduleAdded event) -> {
            festival.festivalSchedule.add(new Schedule(
                    event.getScheduleId(),
                    event.getDramaPlayId(),
                    event.getSpaceId(),
                    event.getDate()
            ));
        });

        apply((ScheduleDateUpdated event) -> {
            var schedule = festival.getScheduleById(event.getScheduleId())
                    .orElseThrow(() -> new IllegalArgumentException("Play scheduled not found."));
            schedule.updateScheduleDate(event.getDate());
        });
    }
}
