package Matrix;

class JaggedArrays {
    public static void main(String[] args) {
        // jagged array
        // in this we fixed the size of the row and the size of column is dynamic
        int[][] mat = new int[2][];

        mat[0] = new int[3]; // first row has 3 column.
        mat[1] = new int[5]; // second row has 5 columns

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = count++;
            }
        }
        for (int[] row : mat) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        // String str1 = "hello";
        // String str2 = "hello";
        // System.out.println(System.identityHashCode(str1));
        // System.out.println(System.identityHashCode(str2));
        // if the value of two string are same and they are created in different
        // variable.since they are stored in same string pool .This concept is called
        // string interning. String interning saves memory of the system
        // if we create string usigng new word then it will use separate space for same string
        // String str3=new String("hello");
        // String str4=new String("hello");
        // System.out.println(System.identityHashCode(str3));
        // System.out.println(System.identityHashCode(str4));

        // int[] arr1 = { 1, 2, 3, 4, 5 };
        // int[] arr2 = { 1, 2, 3, 4, 5 };
        // System.out.println(System.identityHashCode(arr1));
        // System.out.println(System.identityHashCode(arr2));
       

    }
}