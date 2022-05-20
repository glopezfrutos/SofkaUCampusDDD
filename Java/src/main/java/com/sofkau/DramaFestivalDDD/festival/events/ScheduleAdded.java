package com.sofkau.DramaFestivalDDD.festival.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.DramaFestivalDDD.dramaplay.values.DramaPlayId;
import com.sofkau.DramaFestivalDDD.festival.values.Date;
import com.sofkau.DramaFestivalDDD.festival.values.ScheduleId;
import com.sofkau.DramaFestivalDDD.festival.values.SpaceId;

public class ScheduleAdded extends DomainEvent {
    private final ScheduleId scheduleId;
    private final DramaPlayId dramaPlayId;
    private final SpaceId spaceId;
    private final Date date;

    public ScheduleAdded(ScheduleId scheduleId, DramaPlayId dramaPlayId, SpaceId spaceId, Date date) {
        super("sofkau.festival.ScheduleAdded");
        this.scheduleId = scheduleId;
        this.dramaPlayId = dramaPlayId;
        this.spaceId = spaceId;
        this.date = date;
    }

    public ScheduleId getScheduleId() {
        return scheduleId;
    }

    public DramaPlayId getDramaPlayId() {
        return dramaPlayId;
    }

    public SpaceId getSpaceId() {
        return spaceId;
    }

    public Date getDate() {
        return date;
    }
}
