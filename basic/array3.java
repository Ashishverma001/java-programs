class duplicate_data
{
 public static void main(String arg[])
 {
  int x[]=new int[]{1,2,3,4,2,7,8,8,2};
  System.out.println("Duplicate element in given array");
  for(int i=0;i<x.length;i++)
  {
   for(int j=i+1;j<x.length;j++)
    {
     if(x[i]==x[j])
      System.out.println(x[j]);
    }
  }
 }
}