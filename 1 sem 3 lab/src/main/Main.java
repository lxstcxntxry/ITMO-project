package main;

import items.ThingClothes;
import support.ThingAdjective;
import items.ThingAbstract;
import items.ThingMask;
import items.ThingItem;
import utils.actions.ActionPolice;
import utils.actions.ActionStealer;
import utils.entities.*;

public class Main {
    public static void main(String[] args) {
        Entity win = new EntityWindow("Витрина");
        Entity dwarf = new EntityDwarf("Коротышка");

        ThingAbstract[] winArray = new ThingAbstract[] {
                new ThingItem("Грим",  win),
                new ThingItem("Парик",  win),
                new ThingItem("Борода",  win, ThingAdjective.FAKE),
                new ThingItem("Усы",  win, ThingAdjective.FAKE),

                new ThingMask("Закрывает верхнюю часть лица", win),
                new ThingMask("С прорезами для глаз", win),
        };
        for(int i = 0; i<winArray.length; i++) {
            winArray[i].printItem();
        }

        ThingAbstract fullhead = new ThingMask("Целиком на голову", win);//похожа на островерхий капюшон
        ThingAbstract hood = new ThingItem("Островерхий капюшон");
        fullhead.printItem();
        fullhead.looksLike(hood);

        Entity police = new EntityPolice("Полицейский");
        police.performAction(new ActionPolice());
        police.looksLike(dwarf);

        ThingAbstract[] policeArray = new ThingAbstract[] {
                new ThingItem("Каска", police, ThingAdjective.CUPRUM),
                new ThingItem("Дубинка", police),
        };
        for(int i = 0; i<policeArray.length; i++) {
            policeArray[i].printItem();
        }

        Entity stealer = new EntityStealer("Грабитель");
        stealer.performAction(new ActionStealer());
        stealer.looksLike(dwarf);

        ThingAbstract[] stealerArray = new ThingAbstract[] {
                new ThingItem("Пистолет", stealer, ThingAdjective.BIG),
                new ThingItem("Фонарь", stealer, ThingAdjective.ELECTRIC),

                new ThingClothes("Платок", stealer, ThingAdjective.PLAID),
                new ThingClothes("Кепка", stealer, ThingAdjective.PLAID),
                new ThingClothes("Брюки", stealer, ThingAdjective.PLAID),
                new ThingMask("Маска", stealer, ThingAdjective.BLACK),
        };
        for(int i = 0; i<stealerArray.length; i++) {
            stealerArray[i].printItem();
        }
    }
}
