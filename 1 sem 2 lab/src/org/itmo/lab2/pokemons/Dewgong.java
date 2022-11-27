package org.itmo.lab2.pokemons;

import org.itmo.lab2.moves.physMoves.SignalBeam;
import org.itmo.lab2.moves.specMoves.FrostBreath;
import org.itmo.lab2.moves.statMoves.Confide;
import org.itmo.lab2.moves.statMoves.Growl;

import ru.ifmo.se.pokemon.*;

public class Dewgong extends Pokemon {
    public Dewgong (String name, int lvl) {
        super(name, lvl);

        double hp = 90, att = 70, def = 80,
                spAtt = 70, spDef = 95, speed = 70;

        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(Type.WATER);
        this.setType(Type.ICE);

        this.setMove(new Growl(), new Confide(),
                new SignalBeam(), new FrostBreath());
    }
}
