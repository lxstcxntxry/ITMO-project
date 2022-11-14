package org.itmo.lab2.pokemons;

import org.itmo.lab2.moves.specMoves.ShadowBall;
import org.itmo.lab2.moves.statMoves.Swagger;

import ru.ifmo.se.pokemon.*;

public class Seedot extends Pokemon {

    StatusMove swagger = new Swagger();
    SpecialMove shadowBall = new ShadowBall();

    public Seedot(String name, int lvl) {
        super(name, lvl);

        double hp = 40, att = 40, def = 50, spAtt = 30, spDef = 30, speed = 30;
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(Type.GRASS);

        this.addMove(swagger);
        this.addMove(shadowBall);
    }
}
