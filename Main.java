

public class Main {

    public static void main(String[] args) {

        double[] robotTestLocation = {1, 1, 0};
        SuperShot superShot = new SuperShot();

        superShot.setShooterSpeed(12.0);
        superShot.update(robotTestLocation, false);
        
        System.out.println("Theta: " + superShot.getTheta() + " Phi: " + superShot.getPhi());
        
    }

}
