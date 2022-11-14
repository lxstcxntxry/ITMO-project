package org.itmo.lab2.moves.physMoves;

import ru.ifmo.se.pokemon.*;

public class SignalBeam extends PhysicalMove {
    public SignalBeam() {
        super(Type.BUG, 75, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() <= 0.5) {
            pokemon.confuse();
        }
    }

    @Override
    protected String describe() {
        return "кастует SIGNAL BEAM";
    }
}

