package cn.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TheadDemo extends Thread {

    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        TheadDemo theadDemo=new TheadDemo();
//        TheadDemo theadDemo1=new TheadDemo();
//        theadDemo.start();
//        theadDemo1.start();

//        List list=new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        for (Object a:list){
//            System.out.print((int)a+",");
//        }
//    }
//    Set set1=new HashSet();
//        set1.add("你好");
//        set1.add("23e");
//        set1.add("wefw");
//        set1.add(4);
//        set1.add(5);
//        set1.add(5);
//        for (Object a:set1){
//        System.out.print(a+",");
    }
//}
}
