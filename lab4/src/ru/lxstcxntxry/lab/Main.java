package ru.lxstcxntxry.lab;

import ru.lxstcxntxry.lab.entities.items.ItemAdjective;
import ru.lxstcxntxry.lab.entities.items.impl.DoorItem;
import ru.lxstcxntxry.lab.exceptions.InvalidPropertyException;
import ru.lxstcxntxry.lab.places.impl.*;
import ru.lxstcxntxry.lab.utils.Printer;
import ru.lxstcxntxry.lab.actions.AliveEntityAction;
import ru.lxstcxntxry.lab.entities.alive.AliveEntity;
import ru.lxstcxntxry.lab.entities.alive.impl.*;
import ru.lxstcxntxry.lab.entities.items.Item;
import ru.lxstcxntxry.lab.entities.items.impl.ClothesItem;
import ru.lxstcxntxry.lab.entities.items.impl.AnyItem;
import ru.lxstcxntxry.lab.entities.items.impl.MaskItem;
import ru.lxstcxntxry.lab.places.Place;

public class Main
{
    public static void main(String[] args)
    {

        try
        {
            AliveEntity neznayka = new NeznaykaAliveEntity("Незнайка");
            neznayka.appear();

            Item hat = new AnyItem("Шляпа", "", new EntityPlace(neznayka.getName()));
            neznayka.manipulate(hat, new AliveEntityAction("взял"));
            hat.printItem();

            Item envelope = new AnyItem(
                    "Конверт",
                    "Крученая улица. Змеиный переулок, дом No 6, владельцу магазина разнокалиберных товаров господину Жулио",
                    new ItemPlace("шляпа")
            );
            envelope.printItem();
            neznayka.manipulate(envelope, new AliveEntityAction("поднял"));

            AliveEntity kozel = new KozelAliveEntity("Альберт");
            kozel.appear();

            Place shop = new ShopPlace("Стекляшка");
            shop.definePlace();

            DoorItem item = new DoorItem(
                    "дверь с вывеской",
                    new UnknownPlace("хз где"),
                    new DoorItem.Sign("Продажа разнокалиберных товаров")
            );
            item.printItem();


            neznayka.located(shop);
            kozel.located(shop);

            Place window = new WindowPlace("витрина");
            window.definePlace();

            Item[] win1Array = new Item[] {
                    new AnyItem("Нож",  "", window),
                    new AnyItem("Кинжал",  "", window),
                    new AnyItem("Кастет",  "", window),
                    new AnyItem("Пистолет",  "", window),
                    new AnyItem("Кистень",  "", window)
            };

            for(int i = 0; i<win1Array.length; i++)
                win1Array[i].printItem();


            Place windowPolice = new WindowPlace("Витрина с полицейской утварью");
            windowPolice.definePlace();

            Item[] winPoliceArray = new Item[] {
                    new AnyItem("Дубинка",  "", windowPolice, ItemAdjective.LATEX),
                    new AnyItem("Наручники", "", windowPolice, ItemAdjective.METAL)
            };

            for(int i = 0; i<winPoliceArray.length; i++)
                winPoliceArray[i].printItem();


            Place window2 = new WindowPlace("Витрина 2");
            window2.definePlace();

            Item[] winArray = new Item[] {
                    new AnyItem("Грим",  "", window2),
                    new AnyItem("Парик",  "", window2),
                    new AnyItem("Борода",  "", window2, ItemAdjective.FAKE),
                    new AnyItem("Усы",  "", window2, ItemAdjective.FAKE),
                    new MaskItem("Закрывает верхнюю часть лица", window2),
                    new MaskItem("С прорезами для глаз", window2)
            };

            for(int i = 0; i<winArray.length; i++)
                winArray[i].printItem();

            Item fullhead = new MaskItem("Целиком на голову", window2);
            Item hood = new AnyItem("Островерхий капюшон", "", new UnknownPlace("без понятия"));
            fullhead.printItem();
            fullhead.looksLike(hood);

            AliveEntity police = new PoliceAliveEntity("Вова");
            police.appear();
            police.performAction(new AliveEntityAction("стоит"));

            AliveEntity dwarf = new DwarfAliveEntity("Коротышка");
            dwarf.appear();
            police.looksLike(dwarf);

            Place policemanPlace = new EntityPlace(police.getName());
            Item[] policeArray = new Item[] {
                    new AnyItem("Каска", "", policemanPlace, ItemAdjective.CUPRUM),
                    new AnyItem("Дубинка", "", policemanPlace)
            };

            for(int i = 0; i < policeArray.length; i++)
                policeArray[i].printItem();

            AliveEntity stealer = new StealerAliveEntity("Гоша");
            stealer.appear();
            stealer.performAction(new AliveEntityAction("крадётся"));
            stealer.looksLike(dwarf);

            Place stealerPlace = new EntityPlace(stealer.getName());

            Item[] stealerArray = new Item[] {
                    new AnyItem("Пистолет", "", stealerPlace, ItemAdjective.BIG),
                    new AnyItem("Фонарь", "", stealerPlace, ItemAdjective.ELECTRIC),

                    new ClothesItem("Платок", "", stealerPlace, ItemAdjective.PLAID),
                    new ClothesItem("Кепка", "", stealerPlace, ItemAdjective.PLAID),
                    new ClothesItem("Брюки", "", stealerPlace, ItemAdjective.PLAID),
                    new MaskItem("", stealerPlace, ItemAdjective.BLACK)
            };

            for(int i = 0; i<stealerArray.length; i++)
                stealerArray[i].printItem();

            AliveEntity trader = new TraderAliveEntity("барыга");
            trader.appear();

            Item gun = new AnyItem("Ружьё", "", window2);
            gun.printItem();

            trader.performAction(new AliveEntityAction("обернулся"));
            trader.manipulate(gun, new AliveEntityAction("снял"));
            trader.manipulate(gun, new AliveEntityAction("приложился"));
            trader.manipulate(gun, new AliveEntityAction("щёлкнул"));

            Item gun1 = new AnyItem("Винтовка", "", window2);
            gun1.printItem();

            trader.performAction(new AliveEntityAction("обернулся"));
            trader.manipulate(gun, new AliveEntityAction("снял"));
            trader.manipulate(gun, new AliveEntityAction("погладил"));
            trader.manipulate(gun, new AliveEntityAction("нагнулся"));

            Item rope = new AnyItem(
                    "Шнур",
                    "В виде замысловатой петли с двумя хвостами по сторонам",
                    window2,
                    ItemAdjective.BLACK
            );
            rope.printItem();
            rope.printDescription();

            trader.performAction(new AliveEntityAction("накинул на шею"));
            trader.performAction(new AliveEntityAction("связал " + neznayka.getName()));
        }
        catch (InvalidPropertyException e)
        {
            Printer printer = new Printer()
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
