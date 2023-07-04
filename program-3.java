import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
         
        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of x");

        //recive the value of x
        int x = sc.nextInt();

        //creating an ArrayList to store values of x
        List<Integer> output = new ArrayList();
        
        for(int i=1;i<=x;i++){
            if(i==1){
                output.add(i);
            }
            //print if i is not an even number
           else if(i%2 !=0){
           output.add(2*(i-1)-1);
           output.add(2*i-1);
            }
            
        }
        System.out.println(output);
}
}