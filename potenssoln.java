// Q.2 write a function for an Array and a target sum value to find if there are 3 numbers whose sum is equal to the given target sum value.

class potenssoln {

    boolean findNum(int arr[], int arr_size, int targeSum)
    {
        int l, r;
        for (int i = 0; i < arr_size - 2; i++) {

            for (int j = i + 1; j < arr_size - 1; j++) {

                for (int k = j + 1; k < arr_size; k++) {

                    if (arr[i] + arr[j] + arr[k] == targeSum) {
                        System.out.print("output is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        potenssoln output = new potenssoln();
        int arr[] = { 1, 2, 6, 9, 3 };
        int targeSum = 13;
        int arr_size = arr.length;
 
        output.findNum(arr, arr_size, targeSum);
    }
}

// Nilesh@DESKTOP-5T06N80 MINGW64 ~/Documents/GitHub/potenssoln
// $ javac potenssoln.java

// Nilesh@DESKTOP-5T06N80 MINGW64 ~/Documents/GitHub/potenssoln
// $ java potenssoln
// output is 1, 9, 3
// Nilesh@DESKTOP-5T06N80 MINGW64 ~/Documents/GitHub/potenssoln
// $