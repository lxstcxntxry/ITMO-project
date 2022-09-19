public class lab1 {
    public static float Rand(float min, float max){
        float x = (float) ((Math.random() * (Math.abs(min) + Math.abs(max + 1))) - Math.abs(min));
        if (x > 10.0){
            x = 10.0f;
        }
        return x;
    }
    public static void EmptyLine(){
        System.out.println();
    }

    public static void main(String[] arg) {
        //заполняем массив H, нечетными числами от 7 до 17 по порядку
        int minH = 7;
        int[] h = new int[6];
        for (int i = 0; i < h.length ; i++){
            h[i] = minH;
            minH += 2;
        }
        //заполняем массив Х, случайными числами от -8 до 10
        float minX = (float)-8.0;
        float maxX = (float)10.0;
        float[] x = new float[17];
        for (int i = 0; i < x.length; i++){
            float rand = Rand(minX, maxX);
            x[i] = rand;
        }
        //заполняем двумерный массив C 6х17, по формулам
        double[][] c = new double[6][17];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 17; j++) {

                if (h[i] == 13) {
                    c[i][j] = Math.pow(Math.pow((Math.asin((x[j]+1)/18)), (Math.pow(0.75 - Math.atan((x[j]+1)/18)/((x[j]-1)/0.5), 3))), ((1 - Math.pow((Math.pow((x[j]*(x[j]-0.5)), 3)*(1-Math.tan(x[j]))), 2)/3)));
                } else if (h[i] == 7 || h[i] == 11 || h[i] == 15) {
                    c[i][j] = (Math.tan(Math.cbrt(x[j]))-1)/3/4;
                } else {
                    c[i][j] = Math.log10(Math.pow(Math.cos(Math.pow((Math.tan(x[j])/2/3),3)),2))/0.25;
                }

                System.out.printf("%10.3f",c[i][j]);
            }
            EmptyLine();
        }
    }
}
