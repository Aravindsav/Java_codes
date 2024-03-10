public class kadanesalgo {


public static void kadanes(int arr[]){
int currsum=0;
int maxsum= Integer.MIN_VALUE;
    for (int i=0;i<arr.length;i++){

        currsum+=arr[i];

        if(currsum>maxsum){
            maxsum=currsum;
        
        }
        if(currsum<0){
            currsum=0;
        }



    }

System.out.println("the max sum is "+ maxsum);

}
    
public static void main(String args[]){

    int arr[] ={1,2,-3,6,9};
    kadanes(arr);
}




}
