public class Chum {
    public static void main(String[] args)
    {
        /* --- 1 --- */
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for(int i = 0; i< testArr1.length; i++){
            for(int j = 0; j < testArr1[0].length; j++){
                System.out.print(testArr1[i][j] + " ");
            }
        }
        System.out.println("---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for(int[] in: testArr1){
            for(int num : in){
                System.out.print(num + " ");
            }
        }
        System.out.println("---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

        for(int i = 0; i< testArr1[0].length; i++){
            for(int j = 0; j < testArr1.length; j++){
                System.out.print(testArr1[j][i] + " ");
            }
        }


        /* --- 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish

        /* WRITE CODE HERE! */
        for(String[] in: testArr2){
            for(String num : in){
                System.out.print(num + " ");
            }
        }
        System.out.println("---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish

        /* WRITE CODE HERE! */
        for(int i = 0; i< testArr2[0].length; i++){
            for(int j = 0; j < testArr2.length; j++){
                System.out.print(testArr2[j][i] + " ");
            }
        }
    }
    public static < E > boolean contains(E[] arr, E tar){
        for(E ele: arr){
            if(ele.equals(tar)){
                return true;
            }
        }
        return false;
    }
    public static < E > boolean columnCheck(E[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            Object[] col = new Object[matrix[0].length];
            for (int j = 0; j < matrix.length; j++) {
                if(contains(col, matrix[j][i])){
                    return false;
                }
                col[j] = matrix[j][i];
            }
        }
        return
    }

}
