package week2.search_algorithm;

public class ThuatToanNhiPhanKhongDeQuy {
    static int[] list = {2, 4, 10, 11, 45, 48, 59, 60, 66, 69, 70, 79};

    public static  int binarySearch(int[] list,int key){
        int low=0;
        int high=list.length-1;
        while (high>=low){
            int mind =(low+high)/2;
            if (list[mind]>key){
                high=mind-1;
            }else if(key==list[mind]){
                return  mind;
            }else {
                low=mind+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        binarySearch(list,50);
        System.out.println(binarySearch(list,50));
    }
}
