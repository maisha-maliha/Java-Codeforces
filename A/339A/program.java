// Codeforces problem - 339A
import java.util.Scanner;

public class program{
// BY maisha_maliha_
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String val = inp.nextLine();
        String val2="";
        int j , i;
        for(i=0;i<val.length();i++){
            if(val.charAt(i)=='1'){
                if(val2.length()==0){
                    val2+="1";
                } else {
                    val2+="+1";
                }
            }
        }
        for(i=0;i<val.length();i++){
            if(val.charAt(i)=='2'){
                if(val2.length()==0){
                    val2+="2";
                } else {
                    val2+="+2";
                }
            }
        }
        for(i=0;i<val.length();i++){
            if(val.charAt(i)=='3'){
                if(val2.length()==0){
                    val2+="3";
                } else {
                    val2+="+3";
                }
            }
        }
        System.out.println(val2);
        inp.close();
    }
}
