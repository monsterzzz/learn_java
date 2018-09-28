import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;


public class test {
    public  String a(String str) {
        int length = str.length() % 16;
        for (int i = 0; i < 16 - length; i++) {
            str = str + ' ';
        }
        return str;
    }
    
    public String a(String s1,String s2,String s3){
        AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(s3.getBytes());
        Key secretKeySpec = new SecretKeySpec(s2.getBytes(), "AES");
        System.out.println(secretKeySpec);
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/NoPadding");
            instance.init(1, secretKeySpec, ivParameterSpec);
            System.out.println(instance);
            //return e.a(instance.doFinal(a(s1).getBytes()))
            e e = new e();
            System.out.println(e.ee(instance.doFinal(a(s1).getBytes())));
            
        } catch (Throwable th) {
            
        }

        return "A";
    }
    
    public static void main(String[] args){
        test test1 = new test();
        String b = "%7B%22appInfo%22%3A%7B%22lang%22%3A%22cn%22%2C%22appId%22%3A%22NEWS01%22%2C%22chanId%22%3A%22tencent%22%2C%22origChanId%22%3A%22tencent%22%2C%22verCode%22%3A%221186%22%2C%22verName%22%3A%221.8.6%22%2C%22dhid%22%3A%224E2585D7517E34F4C6566FF8F493E0AE%22%2C%22imei%22%3A%22147505163151561%22%2C%22androidId%22%3A%223d926c60497727ff%22%2C%22feedVer%22%3A1028%2C%22cts%22%3A1538114365674%2C%22mac%22%3A%229d%3Ab0%3Acf%3Adb%3Aca%3A74%22%2C%22cityCode%22%3A%22%22%2C%22longi%22%3A%22%22%2C%22lati%22%3A%22%22%2C%22uhid%22%3A%22%22%2C%22openId%22%3A%22%22%2C%22netModel%22%3A%22w%22%2C%22capBssid%22%3A%229d%3Ab0%3Acf%3Adb%3Aca%3A74%22%2C%22capSsid%22%3A%22WiredSSID%22%7D%2C%22bizCodes%22%3A%222%2C3%2C4%2C5%2C6%2C9%2C10%22%7D";
        test1.a(b,"q67n6CSkuoOF$w6L","AdWhfrhjFUhTM&J2");
    }
}

