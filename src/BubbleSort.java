import java.util.Arrays;

public class BubbleSort {
    //create method
    public static void sort(int[] array)
    {
        System.out.println("Original array: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; ++j)
            {
                //check adjacent elements with + 1
                if (array[i] < array[j])
                {
                    //swap elements
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
