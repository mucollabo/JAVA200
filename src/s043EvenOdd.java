public class s043EvenOdd
{
    public static void showOddEvenw(int n)
    {
        int temp = n;
        while(temp != 1)
        {
            if(temp%2 == 1)
            {
                temp = temp * 3 + 1;
            }
            else
            {
                temp /= 2;
            }
            System.out.print("[" + temp + "]");
        }
        System.out.println("\n------------------------------------------------------------------------------");
    }
    public static void main(String[] args)
    {
        showOddEvenw(122);
    }
}
