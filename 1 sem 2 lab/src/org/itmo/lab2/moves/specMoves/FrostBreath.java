package org.itmo.lab2.moves.specMoves;

import ru.ifmo.se.pokemon.*;

public class FrostBreath extends SpecialMove {
    public FrostBreath() {
        super(Type.ICE, 60, 90);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 2;
    }

    @Override
    protected String describe() {
        return "кастует FROST BREATH";
    }
}
