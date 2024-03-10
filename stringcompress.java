public class stringcompress {


public static void strcompress(StringBuilder str ){

    StringBuilder newstr = new StringBuilder("");
 str.toString();

 for(int i =0;i<str.length();i++){

    Integer count = 1;

    while(i < str.length()-1 && str.charAt(i)== str.charAt(i+1)){

        count++;
        i++;
    }

    newstr.append(str.charAt(i));
    if(count>1){
        newstr.append(count.toString());
    }
    
 }

 System.out.print(newstr.toString());

}

    public static void main(String args[]){

        StringBuilder str = new StringBuilder("aaabbccc");
        strcompress(str);
    }

}
