public class Ch3 {
    public static void main(String[] args) {
        double[] data = {1.0,36.0,0.4,64.0,65.0,4.0,-61.0};
    double x = min(data);
        System.out.println("min ="+x);


    }
    static double min(double[] a) {
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
/*//stream function
for(double x:a){
    min=Math.min(min,x);
        }
return 0;

 */