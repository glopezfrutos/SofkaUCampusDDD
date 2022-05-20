package com.sofkau.DramaFestivalDDD.festival;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.DramaFestivalDDD.dramaplay.values.DramaPlayId;
import com.sofkau.DramaFestivalDDD.festival.values.Date;
import com.sofkau.DramaFestivalDDD.festival.values.ScheduleId;
import com.sofkau.DramaFestivalDDD.festival.values.SpaceId;

import java.util.Objects;

public class Schedule extends Entity<ScheduleId> {
    private final DramaPlayId dramaPlayId;
    private final SpaceId spaceId;
    private Date dramaPlayDate;

    public Schedule(ScheduleId entityId, DramaPlayId dramaPlayId, SpaceId spaceId, Date dramaPlayDate) {
        super(entityId);
        this.dramaPlayId = dramaPlayId;
        this.spaceId = spaceId;
        this.dramaPlayDate = dramaPlayDate;
    }

    public void updateScheduleDate(Date date){
        this.dramaPlayDate = Objects.requireNonNull(date);
    }

    public DramaPlayId dramaPlayId() {
        return dramaPlayId;
    }

    public SpaceId spaceId() {
        return spaceId;
    }

    public Date dramaPlayDate() {
        return dramaPlayDate;
    }
}
