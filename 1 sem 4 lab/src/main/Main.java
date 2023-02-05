package main;

import items.*;
import support.ThingAdjective;
import utils.PrinterInterface;
import utils.actions.ActionPolice;
import utils.actions.ActionStealer;
import utils.actions.ActionTrader;
import utils.entities.*;
import utils.exceptions.EmptyEntityDescriptionException;
import utils.places.Place;
import utils.places.PlaceShop;

public class Main {
    public static void main(String[] args) {

        try
        {
            Entity neznayka = new EntityNeznayka("Незнайка");
            neznayka.appear();

            ThingAbstract hat = new ThingItem("Шляпа", neznayka);
            hat.printItem();
            neznayka.manipulate(hat, "взял");

            ThingAbstract paper = new ThingItem("Конверт");
            paper.printItem();
            neznayka.manipulate(paper, "поднял");
            paper.setDescription("Крученая улица. Змеиный переулок, дом No 6, " +
                    "владельцу магазина разнокалиберных товаров господину Жулио");
            paper.printDescription();

            Entity kozel = new EntityKozel("Козёл");
            kozel.appear();

            Place shop = new PlaceShop("Магазин");
            shop.appear();
            ThingAbstract sign = new ThingItem("Вывеска");
            sign.setDescription("Продажа разнокалиберных товаров");
            sign.printDescription();
            kozel.located(shop);
            neznayka.located(shop);

            Entity winZero = new EntityWindow("Витрина1");
            winZero.appear();

            ThingAbstract[] win1Array = new ThingAbstract[] {
                    new ThingItem("Нож",  winZero),
                    new ThingItem("Кинжал",  winZero),
                    new ThingItem("Кастет",  winZero),
                    new ThingItem("Пистолет",  winZero),
                    new ThingItem("Кистень",  winZero),
            };
            for(int i = 0; i<win1Array.length; i++) {
                win1Array[i].printItem();
            }

            Entity winPolice = new EntityPolice("Витрина с полицейской утварью");
            winPolice.appear();

            ThingAbstract[] winPoliceArray = new ThingAbstract[] {
                    new ThingItem("Дубинка",  winPolice, ThingAdjective.LATEX),
                    new ThingItem("Наручники", winPolice, ThingAdjective.METAL)
            };
            for(int i = 0; i<winPoliceArray.length; i++) {
                winPoliceArray[i].printItem();
            }

            Entity win = new EntityWindow("Витрина2");
            win.appear();

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
            Entity dwarf = new EntityDwarf("Коротышка");
            dwarf.appear();
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

            Entity trader = new EntityTrader("Продавец");
            trader.appear();
            ThingAbstract gun = new ThingItem("Ружье", win);
            gun.printItem();
            trader.performAction(new ActionTrader("обернулся"));
            trader.manipulate(gun, "снял");
            trader.manipulate(gun, "приложился");
            trader.manipulate(gun, "щелкнул");

            ThingAbstract gun1 = new ThingItem("Винтовка", win);
            gun.printItem();
            trader.performAction(new ActionTrader("обернулся"));
            trader.manipulate(gun1, "снял");
            trader.manipulate(gun1, "погладил");
            trader.performAction(new ActionTrader("нагнулся"));

            ThingAbstract rope = new ThingItem("Шнур", win, ThingAdjective.BLACK);
            rope.printItem();
            rope.setDescription("В виде замысловатой петли с двумя хвостами по сторонам");
            rope.printDescription();

            trader.performAction(new ActionTrader("накинул на шею"));
            trader.manipulate(neznayka, "связал");
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
