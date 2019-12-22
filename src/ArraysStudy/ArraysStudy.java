package ArraysStudy;

public class ArraysStudy {
    public static void main(String[] args){
        System.out.println("JAVASTUDY");
        Person pe = new Person();
        String name = "zhangsan";
        pe.setName(name);
        System.out.println(pe.getName());
        System.out.println(pe.age);

        Group gp = new Group();
        String[] ns = {"zhangsna","lisi","wangwu"};
        gp.setNames(ns);
        ns[0] = "zhangsansan";
        System.out.println(gp.getNames());
    }
}

class Person{

    private String name;
    public int age = 28;

    void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Group{
    private String[] names;

    public void setNames(String[] names){
        this.names = names;
    }

    public String getNames(){
        return this.names[0]+";"+this.names[1];
    }
}
