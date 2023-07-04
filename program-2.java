import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){

        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");

        //recive the value of x
        int x = sc.nextInt();
        
        //create a ArraList to store values
        List<Integer> output = new ArrayList();

        //looping from 1 to till x
        for(int i=1;i<=x;i++){
            output.add(2*i-1);
        }
        System.out.println(output);
        }
}