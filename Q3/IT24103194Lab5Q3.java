import java.util.Scanner;
public class IT24103194Lab5Q3
{
 public static void main(String[] args)
 {
 int days,Ds,De;
 double RPD,total,dis_max,dis_min;
 RPD=48000;
 //room chargers per day
 total=0;

 dis_max=0.20;
 //20% discount

 dis_min=0.10;
 //10% discount 


 Scanner input=new Scanner(System.in);
 System.out.print("Enter Start Date(1-31): ");

 Ds=input.nextInt();
 //having starting date
 System.out.print("Enter End Date  (1-31): ");

 De=input.nextInt();
 //having end date

 if(De>Ds)
 //start date is lower than end date verification
   { 
   days=De-Ds;
   if((Ds<=31 && Ds>=1) && (De<=31 && De>=1))
   //verifying about valid date
   {


                 if(days>=5) 
                  {
                        total=(RPD*days)*(1.00-dis_max);
                  }
                 else if(days>=3)
                  {
                        total=(RPD*days)*(1.00-dis_min);
                  }
                 else if(days>0 )
                  {
                        total=(RPD*days);
                  }
       

                 System.out.println("\nRoom Chargers Per Day: Rs." +RPD +"/=");
                 System.out.println("Number of Days Reserved: "  +days);
                 System.out.println("Total Amount to be Paid: "  +total);
      }  
      else 
      {
      System.out.println("Days must be between 1 and 31");
      }
  }
  else
  {
  System.out.println("Error:Start Date must be less than End Date");
  }
  }
}

