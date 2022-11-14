package org.itmo.lab2.moves.statMoves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.confuse();
        pokemon.setMod(Stat.ATTACK, +2);
    }

    @Override
    protected String describe() {
        return "кастует SWAGGER";
    }
}
