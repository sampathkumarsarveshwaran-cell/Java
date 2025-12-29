public class ArrayDemo {
    public static void main(String[] args) {
        int a1[] = {1,2,3,4};
        System.out.println(a1[1]);
        System.out.println("\n");
        int a2[] = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println(a2[i]);
        }
        System.out.println("\n");
        a2[3] = 77;
        for (int i = 0; i < 4; i++) {
            System.out.println(a2[i]);
        }
        System.out.println("\n");

        //Multi Dimensional Array
        int md[][] = new int[3][4]; // 3 arrays (row) with size 4 (column) each 
        for (int i=0; i<3; i++){ // row
            for (int j =0; j<4; j++){ // column
                md[i][j]= (int) (Math.random()*10);
            }
        }
        for (int i=0; i<3; i++){
            for (int j =0; j<4; j++){
                System.out.print(md[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");

        for (int row[] : md) {
            for (int value: row){
                System.out.print(value + " ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");

        // Jagged Array - Unequal sizes 
        int ja[][] = new int [3][];
        ja[0] = new int[1]; // Size
        ja[1] = new int [2];
        ja[2] = new int [3];

        for(int i = 0; i< ja.length; i++){
            for (int j=0; j< ja[i].length; j++){
                ja[i][j] = (int)(Math.random()*10);
            }
        }
        System.out.println("\n");

        for (int row[]: ja){
            for( int value : row){
                System.out.print(value + " ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");

        // 3D array
        int td[][][] = new int[3][2][4]; // 3 rows (arrays) of size (column) 2 with each value in the array containing array of size 4
        for(int i=0; i< td.length; i++){
            for(int j=0; j< td[i].length; j++){
                for(int k=0; k< td[i][j].length; k++){
                    td[i][j][k] = (int)(Math.random()*10);
                }
            }
        }

        for (int row[][]: td){
            for (int subarray[]: row){
                for (int value: subarray){
                    System.out.print(value + " ");
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }

    }
}
