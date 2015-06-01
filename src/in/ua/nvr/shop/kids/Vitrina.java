package in.ua.nvr.shop.kids;

import java.util.Iterator;
import java.util.List;

/** Класс витрина использует класс Tovar
 * ИСПОЛЬЗУЕТ КОЛЛЕКЦИЮ ArrayList
 * Created by Олеся on 31.05.2015.
 */

public class Vitrina {
    String name;
    List list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void insert(String ltip, String lname, Integer lcost, Integer lage, Integer lprim){
        list.add(new Tovar(ltip,lname, lcost, lage, lprim));
    }

    public void delete(){

    }

    public void saveToFile(String FileName){

    }

    public void loadFromFile(String FileName){

    }

    public void view2(){
    //    for (Tovar n : this.list){
   //         System.out.println(n.toString());
   //     }
        Iterator iter = this.list.iterator(); // coll - коллекция
        while (iter.hasNext()) {
// обрабатываем объект, возвращаемый методом iter.next()
            System.out.println(iter.toString());
        }
    }


    ///////////////////////////  почему не работает
/*    public void view(){
        for(Tovar n: this.list){
            System.out.println(n.toString());
        }
    }
*/

    public void Clear(){
        list.clear();
    }





    @Override
    public String toString() {
        return "Vitrina{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
