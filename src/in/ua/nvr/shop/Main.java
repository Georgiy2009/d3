package in.ua.nvr.shop;

import in.ua.nvr.shop.kids.Tovar;
import in.ua.nvr.shop.kids.Vitrina;

import java.util.ArrayList;
import java.util.List;

/** lb5
 * Created by Олеся on 31.05.2015.
 */

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void init(Vitrina vitrina){
        vitrina.insert("ball", "Мяч", 5, 2, 20);
        vitrina.insert("ball", "Мяч", 10, 3, 30);
        vitrina.insert("ball", "Мяч", 200, 4, 40);

        vitrina.insert("kukla", "Кукла Барби", 2000, 2, 20);

        vitrina.insert("kubik", "Кубики", 5, 2, 16);

        vitrina.insert("constructor", "Конструктор", 5, 2, 20);
    }

    private void run() {
        List<Tovar> list = new ArrayList<>();
        //test list.add(new Tovar("m", "Мяч", 20, 3, 30));

        Vitrina vitrina = new Vitrina();
        vitrina.setName("Toys");
        vitrina.setList(list);

        init(vitrina);

        Integer a;
        a = 0;

        for (Tovar n : list){
            System.out.println(n.toString());
        }
/*
        while (a < 1) {
            vitrina.view();

         //   System.out.println(vitrina.toString());
            a = 5;
        }
 */

    }
}
