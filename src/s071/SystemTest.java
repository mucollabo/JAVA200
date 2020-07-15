package s071;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
public class SystemTest {
    public static void main(String[] args) {
        long ltime = System.currentTimeMillis();
        System.out.println((ltime));
        for (int i=0; i<100000; i++) {
            System.out.print("");
        }
        long ltime2 = System.currentTimeMillis();
        System.out.println((ltime2 - ltime));
        System.out.println(ltime2/1000/60/60/24/365+"년");
        Properties pro = System.getProperties();
        // 원하는 System property
        System.out.println(pro.getProperty("java.vm.version"));
        System.out.println(pro.getProperty("file.seperator"));

        System.out.println(new Date(System.currentTimeMillis()));   // 오늘
        //--------------------java.util.*에서--------------------//
        // 모든 System property
        Enumeration<Object> en=pro.keys();
        int i = 0;
        while (en.hasMoreElements()) {
            String keys = (String)en.nextElement();
            System.out.println((++i + " ") + keys + " : " + pro.getProperty(keys));
        }
    }   // main
}
