import java.util.Scanner;

class PassFailDuality
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double Q1,Q2,ave;

        System.out.println("Enter Quiz 1 Mark : ");
        Q1 = sc.nextDouble();

        System.out.println("Enter Quiz 2 Mark : ");
        Q2 = sc.nextDouble();

        ave= (Q1+Q2)/2;
        System.out.println("You get "+ ave + "average marks");

        if(ave>=40)
        {
            System.out.println("Great! You are pass.")
        }
        else
        {
            System.out.println("Sorry, you are fail.");
        }

    }
}