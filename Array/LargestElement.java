package Array;
public class LargestElement {

    public static void main(String[] args) {

        int arr[] = {12, 15, 18};

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}