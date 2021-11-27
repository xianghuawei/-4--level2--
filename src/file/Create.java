package file;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Create {
    public static void main(String args[]){
        System.out.println("请输入想创建的文件路径");
        Scanner s=new Scanner(System.in);
        String n=s.next();
        File f=new File((n));
        try{
            f.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
