// Codeforces problem - 236A
import java.util.Scanner;

public class set{
// BY maisha_maliha_
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String str2="";
        byte i,j,k;
        for(i=0;i<str.length();i++){
          k = (byte)(str2.length());
          for(j=0;j<k;j++){
            if(str2.charAt(j) == str.charAt(i)){
              break;
            }
          }
          if(j==k){
            str2 += str.charAt(i);
          }
        }
        if(str2.length()%2==0){
          System.out.println("CHAT WITH HER!");
        } else {
          System.out.println("IGNORE HIM!");
        }
        inp.close();
    }
}
