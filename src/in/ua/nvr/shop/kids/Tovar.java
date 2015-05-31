package in.ua.nvr.shop.kids;

/** Класс товар
 * Created by Олеся on 31.05.2015.
 * тип товара (мяч,конструктор ..),название, цена, возраст,примечание параметр(см,грам шт)
 */
public class Tovar {
    String tip;
    String name;
    Integer cost;
    Integer age;
    Integer prim;

     public Tovar(java.lang.String tip, java.lang.String name, java.lang.Integer cost, java.lang.Integer age, java.lang.Integer prim) {
        this.tip = tip;
        this.name = name;
        this.cost = cost;
        this.age = age;
        this.prim = prim;
    }

    public Tovar() {
        this("unkown","unkown",0,0,0);
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPrim() {
        return prim;
    }

    public void setPrim(Integer prim) {
        this.prim = prim;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "tip='" + tip + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", age=" + age +
                ", prim=" + prim +
                '}';
    }
}
