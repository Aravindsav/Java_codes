public class maxsum_arr {


    public static void main(String args[]){

int maxsum = Integer.MIN_VALUE;



int arr[]={1,2,4,5};
for(int i =0;i<arr.length;i++){

    for(int j=i;j<arr.length;j++)
    {  int currsum=0;
   for(int k=i;k<=j;k++)
   {
    currsum+=arr[k];
   }
  
   if(currsum>maxsum)
   {
    maxsum=currsum;

   }
     


    }
    
  
}


System.out.println("The maximum  possible sum of the given array  is " + maxsum );

    }






    
}
