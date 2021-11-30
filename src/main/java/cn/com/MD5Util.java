package cn.com;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
    public static String encryptToMD5(String str){
        return DigestUtils.md5Hex(str);
    }

    public String test(){
        return "MD5Utils";
    }
}
