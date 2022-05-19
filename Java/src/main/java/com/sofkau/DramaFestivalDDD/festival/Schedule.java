package com.sofkau.DramaFestivalDDD.festival;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.values.DramaPlayId;
import com.sofkau.DramaFestivalDDD.dramaplay.values.Name;
import com.sofkau.DramaFestivalDDD.dramaplay.values.PerformerIsUnderAge;
import com.sofkau.DramaFestivalDDD.festival.values.Date;
import com.sofkau.DramaFestivalDDD.festival.values.ScheduleId;
import com.sofkau.DramaFestivalDDD.festival.values.SpaceId;

import java.util.Objects;

public class Schedule extends Entity<ScheduleId> {
    private final DramaPlayId dramaPlayId;
    private final SpaceId spaceId;
    private Date date;

    public Schedule(ScheduleId entityId, DramaPlayId dramaPlayId, SpaceId spaceId, Date date) {
        super(entityId);
        this.dramaPlayId = dramaPlayId;
        this.spaceId = spaceId;
        this.date = date;
    }

    public void updateDate(Date date){
        this.date = Objects.requireNonNull(date);
    }

    public DramaPlayId dramaPlayId() {
        return dramaPlayId;
    }

    public SpaceId spaceId() {
        return spaceId;
    }

    public Date date() {
        return date;
    }
}
