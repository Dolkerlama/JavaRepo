package arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 10, 20, 35, 40,};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arr[i] = arr[i] * 2;
            arr[i] = arr[i] % 3;


        }
        System.out.println("New result is = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("another new result is = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}