import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ch6 {
    public static void main(String[] args) {
        List<Integer>a= Arrays.asList(4,6,9,7,3,5,10);
        System.out.println("Collections.sort()");
        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);
    }
}
/////bubble sort two compare bigger or small   test program;
