package org.itmo.lab2.pokemons;

import org.itmo.lab2.moves.specMoves.EnergyBall;
import org.itmo.lab2.moves.specMoves.ShadowBall;
import org.itmo.lab2.moves.statMoves.Growth;
import org.itmo.lab2.moves.statMoves.Swagger;
import ru.ifmo.se.pokemon.*;

public class Shiftry extends Pokemon {

    StatusMove swagger = new Swagger();
    SpecialMove shadowBall = new ShadowBall();
    StatusMove growth = new Growth();
    SpecialMove energyBall = new EnergyBall();

    public Shiftry(String name, int lvl) {
        super(name, lvl);

        double hp = 90, att = 100, def = 60, spAtt = 90, spDef = 60, speed = 80;
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(Type.GRASS);
        this.setType(Type.DARK);

        this.addMove(swagger);
        this.addMove(shadowBall);
        this.addMove(growth);
        this.addMove(energyBall);
    }
}
