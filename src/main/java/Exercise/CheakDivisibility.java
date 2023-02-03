package Exercise;

public class CheakDivisibility
{

    public static void main(String[] args)
    {
        cheakDivisibility(88);
    }

    private static void cheakDivisibility( int num)
    {

        if (num % 3==0 && num % 5==0)
        {
            System.out.println("Number "+num+" is Divisible 3 and 5");
        }
        else if (num % 5==0)
        {
            System.out.println("Number "+num+" is Divisible 5");
        }
        else if (num % 3==0)
        {
            System.out.println("Number "+num+" is Divisible 3");
        }
    }
}