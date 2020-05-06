import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {
    public static void main(String[] args) {
        //기본 타입의 배열은 참조 타입
        int [] m = {1, 2, 3};
        int [] n = new int[] {1, 2, 3};
        String card = "H8";
        Date d = new Date();
        Calendar cal = Calendar.getInstance();

        System.out.println(card);
        System.out.println(d);
        System.out.println(cal);
    }
}
