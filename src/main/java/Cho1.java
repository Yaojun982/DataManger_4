
import java.util.Arrays;

public class Cho1 {
    public static void main(String[] args) {
        //int[] a={1,2,3};
        //int[] b={1,2,3};//not same (a,b)data
        int[] a={1,2,3};
        int[] b=a;  //con one different
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("a==b :"+(a==b));//object not use(==)
        System.out.println("equal :" +a.equals(b));//trick
        System.out.println("Arrays :"+ Arrays.equals(a,b));//

    }
}
