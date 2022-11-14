package org.itmo.lab2.moves.statMoves;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost() {
        super(Type.FLYING, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.HP, -5);
    }

    @Override
    protected String describe() {
        return "кастует ROOST";
    }
}
