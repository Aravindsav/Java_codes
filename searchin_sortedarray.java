public class searchin_sortedarray {

public static boolean staircasesearch(int matrix[][],int key){

    int row = 0 ,col =matrix[0].length-1 ;
    while(row<matrix.length-1 && col>=0){
     if(matrix[row][col]==key) {
        System.out.println(" found key at " + "("+ row +","+ col+ ")");
        return true;

     }  
     else if(key<matrix[row][col]){
        col--;
     }

     else {
        row++;
     }
    }

     
        System.out.print("key is not found");
        return false;
        
    
    }

    



    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},{13,14,15,16}};
int key = 9;
        staircasesearch(matrix,key);
        


    
}
}

