import java.util.Arrays;

public class OptimizedBubbleSort
{
    //method
    static void sort(int[] array)
    {
        if(array == null || array.length == 0)
        {
            return;
        }

        System.out.println("Original array: " + Arrays.toString(array));
        boolean isSwapped;
        int size = array.length;

        for(int i = 0; i < size - 1; i++)
        {
            isSwapped = false;

            //use size - i - 1, bc with every internal loop one more element
            //from end will be sorted
            for(int j = 0; j < size - i - 1; j++)
            {
                //check adjacent elements
                if(array[j] > array[j + 1])
                {
                    //swap elements
                    int temp = array[j]; //stick element here
                    array[j] = array[j + 1]; //swap current element in array with adjacent one
                    array[j + 1] = temp; //larger value that was stored in temp gets put back in array
                    isSwapped = true;
                }
            }
            //check if last iteration had any swaps
            //if there were swaps then break
            if(isSwapped == false)
            {
                break;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));

    }
}
