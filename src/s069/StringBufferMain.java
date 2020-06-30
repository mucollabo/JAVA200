package s069;
public class StringBufferMain {
    public static void main(String[] args) {
        // StringBuffer 생성
        StringBuffer sb1 = new StringBuffer();
        // 1계속 붙이는 함수 mutable
        sb1.append("안녕하세요.")
                .append("또 만나요.")
                .append("모두를 사랑해요. 기다려봐.");
        System.out.println(sb1.toString() + sb1.hashCode());
        // 2replace
        sb1.replace(0, 2, "나 보기가 역겨워");
        System.out.println(sb1.toString() + sb1.hashCode());
        //3reverse
        sb1.reverse();
        System.out.println(sb1.toString());
        //4delete
        sb1.delete(10, 15);
        System.out.println(sb1.toString());
        //5cal by reference, shallow copy
        replaces(sb1);
        System.out.println(sb1.toString());
    }
    public static void replaces(StringBuffer sb) {
        sb.reverse();
        sb.replace(0, 3, "GoGo");
    }
}
