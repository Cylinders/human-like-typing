import java.util.HashMap;

public class Test {

    private int steps;
    private double max_value = 0;
    private double min_value = 0;
    private HashMap<Double, Double> map;

    public Test(int steps, double max, double min){
        this.steps = steps;

        map = new HashMap<>();

     
        max_value = max;
        min_value = min;

        map.put(1.0,1.0);
        map.put(2.0,2.0);
        map.put(3.0,3.0);
        map.put(4.0,4.0);
        map.put(5.0,5.0);
        map.put(6.0,6.0);
        map.put(7.0,7.0);
    }
    public double getApproximation(double value){
        double low_value = steps * (int) Math.floor(value/steps);
        double high_value = steps * (int) Math.ceil(value/steps);
        if(!map.containsKey(low_value)){
            return min_value;
        }
        if(!map.containsKey(high_value)){
            return max_value;
        }
        double slope = (map.get(high_value) - map.get(low_value) )/(steps);
        double y = slope * (value - low_value) + map.get(low_value);
        return y;
    }
    public static  void main(String[] args){
        // Test e = new Test(1, 100, -100);
        // System.out.println(e.getApproximation(2000));
        // System.out.println(e.getApproximation(2));
        // System.out.println(e.getApproximation(4.3));
        // System.out.println(e.getApproximation(4.435435434));
        int count = 0;
        double rand = Math.random();
        while (rand > 0){
            count ++;
            rand = Math.random();

        }
        System.out.println(count);

    }
}
