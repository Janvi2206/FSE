import java.util.*;
public class Kmp{
    public static void main(String[] args) { //default function
        //and when you declare a function as static you don't need to make any object of it to run
        //public is a access modifier
        System.out.println("Hello World!"); //void tells when you call this function it will not return any value 
        Scanner sc = new Scanner(System.in);
       
    }
    static void constructLps(String pat, int[] lps){
        lps[0]=0;
        int len=0;
        int i=1;
        while(i<pat.length()){
            if(pat.charAt(len)==pat.charAt(len)){
                len++;
                lps[i]=len;
                len++;
            }else{
                if(len !=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }

        }
    }
}