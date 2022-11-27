package org.itmo.lab2;
import ru.ifmo.se.pokemon.*;
import org.itmo.lab2.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon team1Unit1 = new Dunsparce("1.1", 1);
        Pokemon team1Unit2 = new Seel("1.2", 1);
        Pokemon team1Unit3 = new Nuzleaf("1.3", 1);
        Pokemon team2Unit1 = new Dewgong("2.1", 1);
        Pokemon team2Unit2 = new Seedot("2.2", 1);
        Pokemon team2Unit3 = new Shiftry("2.3", 1);

        b.addAlly(team1Unit1);
        b.addAlly(team1Unit2);
        b.addAlly(team1Unit3);
        b.addFoe(team2Unit1);
        b.addFoe(team2Unit2);
        b.addFoe(team2Unit3);

        b.go();
    }
}