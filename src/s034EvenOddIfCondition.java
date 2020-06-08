public class s034EvenOddIfCondition
{
    public static void main(String[] args)
    {
        int temp = 98;
        if(temp%2 == 1)
        {
            temp = temp * 3 + 1;
        }else
        {
            temp = temp/2;
        }
        System.out.printf("계산 후=%d\n", temp);
    }
}
