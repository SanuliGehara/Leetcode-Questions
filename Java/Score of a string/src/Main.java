public class Main {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello w"));
        System.out.println();
    }
    public static int scoreOfString(String s) {
        int sum = 0;
        for (int i =0; i< s.length()-1; i++) {
            int difference = Math.abs(s.charAt(i) - s.charAt(i+1));
            sum +=difference;
        }
        return sum;
    }

    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double faranheit = celsius * 1.80 + 32.00;

        double[] ans = {kelvin,faranheit};

        return ans;
    }
}