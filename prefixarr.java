public class prefixarr {


    public static void main(String args[]){
int arr[]= {1,2,3,4,5};

int currsum=0;
int prefix[]= new int[arr.length];
int maxsum= Integer.MIN_VALUE;
prefix[0]=arr[0];
for(int i=1;i<arr.length;i++){

    prefix[i]= prefix[i-1]+arr[i];
   
}




for(int i=0;i<arr.length;i++){
int start=i;
    for(int j=i;j<arr.length;j++){
int end=j;

        currsum = start ==0 ?prefix[end]: prefix[end]-prefix[start-1];

        if(currsum>maxsum){
            maxsum=currsum;
        }
    }
   
}
 
System.out.println("the maximum sum of a subarray of the given array is "+ maxsum);





    }
    
}
