package com.cpy.mybatisplus.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 〈自動生成set方法〉
 *
 * @author Administrator
 * @create 2019/11/26
 * @since 1.0.0
 */
public class AutoSetMethod {

    public static void main(String[] args) throws IOException {
        BufferedReader info = new BufferedReader(new FileReader("info"));

        String temp = null;

        while ((temp = info.readLine())!=null){
            String [] words = temp.split("_"); //先将字符串按照"_"切割
            String str = "";
            for(int i =0;i<words.length;i++){
                String s = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
                str+=s;
            }
            System.out.println("dv.set"+str +"("+str+")");
        }
        info.close();
    }

}
