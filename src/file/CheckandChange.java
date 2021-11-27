package file;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class CheckandChange {
    public static void main(String[] args) {
        System.out.println("请输入文件路径");
        Scanner s=new Scanner(System.in);
        String n=s.next();

        File f=new File((n));
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            //文件长度
            System.out.println("文件的长度："+f.length());
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来
                System.out.print(b);
            }
            System.out.println(" ");
            7
            System.out.println("请输入写入内容");
            String b=s.next();
            // 以字符流的形式把数据写入到文件中
            Writer out=null;
            out=new FileWriter(f);
            String data=b;
            out.write(data);
            out.close();

            System.out.println("现在文件的长度："+f.length());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}