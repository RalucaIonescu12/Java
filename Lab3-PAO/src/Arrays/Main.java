package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[0];   //odata declarat nu se mai poate modifica dimensiunea(dimensiune fixa)
//        int[] arr2 = {7,3,10,4,1};
//        int[] arr3 = new int[] {1,2,3,4,5};
//
//        int [][] arr4=
//                {
//                        {1,2,3,4},
//                        {1,2},
//                        {5,6,7}
//                };
////        for(int i=0;i<arr2.length ;i++)
////        {
////            System.out.println("Elementul cu valoarea: " + arr2[i]);
////        }
////        for (int i : arr2)   ///array nu are iterator
////        {
////            System.out.println("Elementul cu valoarea: " + i );
////        }
////
////        Arrays.stream(arr2).forEach(System.out::println);
////        Arrays.stream(arr2).forEach(e->System.out.println("Elementul :" + e));
////
////        System.out.println(Arrays.toString(arr2));
////        System.out.println(Arrays.deepToString(arr4));
////
//        System.out.println("Before sorting:");
//        System.out.println(Arrays.toString(arr2));
//        Arrays.sort(arr2);
//        System.out.println("After sorting:");
//        System.out.println(Arrays.toString(arr2));
////        Arrays.fill(arr2,0);
////        System.out.println(Arrays.toString(arr2));
//
//
//        ///adaugare intr un array cand el are dimensiune fixa
//        arr = addElementToArray(arr,8);
//        arr = addElementToArray(arr,100);
//        arr = addElementToArray(arr,200);
//        arr = deleteElementFromArray(arr,3);
//        System.out.println(Arrays.toString(arr)); //exception
        //arrays au dimensiune fixa
        int [] arr = new int[0];
        for( int i : arr) System.out.println(i);
        int [] arr2 = {2,1,7,3,5};
        int [] arr3 = new int[]{1,2,3,4,5};
        int [][] arr4 = {
                {1,2,3,4},
                {2,3},
                {5,6,7}
        };

//        for(int i = 0; i < arr2.length; i++){
//            System.out.println("Element cu valoare: " + arr2[i]);
//        }
//
//        for( int i : arr2){
//            System.out.println("Element cu valoare: " + i);
//        }
//
//        Arrays.stream(arr2)
//                .forEach(e -> System.out.println("Element cu valoare: " + e));
//
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.deepToString(arr4));

        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.binarySearch(arr2, 8));

        arr = addElementToArray(arr, 8);
        arr = addElementToArray(arr, 6);
        arr = addElementToArray(arr, 3);
        System.out.println(Arrays.toString(arr));
        arr = deleteElementFromArray(arr,3);
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[6]); // exception
    }

    private static int[] deleteElementFromArray(int [] arr, int value) {
        return Arrays.stream(arr)
                .filter(e -> e != value)
                .toArray();
    }

    private static int[] addElementToArray(int[] arr, int value) {
        int [] newArr = new int[arr.length + 1];

        //System.arraycopy(arr, 0, newArr, 0, arr.length);
        for(int i = 0; i < arr.length; i ++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = value;
        return newArr;
    }
}