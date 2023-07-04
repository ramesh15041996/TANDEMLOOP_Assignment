import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){


    List<Integer> numbers = List.of(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30,44);

    //Creating a map to store given 1-9 integer and values which get multiply by it in key value pair
    Map<Integer, Integer> countMap = new HashMap<>();

       //looping from 1-9
        for (int i = 1; i <= 9; i++) {
        //  storing i values as key  (1-9)
            countMap.put(i, 0);
        }

        //looping numbers list 
        for (int number : numbers){
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }
        System.out.println(countMap);
    }
    }