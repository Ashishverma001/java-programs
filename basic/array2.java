class array_rev
{
  public static void main(String[] args) 
  {
    int arr[]={1,2,3,4,5};
    System.out.println("oringinal arrray");
    for(int i=0;i<arr.length;i++);
    {
        System.out.println(arr[i]+"");
    }
    System.out.println();
    System.out.println("Array in reverce order");
    for(int i=0;i<arr.length-1;i>=0;i--);
    {
        System.out.println(arr[i]+"");
    }
  }
}