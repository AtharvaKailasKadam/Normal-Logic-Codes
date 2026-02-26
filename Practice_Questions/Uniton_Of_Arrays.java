package Practice_Questions;

public class Uniton_Of_Arrays
{
    public void UnionOfArrays(int[] Arr1, int[] Arr2, int size1, int size2)
    {
        int[] unionArray = new int[size1 + size2];
        int i = 0, j = 0, k = 0;

        while(i < size1 && j < size2)
        {
            if(Arr1[i] < Arr2[j])
            {
                unionArray[k] = Arr1[i];
                i++;
                k++;
            }
            else
            {
                unionArray[k] = Arr2[j];
                j++;
                k++;
            }
        }
        while (i < size1)
        {
            unionArray[k] = Arr1[i];
            i++;
            k++;
        }
        while(j < size2)
        {
            unionArray[k] = Arr2[j];
            j++;
            k++;
        }

        for(int x = 0; i < k; i++)
        {
            if(unionArray[x] == 0 || unionArray[x] != unionArray[x+1])
            {
                System.out.println(+unionArray[x]);
            }
        }
    }
}
