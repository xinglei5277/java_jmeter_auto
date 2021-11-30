import cn.com.JavaJmeter;
import cn.com.MD5Util;


public class test {


    public static void main(String[] args) {
        JavaJmeter javaJmeter=new JavaJmeter();
        int a=javaJmeter.test();
        System.out.println(a);

        MD5Util mD5Util=new MD5Util();
        String md5str=mD5Util.test();
    }
}
