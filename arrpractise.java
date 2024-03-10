



public class arrpractise {


  public static void main(String args[]){

    int arr[] = {1,1,2,3,4,4};
    int count[]= new int[arr.length+1];
  
    for(int i =0;i<arr.length;i++){
  
   count[arr[i]]++;
  
    }
  int l = 0;
  for (int i =0;i<count.length;i++){
  if(count[i]>0){
    l++;
  }
  }
  int newarr[]= new int[l];
  int k=0;
  for(int i=0;i<count.length;i++)
   {  while(k<l){
      if(count[i]>0){
        newarr[k]=i;
        k++;
        break;
        

      }
    
    }
  
    }
    for (int i = 0; i < newarr.length; i++) {
      System.out.print(newarr[i] + " ");
  }

  }


}
    

