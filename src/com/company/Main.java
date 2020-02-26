package com.company;

public class Main {

    public static void main(String[] args) {
//        1. Create an integer array
        int[] myIntegers = new int[4];
//        2. Assign values to the array
        myIntegers[0] = 12;
        System.out.println("This is the first value in my Integers array " + myIntegers[0]);
        System.out.println("This is the second value in my Integers array " + myIntegers[1]);
//        3. Create a string array and assign values to it.
        String[] zooAnimals = {"monkey", "tiger", "bear"};
        System.out.println("The first animal in the zooAnimals array is " + zooAnimals[0]);
//        zooAnimals[3] = "Lemur";   BAD  Can't assign a value to an index that is larger than the length of the array.
//        4. Get any value from an array given it’s index.
//        5. Find the length of an array.
        int zooAnimalsLength = zooAnimals.length;
        System.out.println("The length of zooAnimals is " + zooAnimalsLength);
//        6. Loop Through an array.
        for (int i = 0; i < zooAnimals.length; i++){
            System.out.println(zooAnimals[i]);
        }

        for (String a : zooAnimals){
            System.out.println(a);
        }

        zooAnimals[1] = "cat";
        System.out.println(zooAnimals[1]);
//        7. Get the last and second to last element of an array.
        System.out.println("The last element in the array is " + zooAnimals[zooAnimals.length - 1]);
//        8. Create an array of objects. Next Video!
    }
}
