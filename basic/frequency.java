//writ a program to find the frequence of each element on the array.
class Frequency 
{
    public static void main(String[] args) 
    {
       int arr[]  = new int[]{1,2,8,3,3,2,2,2,5,1}; // Sample array
       int fr[] = new int[arr.length];
       int visited[]=-1;
       for (int i = 0; i < arr.length;i++)
       {
        int count = 1;
        for (int i=i+1; i < arr.length;i++)
        {
            int count=1;
            for()
        {
            if(arr[i]==arr[j])
            {
                count++;
                fr[j]=visited;
            }
        }
       
        if(fr[i]!=visited)
        fr[i]=count;
       }
       System.out.println("============================");
       System.out.println("Elemrent|Frequency");
       for(int i=0;i<fr.length;i++)
       {
        if(fr[i]!=visited)
        System.out.println(" "+arr[i]+" | "+fr[i]);
       }
    System.out.println("===============================");
    }
}
//write a program to print the larggest elements in array.
// write a program to print the smallest elelem in the array.
// write a program in java to find the second largrst number of an array.