public class Ch3Max {
    public static void main(String[] args) {
        double[] data = {1.0,36.0,0.4,64.0,65.0,4.0,-61.0};
        double x = max(data);
        System.out.println("max ="+x);


    }
    static double max(double[] a) {
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
}

/*





*/