public class LeftRotate {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5};
        int sizeOfArray = array.length;
        System.out.println(sizeOfArray);
        int rotateBy = 2;
        //rotateBy%=sizeOfArray;
        int mod = rotateBy % sizeOfArray;
        System.out.println(rotateBy);
        System.out.println(2%5);
        for(int i=0;i<sizeOfArray;i++){
            System.out.println(i+mod +"  i+mod");
            System.out.println((i+mod)%sizeOfArray +" (i+mod)%sizeOfArray");
            System.out.print(array[(i + mod)%sizeOfArray]+" ");//
            System.out.println();
        }
    }
}
