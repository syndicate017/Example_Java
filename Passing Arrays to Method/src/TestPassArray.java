public class TestPassArray {
    /*Main method*/
    public static void main(String[] args) {
        /*Initialize the variable value*/
        int[] a = {1, 2};

        /*Swap the elements using the swap method*/
        System.out.println("Before invoking the swap method");
        System.out.println("Array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]); /*False swap*/
        System.out.println("After invoking the swap method");
        System.out.println("Array is {" + a[0] + ", " + a[1] + "}");

        /*Swap elements using the swapFirstTwoInArray method*/
        System.out.println("\nBefore invoking the swapFirstTwoInArray method");
        System.out.println("Array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking the swapFirstTwoInArray method");
        System.out.println("Array is {" + a[0] + ", " + a[1] + "}");
    }

    /*Create a new method swap method*/
    /*Swap two variables*/
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    /*Create a new method swapFirstTwoInArray method*/
    /*Swap the first two elements in the array*/
    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
