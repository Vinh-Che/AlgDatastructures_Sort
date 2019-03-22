import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InsertionSort is = new InsertionSort();
        RadixSort rs = new RadixSort();
        QuickSort qs = new QuickSort();
        MergeSort ms = new MergeSort();
        int a[] = new int[0];

        Random r = new Random();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Antall tall som skal sorteres: ");
            int scInt = in.nextInt();
            menuInsctructions();
            int option = in.nextInt();
            System.out.println("Inkrementer med: ");
            int inc = in.nextInt();

                for (int n = 1; n < scInt; n += inc) {
                    a = new int[n];
                    long time = 0;

                    for (int i = 0; i < n; i++)
                        a[i] = r.nextInt(n);

                    time = System.currentTimeMillis();

                    if (option == 1) {
                        qs.sort(a, 0, a.length-1);
                    }
                    if (option == 2) {
                        rs.radixsort(a, a.length);
                    }

                    if (option == 3) {
                        is.insertionSort(a);
                    }
                    if (option == 4) {
                        ms.sort(a, 0, a.length - 1);
                    }
                    if (option == 5) {
                        System.out.println("Program avsluttes.");
                        System.exit(0);
                    }
                    if (option < 1 || option > 5) {
                        System.out.println("Ugyldig input");
                        System.exit(0);
                    }

                    time = System.currentTimeMillis() - time;
                    System.out.println("n: " + n + "  \tt: " + time + " ms " + "\tt/n^2: " + (float) time / ((float) n * n));

                }
                System.out.println("\n" + "Ferdig sortert: ");
                is.printArray(a);

            }
        }

        public static void menuInsctructions () {
            System.out.println("Hvilken sorterings metode skal brukes?: ");
            System.out.println(
                    "1. Quick Sort" + "\n" +
                    "2. Radix Sort" + "\n" +
                    "3. Insertion Sort" + "\n" +
                    "4. Merge Sort" + "\n" +
                    "5. Avslutt" + "\n");
        }
    }

