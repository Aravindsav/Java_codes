public class trappingwater{

public static int trappedRainWater(int height[]){

int leftmax[] = new int[height.length];
leftmax[0]=height[0];

// Calculating left max
for(int i=1;i<height.length;i++){

    leftmax[i]=Math.max(leftmax[i-1],height[i]);

}
//calcularting rightmax
int rightmax[]= new int[height.length];
rightmax[height.length-1]= height[height.length-1];

for(int i=height.length-2;i>=0;i--){
    rightmax[i] = Math.max(rightmax[i+1],height[i]);
}

//loop
int trappedwater=0;

for(int i=0;i<height.length;i++){
    int waterlevel = Math.min(leftmax[i],rightmax[i]);
    trappedwater+=waterlevel - height[i];


}

return trappedwater;


}


public static void main(String args[]){
    int height[] = {4,2,0,6,3,2,5};
   System.out.println("The trapped rain water is "+trappedRainWater(height));
}

}