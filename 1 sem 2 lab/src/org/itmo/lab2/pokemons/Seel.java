package org.itmo.lab2.pokemons;

import org.itmo.lab2.moves.statMoves.Confide;
import org.itmo.lab2.moves.statMoves.Growl;
import org.itmo.lab2.moves.physMoves.SignalBeam;

import ru.ifmo.se.pokemon.*;

public class Seel extends Pokemon {
    public Seel (String name, int lvl) {
        super(name, lvl);

        double hp = 65, att = 45, def = 55,
                spAtt = 45, spDef = 70, speed = 45;

        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(Type.WATER);

        this.setMove(new Growl(), new Confide(),
                new SignalBeam());
    }
}
