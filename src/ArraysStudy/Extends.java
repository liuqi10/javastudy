package ArraysStudy;

//类的继承
public class Extends{
    public static void main(String[] main){
        System.out.println("Extends!!!");
        Teachers th = new Teachers();
        th.setName("zhangsan");
        th.setAge(30);
        th.setScore(99.99);

        System.out.println(th.getName()+":"+th.getAge()+':'+th.getScore());
    }
}

class Persons{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}

class Teachers extends Persons{
    private double score;

    public void setScore(double score){
        this.score = score;
    }

    public double getScore(){
        return this.score;
    }
}