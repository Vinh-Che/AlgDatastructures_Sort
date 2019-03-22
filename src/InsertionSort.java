// Klassen er fra: http://www.it.hiof.no/algdat/kode/sequentialSorting.java og https://www.geeksforgeeks.org/insertion-sort/

public class InsertionSort {

    public static void insertionSort(int A[])
    {
        // Innstikksortering av array med heltall

        int n = A.length;
        int key;

        for (int i = 1; i < n; i++)
        {
            // A er sortert t.o.m. indeks i-1
            key = A[i];
            int j = i;
            // Setter element nummer i pÃ¥ riktig plass
            // blant de i-1 fÃ¸rste elementene
            while (j > 0 && A[j-1] > key)
            {
                A[j] = A[j-1];
                j--;
            }
            A[j] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println("\n");

    }
}
