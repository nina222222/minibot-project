public class DriveCalculator {

    /**This first method is for the ticks in the revolutions
     * @param this is where the sensor counts, and 2048 is a full rotation
     * @return this is how to get the ticks to revolution by dividng the ticks by tickes per revoltuion
     */
    public static double ticksToRevolutions( int ticks, int ticksPerRev){
        return (double) ticks / ticksPerRev ;
    }

    /**This method is the revolutions with the wheels
     *@param is the revolutions found by the wheel diameter
     *@return is how they find the revoltuion and convert it to inches 
     */
    public static double revolutionsToInches ( double revolutions, double wheelDiameterInches){
        return Math.PI * wheelDiameterInches /12.0 *revolutions / 60.0;

    }

    /**This method connects the motor to the gears
     * @param is the motor and gear ratio which is needed to do motor to wheel
     * @return is where we divide the motor rpm by the gear ratio to get the motor to wheel
     */
    public static double motorRPMtoWheelRPM( double motorRPM, double gearRatio){
        return motorRPM / gearRatio;
    }

    /**This is where we will go through the speeds and make sure that they arent to large or small
     * @param is the original speeds and then the max speed which we will use in a loop later
     * @return is where we i made a variable for the values put through the loop, 
     * then i put the loop to go through the raw speeds
     */
    public static double[] processModuleSpeeds( double[] rawSpeeds, double maxSpeed){
        double newSpeeds = new double[rawSpeed.length];
        // for the new values that we put through the loop 
        for(int i=0; i < rawSpeed.length; i++){
        
        if (rawSpeed.length[i] > maxSpeed){
            newSpeeds[i] = maxSpeed ;// if past max speed
        } else if (rawSpeed.length[i] < -maxSpeed){
            newSpeeds[i] = -maxSpeed ;// if lower than minimum speed
        } else{
            newSpeeds[i] = -maxSpeed;// if already in safe place

        }
    }
}
    public static void main(String[] args) {
        double ticksPerRev = 2048;
        double wheelDiameterInches = 4;
        double gearRatio = 8.46;

        double motorRev= ticksToRevolutions( ticks, ticksPerRev);
        double wheelRev= motorRPMtoWheelRPM( motorRPM, geaRatio);
        double distance= revolutionsToInches (revolutions, wheelDiameterInches);

        System.out.println("Motor Revolutions: " + motorRev);
        System.out.println("Wheel Revolutions: " + wheelRev);
        System.out.println("Distance: " +distance);

    }
}