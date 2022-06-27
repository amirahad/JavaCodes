package MaxMin;

public class MaxMin {
    static int Max(int a[], int index, int l) {
        int max;
        if (index >= l - 2) {
            if (a[index] > a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        max = Max(a, index + 1, l);
        if (a[index] > max)
            return a[index];
        else
            return max;
    }

    static int Min(int a[], int index, int l) {
        int min;
        if (index >= l - 2) {
            if (a[index] < a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        min = Min(a, index + 1, l);
        if (a[index] < min)
            return a[index];
        else
            return min;
    }

    public static void main(String[] args) {

        int min, max;
        int a[] = { 70, 250, 50, 80, 140, 12, 14 };
        int len = a.length;

        max = Max(a, 0, len);
        min = Min(a, 0, len);

        System.out.printf("The minimum number in " + "a given array is : %d\n", min);
        System.out.printf("The maximum number in " + "a given array is : %d", max);
    }
}
