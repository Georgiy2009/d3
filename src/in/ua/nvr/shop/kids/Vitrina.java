package in.ua.nvr.shop.kids;

import java.util.Iterator;
import java.util.List;

/** ����� ������� ���������� ����� Tovar
 * ���������� ��������� ArrayList
 * Created by ����� on 31.05.2015.
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

    public void view(){
    //    for (Tovar n : this.list){
   //         System.out.println(n.toString());
   //     }
        Iterator iter = this.list.iterator(); // coll - ���������
        while (iter.hasNext()) {
// ������������ ������, ������������ ������� iter.next()
            System.out.println(iter.toString());
        }
    }

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
