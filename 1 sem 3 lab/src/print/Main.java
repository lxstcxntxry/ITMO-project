package print;

import help.AdjectiveEnum;
import objects.Masks;
import objects.Puppet;
import objects.Things;
import objects.Window;

public class Main {
    public static void main(String[] args) {
        Window win = new Window("Витрина");

        // маски в витрине
        Masks upper = new Masks("Закрывает верхнюю часть лица", true);
        upper.printMaskType(win);
        Masks slits = new Masks("С прорезами для глаз", true);
        slits.printMaskType(win);
        Masks full = new Masks("Надевается целиком на голову", true);
        full.printMaskType(win);
        Masks hood = new Masks("Островерхий капюшон", true);
        hood.printMaskType(win);

        // ещё что-то в витрине
        Things makeup = new Things("Грим");
        makeup.inWindow(win);
        Things wig = new Things("Парик");
        wig.inWindow(win);
        Things beard = new Things("Борода");
        beard.inWindow(win);
        Things mustache = new Things("Усы");
        mustache.inWindow(win);

        // кукла полицейского и предметы на ней
        Puppet police = new Puppet("Полицейский");
        police.place("В правому углу");
        Things helmet = new Things("Каска");
        helmet.onPuppet(police, AdjectiveEnum.CUPRUM);
        Things baton = new Things("Дубинка");
        baton.onPuppet(police);

        // кукла грабителя и предметы на ней
        Puppet stealer = new Puppet("Грабитель");
        stealer.place("В левом углу");
        Things gun = new Things("Пистолет");
        gun.onPuppet(stealer, AdjectiveEnum.BIG);
        Things lamp = new Things("Фонарь");
        lamp.onPuppet(stealer, AdjectiveEnum.ELECTRIC);
        Things shawl = new Things("Платок");
        shawl.onPuppet(stealer, AdjectiveEnum.PLAID);
        Things cap = new Things("Кепка");
        cap.onPuppet(stealer, AdjectiveEnum.PLAID);
        Things trousers = new Things("Брюки");
        trousers.onPuppet(stealer, AdjectiveEnum.PLAID);
        Things mask = new Things("Маска");
        mask.onPuppet(stealer, AdjectiveEnum.BLACK);

        // куклы были исполнены мастерски
        police.printPuppet(AdjectiveEnum.MASTERFUL);
        stealer.printPuppet(AdjectiveEnum.MASTERFUL);
        Puppet dwarf = new Puppet("Коротышка");
        police.looksLike(dwarf);
        stealer.looksLike(dwarf);
    }
}