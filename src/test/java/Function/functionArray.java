package Function;

public class functionArray {
    public static void main(String[] args) {
        int [] data1 = {17, 22, 56, 41, 89};
        int [] data2 = {45, 32, 22, 17, 19};

        for (int n = 0; n<data1.length; n++){
            for (int i = 0; i<data2.length; i++){
                if (data1[n]==data2[i])
                    System.out.print (data1[n] + " ");
            }
        }
    }
}
