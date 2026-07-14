public class SensorProcessor{
    public static double[]processSensorReadings (double[]rawReadings){
        for ( int i=0 ; i <= processSensorRe.length ; i++){
            if (rawReadings[i]< 0.0){
                rawReadings[i] = 0.0;
            }
            if (rawReadings[i]>= 120.0){
                System.out.println("Max Sensor: " × i);
            }
        return rawReadings;
    }
public static double findAverage (double[]readings){
    double sum = 0;
    for (double reading : readings ){
    sum += reading;
    }
    double average = sum / readings.length;
    return average;
}
public static double findMax (double[]readings){
    public( int i = 0 ; i<= readings.length ; i++){
        System.out.println("Max: " + i);
    }
    public static void main(String[] args){
    double[] raw= {-2.0, 14.5, 150.0, 12.1, 0.5, 88.3};
    double[] cleaned= processSensorReadings(raw);
    double average= findAverage(cleanded);
    double max= findMax(cleaned);
    System.out.println(average);
    System.out.println(max);
    }
}
    