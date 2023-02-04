package main;

import items.*;
import support.ThingAdjective;
import utils.PrinterInterface;
import utils.actions.ActionPolice;
import utils.actions.ActionStealer;
import utils.entities.*;
import utils.exceptions.EmptyEntityDescriptionException;

public class Main {
    public static void main(String[] args) {

        try
        {
            Entity win = new EntityWindow("Витрина");
            Entity dwarf = new EntityDwarf("Коротышка");
            Entity neznayka = new EntityNeznayka("Незнайка");
            Entity kozel = new EntityKozel("Козлик");

            win.appear();
            dwarf.appear();
            neznayka.appear();
            kozel.appear();

            ThingAbstract envelope = new ThingItem("Конверт")
                    .setDescription("Крученая улица. Змеиный переулок, дом No 6, владельцу магазина разнокалиберных товаров господину Жулио");

            neznayka.manipulateAnItem(envelope, "поднял");


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
            police.appear();
            police.performAction(new ActionPolice());
            police.looksLike(dwarf);

            ThingAbstract[] policeArray = new ThingAbstract[] {
                    new ThingItem("Каска", police, ThingAdjective.CUPRUM),
                    new ThingItem("Дубинка", police),
            };
            for(int i = 0; i < policeArray.length; i++) {
                policeArray[i].printItem();
            }

            Entity stealer = new EntityStealer("Грабитель");
            stealer.appear();
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

            ThingAbstract door = new ThingDoor("Супер-мега дверь", new ThingDoor.Sign("WC"));
            door.printItem();
        }
        catch (EmptyEntityDescriptionException e)
        {
            PrinterInterface printer = new PrinterInterface()
            {
                @Override
                public void printString(String str)
                {
                    System.out.println(str);
                }
            };

            printer.printString(e.getMessage());
        }

    }
}
