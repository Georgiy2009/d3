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

    private void init(){


    }

    private void run() {
        List<Tovar> list = new ArrayList<>();
       //test list.add(new Tovar("m", "Мяч", 20, 3, 30));

        Vitrina vitrina = new Vitrina();
        vitrina.setName("Toys");
        vitrina.setList(list);
        vitrina.insert("m", "Мяч", 5, 2, 20);
        vitrina.insert("m", "Мяч", 10, 2, 30);
        vitrina.insert("m", "Мяч", 200, 2, 40);

        System.out.println(vitrina.toString());
    }

}
