package codingchallenges;
import java.util.*;
public class Arrayprint {
        public static void main(String[] args) {
            //TODO call and test your methods by observing what is printed to the console
            System.out.println("Testing your enviroment..."); // comment out these two lines to start coding and teting your methods!
            System.out.println("If you see this in your console, you are good to go! \n");

            int [] array = {10,9,8,7,6,5,4,3,2,1};

            System.out.println ("Output from printArray():\n");
            printArray(array);
            System.out.println ("Output from printOdds():\n");
            printOdds(array);
            System.out.println ("Output from printEvens():\n");
            printEvens(array);
            System.out.println ("Output from sortArray():\n");
            System.out.println("Unsorted Array:");
            System.out.println(Arrays.toString(array) + "\n");
            System.out.println("Sorted Array:");
            int [] sortedArray = sortArray(array);
            if (sortArray(array) == null){
                System.out.println("* * You are yet to sort your array! Make sure to also return the array for this exercise. * *\n");
            } else{
                System.out.println(Arrays.toString(sortedArray) + "\n");
            }
    
        }
        
        public static void printArray(int[] arr) {
            //TODO print out the elements of the array as comma separated values
        }
        
        
        public static void printOdds(int[] arr) {
            //TODO print out only the odd elements of the array as comma separated values
        }
        
        public static void printEvens(int[] arr) {
            //TODO print out only the even elements of the array as comma separated values
        }
        
        public static int[] sortArray(int [] arr) {
            //TODO Additional Challenge: Think about how you may sort the array into ascending values
            //NOTE: the return type of this array is NOT void. What should we be returning here?
            
            return null;
        }
    
    
}
