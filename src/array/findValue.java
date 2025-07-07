package array;

import java.util.*;
public class findValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Enter a number");
        int target = sc.nextInt();
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        System.out.println(found ? "Found" : "NotFound");
    }
}
