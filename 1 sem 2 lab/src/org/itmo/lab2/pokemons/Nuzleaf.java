package org.itmo.lab2.pokemons;

import org.itmo.lab2.moves.specMoves.ShadowBall;
import org.itmo.lab2.moves.statMoves.Growth;
import org.itmo.lab2.moves.statMoves.Swagger;

import ru.ifmo.se.pokemon.*;

public class Nuzleaf extends Pokemon {

    StatusMove swagger = new Swagger();
    SpecialMove shadowBall = new ShadowBall();
    StatusMove growth = new Growth();

    public Nuzleaf(String name, int lvl) {
        super(name, lvl);

        double hp = 70, att = 70, def = 40, spAtt = 60, spDef = 40, speed = 60;
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(Type.GRASS);
        this.setType(Type.DARK);

        this.addMove(swagger);
        this.addMove(shadowBall);
        this.addMove(growth);
    }
}
