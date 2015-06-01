package in.ua.nvr.shop;

import in.ua.nvr.shop.kids.Tovar;
import in.ua.nvr.shop.kids.Vitrina;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


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

    public void voidviewSorted(){
        System.out.println("Вывод сортированого списка");
    }

    public Integer menu(List list){
      System.out.println("Выберите действия");
      System.out.println("1:Посмотреть весь перечень игрушек");
      System.out.println("2:Просмотреть какие игрушки подходят детям от 4 до 10 лет и вывести в алфовитном порядке.");
      System.out.println("0:Выход");
        Scanner scanner = new Scanner(System.in);
        Integer a;

        if (scanner.nextInt()==0) {return 0;};
        if (scanner.nextInt()==1) {
            view3(list);
            return 1;};

        if (scanner.nextInt()==2) {
            voidviewSorted();
            return 1;};
    }

    private void run() {
        List<Tovar> list = new ArrayList<>();
        //test list.add(new Tovar("m", "Мяч", 20, 3, 30));

        Vitrina vitrina = new Vitrina();
        vitrina.setName("Toys");
        vitrina.setList(list);
//?////////////////////////////////
        init(vitrina); // почему надо было в инит передавать витрина
     //   view3(list);
        Integer a;
        a = 1;
        while (a==1){a=menu(list);};



        for (Tovar n : list){
            System.out.println(n.toString());
        }
  ///////////////      vitrina.view();


/*
        while (a < 1) {
            vitrina.view();

         //   System.out.println(vitrina.toString());
            a = 5;
        }
 */

    }

    public  void view3(List list){
        for (Tovar n : list){
            System.out.println(n.toString());
        }
    }


}
