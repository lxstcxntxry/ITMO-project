package org.itmo.lab2.moves.physMoves;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends PhysicalMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {
        var Condition = pokemon.getCondition();
        if(Condition == Status.SLEEP){
            pokemon.setMod(Stat.HP, -(int)(damage/2));
        }
    }

    @Override
    protected String describe() {
        return "кастует DREAM EATER";
    }
}
