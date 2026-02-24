import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class A14_Duplicate_Elements_In_Array_Using_SET
{
    public int DuplicateElementsInArraySET(int[] Arr)
    {
        Set<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < Arr.length; i++)
        {
            set.add(Arr[i]);
        }

        int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Original Array : " + Arrays.toString(Arr));
        System.out.println("Array after Removing Duplicates : " +Arrays.toString(uniqueArray));

        return uniqueArray.length;
    }

    public static void main(String[] args)
    {
        int[] Arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 1};

        A14_Duplicate_Elements_In_Array_Using_SET DEIAUS = new A14_Duplicate_Elements_In_Array_Using_SET();
        int uniqueCount = DEIAUS.DuplicateElementsInArraySET(Arr);
        System.out.println("Number of Unique Elements in the Array : " + uniqueCount);
    }
}
