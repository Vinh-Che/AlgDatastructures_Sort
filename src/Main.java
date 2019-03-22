import com.sun.scenario.effect.Merge;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        InsertionSort aa = new InsertionSort();
        RadixSort bb = new RadixSort();
        QuickSort cc = new QuickSort();
        MergeSort dd = new MergeSort();


        Random r = new Random();

        for (int n = 1000; n <= 2000; n += 1000)
        {
            int a[] = new int[n];
            long time = 0;

            for (int i = 0; i < n; i++)
                a[i] = r.nextInt(n);

            time = System.currentTimeMillis();
            aa.insertionSort(a);
            time = System.currentTimeMillis() - time;
            System.out.println("n: " + n + "  \tt: " + time + " ms ");
                    //+ "\tt/n^2: " + (float) time/(n*n));
            //aa.printArray(a);


        }


    }
}
