package week2.search_algorithm;

public class CaiDatThuatToanTimKiemNhiPhan {
    public static int searchBinary(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid =  (right + left) / 2;
            if (arr[mid] == x) {
                return mid;
            }else if (arr[mid] > x) {
                return searchBinary(arr, left, mid - 1, x);
            } else return searchBinary(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 9, 23, 34};
        int x = 34;
        int result = searchBinary(arr, 0, arr.length - 1, x);
        if (result != -1) {
            System.out.println("Index of "+x+" is "+result);
        } else {
            System.out.println("Not found");
        }
    }
}