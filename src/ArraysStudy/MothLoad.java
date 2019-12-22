package ArraysStudy;

//方法重载，方法名相同，但是传递参数不同
public class MothLoad {
    public static void main(String[] main) {
        System.out.println("OverLoad!!!");
        OverLoad ol = new OverLoad();
        ol.overLoad("zhangsan");
        ol.overLoad("zhangsan",30);
    }
}

class OverLoad {

    public void overLoad(String name) {
        System.out.println(name);
    }

    public void overLoad(String name, int age) {
        System.out.println(name + "_" + age);
    }
}