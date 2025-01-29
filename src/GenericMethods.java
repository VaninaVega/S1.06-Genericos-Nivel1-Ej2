public class GenericMethods {

        //Generic method that receives 3 parameters of any type
        public static <T, U, V> void showData (T data1, U data2, V data3) {
            System.out.println("Data 1: " + data1);
            System.out.println("Data 2: " + data2);
            System.out.println("Data 3: " + data3);
            System.out.println("---------------------");
    }
}
