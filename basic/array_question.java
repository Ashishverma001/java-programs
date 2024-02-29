class sort
{
    public static void main(String[] args) 
    {
        int arr[] = new int[]{78,35,1,3,-3,-1,6,55,20,38};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length;j++);
            {
                int tmp=0;
                if(arr[i]>arr[j])
                {
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
            System.out.println(arr[i]);
        }
        
    }
}
//write a program to the print the elements of array to presnt on odd postion.
//write a program to right rotate to element of an array.