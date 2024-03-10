public class diagnolsum {

    public static void main(String args[]){

    int matrix[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},{13,14,15,16}};

//    int matrix2[][]= {{1,2,3},
//                      {4,5,6},
//                      {7,8,9}};
  int diagsum = 0;

for(int i = 0;i<matrix.length;i++){
    diagsum+=matrix[i][i];
   if( i!=matrix.length-1-i){
        diagsum+=matrix[i][matrix.length-i-1];
   }
}
System.out.print("the total sum of the diagnol is "+ diagsum);
    }
   
}
