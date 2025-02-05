import java.util.*;

public class Main {
    public static void main(String[] args) { // default function
        // and when you declare a function as static you don't need to make any object
        // of it to run
        // public is a access modifier
        // System.out.println("Hello World!"); //void tells when you call this function
        // it will not return any value
        // StringBuilder sb = new StringBuilder("Hello");
        // for(int i=0; i<sb.length()/2;i++){
        // int front =i;
        // int back = sb.length()-1-i;

        // char frontchar = sb.charAt(i);
        // char backchar = sb.charAt(back);
        // sb.setCharAt(front,backchar);
        // sb.setCharAt(back, frontchar);

        // }
        // System.out.println(sb);
        // int n=4;
        // int position=3;
        // int bitMask = 1<<position;
        // if((bitMask & n)==0){
        // System.out.println("The bit was zero");
        // }else{
        // System.out.println("The bit was non-zero");
        // }
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n = 5;
        int position = 1;
        int bitmask = 1 << position;
        int newNum=0;
        // int oper =1; //update bit to 1 else update bit to 0
        if (operation == 1) {
            // set operation
            newNum = bitmask | n;
        }else{
            int notbm = ~bitmask;
            newNum = notbm | n;
        }
        System.out.println(newNum);

        // int bitMask = 1<<position;
        // int notbm= ~bitMask;
        // int newNum = notbm & n;
        // System.out.println(newNum);
    }
}