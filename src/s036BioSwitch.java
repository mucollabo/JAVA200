public class s036BioSwitch
{
    public static String textInfor(int index, double value)
    {
        String result = "";
        switch(index)
        {
            case 23 : result = "신체 지수: "; break;
            case 28 : result = "감성 지수: "; break;
            case 33 : result = "지성 지수: "; break;
        }
        return result + (value * 100);
    }
    public static void main(String[] args)
    {
        int index = 23;
        double value = 0.86;
        String st = textInfor(index, value);
        System.out.printf(st);
    }
}
