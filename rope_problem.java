import java.util.*;
import java.lang.*;
import java.io.*;
 

class PMTest
{
private int minCost(int size, int[] arr) {
        int minCost = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < size; i++) {
            queue.add(arr[i]);
        }
        while (queue.size() > 1) {
            int first = queue.remove();
            System.out.println("first " + first);
            int second = queue.remove();
            System.out.println("second " + second);
            int sum = first + second;
            minCost += sum;
            queue.add(sum);
            System.out.println("que " + queue);
        }
        return minCost;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        PMTest connectNRopes = new PMTest();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max no of ropes: ");
        int size = sc.nextInt();
        System.out.println("Enter the  rope lengths: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int minCost = connectNRopes.minCost(size, array);
        System.out.println("Minimum cost of connecting ropes is: " + minCost);
    }
}
