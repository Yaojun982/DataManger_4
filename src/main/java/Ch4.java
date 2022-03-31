import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ch4 {
    public static void main(String[] args) {
        double[] data={8,0.5,-21,87,23,-57};
/////////Arrary size can`t change
/////////
        List<Double>a=new ArrayList<>();
        for (double x:data){
            a.add(x);
        }
        System.out.println("data = "+data);
        System.out.println("min = "+ Collections.min(a));
        System.out.println("max = "+Collections.max(a));

    }
}
