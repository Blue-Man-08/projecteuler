public class Main
{
    public static void main(String [] args)
    {
        int counterVar = 0;
        for(int i = 2; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                counterVar += i;
            }
        }
        System.out.println(counterVar);
    }
}