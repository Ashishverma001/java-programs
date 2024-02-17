import.java.util.scanner;
 class bill
{
 public static void main(String arg[])
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter unit consumed");
  int unit=sc.nextInt();
  int rate;
  if(unit>=0 && unit <= 100)
 {
   rate=5;
   int charge =( unit * rate)+ 300;
   System.out.println("unit consumed" + unit);
   System.out.println("rate per unit is " + rate);
   System.out.println("Total charge " + charge);

   }
   else if(unit >= 101 && unit <= 200)
   {
     rate =8;
     int charge=(unit * rate) + 300;
     System.out.println("unit consumed" + unit);
     System.out.println("rate per unit is " + rate);
     System.out.println("Total charge " + charge);

    }
   else if(unit >= 201)
   {
     rate = 10;
     int charge =(unit * rate ) + 300;
     System.out.println("unit consumed" + unit);
     System.out.println("rate per unit is " + rate);
     System.out.println("Total charge " + charge);
     
   }
}
}
