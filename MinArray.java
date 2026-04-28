public class MinArray {
    public static void main(String[]arg)
    {
        int arr[] = {13,6,5,24};
        int arr[] = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in array is:" + min);

    }
    
}
