

public class Main {

    public static void main(String[] args) {

        double[] robotTestLocation = {1, 1, 0};
        SuperShot heWasAShooterBoy = new SuperShot();

        heWasAShooterBoy.setShooterSpeed(12.0);
        heWasAShooterBoy.update(robotTestLocation, false);
        
        System.out.println("Theta: " + heWasAShooterBoy.getTheta() + " Phi: " + heWasAShooterBoy.getPhi());
        
    }

}