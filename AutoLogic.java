  public class AutoLogic {
  public static String decideAction(boolean hasGamePiece, double distanceInches ,boolean isEnabled){
    /**
     * firstly, we need to make sure that if the robot is not enabled, then it will return disabled so we know
     * next, if the robot doesnt have a game piece then we need to return intake that way we know to get one
     * and if we do have intake but are too far, then we need to say to drive closer
     * 
     */
    if (!isEnabled){
        return "DISABLED";

    }
    if (!hasGamePiece){
        return "INTAKE";
    }
    if (hasGamePiece && distanceInches > 24.0){
        return "DRIVE_CLOSER";
    }
    if (hasGamePiece && distanceInches <= 24.0){
        return "SHOOT";
    }
    return "GOOD";
  }
    
        public static void main (String[] args){
            System.out.println(decideAction(false,30.0, false));
            System.out.println(decideAction(true,10.0, false));
            System.out.println(decideAction(true, 25.0, true));
            System.out.println(decideAction(true,24.0,true));
        }
    
  }
 