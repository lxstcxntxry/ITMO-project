package org.itmo.lab2.moves.specMoves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().chance(0.1).turns(1).condition(Status.FREEZE));
    }

    @Override
    protected String describe() {
        return "кастует BLIZZARD";
    }
}
