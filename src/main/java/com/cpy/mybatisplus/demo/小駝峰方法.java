package com.cpy.mybatisplus.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 〈数据库字段转换〉
 *
 * @author Administrator
 * @create 2019/11/26
 * @since 1.0.0
 */
public class 小駝峰方法 {
    public static void main(String[] args) throws IOException {
        BufferedReader info = new BufferedReader(new FileReader("info"));

        String temp = null;

        while ((temp = info.readLine())!=null){
            String [] words = temp.split("_"); //先将字符串按照"_"切割
            String str = "";
            str = words[0].toLowerCase();
            for(int i =1;i<words.length;i++){
                String s = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
                str+=s;
            }
            System.out.println(str);
        }
        info.close();
    }
}
