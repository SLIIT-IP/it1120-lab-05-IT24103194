import java.util.Scanner;
public class IT24103194Lab5Q2
{
 public static void main(String[] args)
 {
  int num;
  //variable declare

  Scanner input=new Scanner(System.in);
  System.out.print("Enter the number of new members introduced:");
  num=input.nextInt();
  //user to input data
  
if(num>=0)
 {
switch (num)
 {
  case 5:
    System.out.print("\n Prize is a : Headphone");
  break;
  
  case 4:
    System.out.print("\n Price is a : Travelling Chair");
  break;
 
  case 3:
    System.out.print("\n Price is a : Bag");
  break;
 
  case 2:
    System.out.print("\n Price is a : Umbrella");
  break;

  case 1:
    System.out.print("\n Price is a : Pen");
  break;

  case 0:
   System.out.print("\n No Price");
  break;
  default:
   System.out.print("\n Price is a : Headphone");
  }
 }
else
 {
  System.out.print("Input must be a number 0 or greater");
 }
 }
}
  