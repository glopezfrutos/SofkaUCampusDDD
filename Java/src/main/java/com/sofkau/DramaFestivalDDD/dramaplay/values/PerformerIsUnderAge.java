package com.sofkau.DramaFestivalDDD.dramaplay.values;

import co.com.sofka.domain.generic.ValueObject;

public class PerformerIsUnderAge implements ValueObject<Boolean> {
    @Override
    public Boolean value() {
        return false;
    }
}
