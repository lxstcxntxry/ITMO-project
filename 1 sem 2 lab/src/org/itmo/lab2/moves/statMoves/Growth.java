package org.itmo.lab2.moves.statMoves;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, +1);
        pokemon.setMod(Stat.SPECIAL_ATTACK, +1);
    }

    @Override
    protected String describe() {
        return "кастует GROWTH";
    }
}
