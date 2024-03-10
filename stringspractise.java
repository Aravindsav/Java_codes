import java.util.*;

public class stringspractise {
    

    public static int countlower(StringBuilder str ){

int count = 0;
 for(int i = 0;i<str.length();i++ ){

    if(str.charAt(i) == Character.toLowerCase(str.charAt(i))){
        count++;
    }
 }
 return count;
    }

    public static void main(String args[]){
System.out.print("please enter a string : ");
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine()) ;

System.out.print("the total number of lower case letters in the given string is "+ countlower(str));


    }
   
    
}
