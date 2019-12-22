package IO;

import java.io.*;

public class ErgodicFile {
    public static void main(String[] args) {
        System.out.println("遍历文件和目录！！！");
        String filepath = "E:\\file";
        ErgodicFile ef = new ErgodicFile();
        ef.ergFile(filepath);
    }

    public void ergFile(String filepath) {
        File f = new File(filepath);
        File[] flFs= f.listFiles();
        for(File flF:flFs){
            if(flF.isDirectory()){
                String strflF = String.valueOf(flF);  // 转成字符型
                ergFile(strflF);
            }else {
                System.out.println(flF);
            }
        }

    }
}




