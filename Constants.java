
/** 
 * creation of mini robot
*/
public final class Constants {
    public static final class DriveK{
        //  CAN IDs are here
        public static final int kFrontLeftID = 1;
        public static final int kFrontRightID = 2;
        public static final int kBackLeftID = 3;
        public static final int kBackRightID = 4;
        //here are the mps and gear ratio
        public static final double kMaxSpeed_mps = 4.5;
        //k for double and mps for miles per hour
        public static final double kGearRatio = 8.14;
        //the ratio is in decimals so double 

    }
    public static final class ShooterK{
        //CAN Ids here
        public static final int kTopFLywheelId = 10;
        public static final int kBottomFlywheelID = 11;
        public static final double kMaxRPS = 95.0;
        public static final double kAtSpeedThresholdRPS = 3.0;
    }
}