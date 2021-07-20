public class MultiTest {
    public static void main(String[] args) {
        int array[][] = new int[][]{{1,2,3,4},{2,5,8,9},{0,9,8,7}};

        int row = array.length;
        int column = array[0].length;

        System.out.println("Row size is :"+row);
        System.out.println("Column size is :"+column);
        int j = column -1;
        for(int i=0;i<row;i++){
            System.out.print(array[i][j] +"  ");
        }
    }
}
