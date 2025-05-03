package leetcode.com.rai.arrayorstring;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int maxCandies = 0;
        for(int candy : candies){
            maxCandies = Math.max(maxCandies, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for(int candy : candies){
            if(candy + extraCandies >= maxCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candy = {2, 3, 4, 5,6};
        int xtraCandy = 3;

        System.out.println("Kids with greatest candies are : " + kidsWithCandies(candy, xtraCandy));
    }
}
