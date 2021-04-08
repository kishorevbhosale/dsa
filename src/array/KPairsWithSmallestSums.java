package array;

public class KPairsWithSmallestSums {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 11};
        int arr2[] = {2, 4, 8};
        int i=0,j=0,k=0,sum=arr1[i]+arr2[j];
        while (i<arr1.length && j<arr2.length && k<=3){
            if (arr1[i]<arr2[j] && arr1[i]+arr2[j]<=sum){
                System.out.println(arr1[i]+","+arr2[j]);
                sum = arr1[i]+arr2[j];
                j++;
            }else {
                System.out.println(arr1[i]+","+arr2[j]);
                i++;
            }
            k++;
        }
    }
}
