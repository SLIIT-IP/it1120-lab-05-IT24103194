import java.util.Scanner;
public class IT24103194Lab5Q1
{
 public static void main(String[] args)
 {
  int num1,num2,num3,max,min;
  
  //variable declaration
 


  Scanner input=new Scanner(System.in);
  System.out.print("Enter the first interger :");
  num1=input.nextInt();
  System.out.print("Enter the second integer :");
  num2=input.nextInt();
  System.out.print("Enter the third integer  :");
  num3=input.nextInt();
  //having inputs from user to run 

  if(num1>num2)
  {
   max=num1;
   min=num2;
  }
  //comparing first two integers as true part


  else
  {
   max=num2;
   min=num1;
  }
  //then false part



 if(num3>max)
 {
   max=num3;
 }
  //after having max and min from first two then we compare it with third int


 if(num3<min)
  {
  min=num3;
  }
  //
 
 System.out.print(" \n ");
 //having space
  

 System.out.println("User entered numbers are :" +num1 +" "  +num2 +" "  +num3);
 //we use + before each output and also we can use that before space +" "
 

   
  System.out.println("The Smallest number is  : "+min);

  System.out.println("The Largest number is   : "+max);

  }
}
