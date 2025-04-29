public class Part4 {
    public static void main(String[] args) {
        int[] array = new int [10];
        for (int i = 0 ; i < array.length ; i++){
            array[i] = (i+1)*3;
        }
        for (int items:array){
            System.out.println(items);
        }
        System.out.println("Array size: " + array.length);
    }
}
