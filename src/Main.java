import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();

        //create array to send to BubbleSort
        int[] bubArray;
        bubArray = new int[10];

        //fill array
        for (int i = 0; i < 10; i++)
        {
            bubArray[i] = rnd.nextInt(100);
        }

        BubbleSort.sort(bubArray);

        System.out.println("Bubble sorted array: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(bubArray[i]);
        }

        System.out.println("***************");

        System.out.println("Using optimized bubble sort algorithm: ");
        OptimizedBubbleSort.sort(bubArray);

    }
}