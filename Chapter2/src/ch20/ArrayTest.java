package ch20;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total =0;

        for(int i =0, num=1; i<arr.length; i++){
            //0으로 초기화됨
            //System.out.println(arr[i]);
            arr[i]=num++;
        }

        //enhanced for
        for (int num : arr){
            total +=num;
        }
        System.out.println(total);
    }

}
