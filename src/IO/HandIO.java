package IO;

import java.io.*;

public class HandIO {
    public static void main(String[] args) throws IOException {
        System.out.println("IO相关操作！！！");
        HandIO hio = new HandIO();
        String path1;
        path1 = "C:\\Users\\Administrator.60R8QL94NL9O6YR\\Desktop\\Postman";
        hio.readFile(path1);
        path1 = "E:\\software\\DingDing\\DingtalkLauncher.exe";
        hio.readFile(path1);
        hio.guiFanPath();
        path1 = "E:\\file";
        hio.handFile(path1);
    }

    public void readFile(String path){
        File file = new File(path);
        System.out.println(file);
        if(file.isFile()){  //判断是否为文件
            System.out.println("当前是文件");
            if(file.canRead()){
                System.out.println("当前文件可读");
            }
            if(file.canWrite()){
                System.out.println("当前文件可修改");
            }
            if(file.canExecute()){
                System.out.println("当前文件可执行");
            }
            System.out.println("当前文件大小"+":"+file.length());

        }else if(file.isDirectory()){  //判断是否为目录
            System.out.println("当前是目录");
        }else {
            System.out.println("当前什么也不是");
        }
    }

    public void guiFanPath(){
        File file = new File("..");
        System.out.println(file.getPath());
    }

    public void handFile(String filepath) throws IOException {
        File file = new File(filepath);
        if(file.createNewFile()){
            System.out.println("create file successful");
        }else {
            System.out.println("create file error");
        }
    }
}
