import java.util.Scanner;
public class Day1_restobill
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the price1: ");
    int prod1 = sc.nextInt ();
    System.out.print("Enter the price2: ");
    int prod2 = sc.nextInt ();
    System.out.print("Enter the price3: ");
    int prod3 = sc.nextInt ();
    System.out.print("Enter the Tax%: ");
    int tax_percent = sc.nextInt ();
    int Products_total=prod1+prod2+prod3;
    int Tax_amt=Products_total*tax_percent/100;
    int Total_bill=Tax_amt+Products_total;
    System.out.println("Total amount to be paid = " + Total_bill);
  }
}
