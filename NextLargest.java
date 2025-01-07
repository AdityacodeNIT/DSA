import java.util.*;

public class NextLargest {

    public static void nextLargestElement(int arr[], int nextGreaterArr[]) {
        Stack<Integer> s = new Stack<>();
        int k = arr.length - 1;
        // nextGreaterArr[k] = -1;

        // s.push();
        for (int i = k; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreaterArr[i] = -1;
            }

            else {
                nextGreaterArr[i] = arr[s.peek()];

            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreaterArr[] = new int[arr.length];

        nextLargestElement(arr, nextGreaterArr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(nextGreaterArr[i]);
        }
    }
}
