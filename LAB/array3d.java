public class array3d {
    public static void main(String[] args) {
        int[][][] arr ={{{54, 34, 65}, {23, 45, 67}, {12, 78, 90}},
                        {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}},
                        {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};
        
        System.out.println("3D Array:");
        display(arr);
        System.out.println("Maximum value in the 3D array: " + max(arr));
        System.out.println("Average value: " + average(arr));

    }

    public static int max(int[][][] arr) {
        int max = arr[0][0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    if(arr[i][j][k] > max){
                        max = arr[i][j][k];
                    }
                }
            }
        }
        return max;
    }

    public static double average(int[][][] arr){
        double ave;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    sum += arr[i][j][k];
                    count++;
                }
            }
        }
        ave = sum / count;
        return ave;
    }

    public static void display(int[][][] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
