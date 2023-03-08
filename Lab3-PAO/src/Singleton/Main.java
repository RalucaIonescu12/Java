package Singleton;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        var singletonService1 = SingletonService.getInstance();
//        var singletonService2 = SingletonService.getInstance();
//        System.out.println(singletonService1.hashCode());
//        System.out.println(singletonService2.hashCode());

        var singletonService1 = SingletonService.getInstance();
        var sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose one of the following options.");
            System.out.println("1.List all the cars.");
            System.out.println("2.Add new car.");
            System.out.println("3.Add review.");
            System.out.println("4.Exit.");
            System.out.println("5.Show reviews for a car.");
//            System.out.println("3.Add review.");


            int nr = sc.nextInt();
            switch (nr) {
                case 1 -> singletonService1.listAllCars();
                case 4 -> System.exit(0);
                case 2 -> {
                    System.out.println("Enter car name:");
                    String name = sc.next();
                    System.out.println("Enter car color:");
                    String color = sc.next();
                    singletonService1.addCar(new Car(name, color, new String[0]));
                }
                case 3->
                {
                    System.out.println("Enter car name:");
                    String name = sc.next();
                    System.out.println("Enter review:");
                    String review = sc.next();
                    singletonService1.addReviewForCar(name,review);
                }
                case 5->
                {
                    System.out.println("Enter car name:");
                    String name =sc.next();
                    singletonService1.showReviewsForCar(name);

                }
            }
        }

    }


//    private static int[] deleteElementFromArray(int[] arr,int value) {
//        return Arrays.stream(arr).filter(e->e!=value).toArray();
//    }
//
//
//    private static int[] addElementToArray(int[] arr, int value)
//    {
//        int[] newArr = new int[arr.length + 1 ];
////        for(int i=0;i<arr.length;i++)
////            newArr[i]=arr[i];
//
//        System.arraycopy(arr, 0, newArr, 0, arr.length); //echivalent cu forul
//
//        newArr[newArr.length -1] = value;
//        return newArr;
//    }
}