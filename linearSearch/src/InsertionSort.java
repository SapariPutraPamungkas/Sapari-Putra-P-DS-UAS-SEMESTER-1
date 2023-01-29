import java.util.Scanner;

public class InsertionSort
{
    public static void sort( int arr[] )
    {
        int N = arr.length;
        int i, j, temp;
        for (i = 1; i< N; i++)
        {
            j = i;
            temp = arr[i];
            while (j > 0 && temp < arr[j-1])

            {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Insertion Sort Test\n");
        int n, i;

        System.out.println("Masukan jumlah element integer");
        n = scan.nextInt();

        int arr[] = new int[ n ];

        System.out.println("\nMasukan nilai "+ n +" element integer");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        sort(arr);

        System.out.println("\nElement integer setelah diurutkan ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}