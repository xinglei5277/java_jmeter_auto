import cn.com.jmeter.JavaJmeter;
import cn.com.utils.MD5Util;

import java.util.logging.SocketHandler;


public class test {


    public static void main(String[] args) {
        JavaJmeter javaJmeter=new JavaJmeter();
        int a=javaJmeter.test();
        System.out.println(a);
        MD5Util mD5Util=new MD5Util();
        String md5str=mD5Util.test();
        System.out.println(md5str);
       // System.out.println(${env.JAVA_JMETER});
    }
}
