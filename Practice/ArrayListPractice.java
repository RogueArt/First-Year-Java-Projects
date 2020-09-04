import java.util.*;

public class ArrayListPractice {
    public static int isReversed()

    {
        List<Integer> elements = new ArrayList<Integer>();
        elements.add(1);
        elements.add(3);
        elements.add(5);
        elements.add(1);
        int arr[] = {1, 3, 5, 7};
        int target = 7;
        int result = -1;

        // for (int j = 0; j < arr.length; j++)

        // {

        // if (arr[j] == target)

        // {

        // return j;

        // }

        // }
        for (int j : arr)

        {

            if (j == target)

            {

                return j;

            }

        }
        return -1;
    }

}