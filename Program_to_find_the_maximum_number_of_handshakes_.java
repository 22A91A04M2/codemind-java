import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,h;
        n=sc.nextInt();
        h=n*(n-1)/2;
        System.out.println(h);
    }
}