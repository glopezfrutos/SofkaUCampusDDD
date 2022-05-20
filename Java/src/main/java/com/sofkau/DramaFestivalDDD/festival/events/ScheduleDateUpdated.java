package com.sofkau.DramaFestivalDDD.festival.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.festival.values.Date;
import com.sofkau.DramaFestivalDDD.festival.values.ScheduleId;

public class ScheduleDateUpdated extends DomainEvent {
    private final ScheduleId scheduleId;
    private final Date date;

    public ScheduleDateUpdated(ScheduleId scheduleId, Date date) {
        super("sofkau.festival.ScheduleDateUpdated");
        this.scheduleId = scheduleId;
        this.date = date;
    }

    public ScheduleId getScheduleId() {
        return scheduleId;
    }

    public Date getDate() {
        return date;
    }
}
