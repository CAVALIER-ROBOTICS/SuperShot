public class SuperShot {

    private double[] robot, target;
    private double shooterSpeed, theta, phi;

    private double[] speakerBlue = {(14)*0.0254, (218.42)*0.0254, (78 + 14 * Math.tan(Math.toRadians(14)))*0.0254};
    private double[] speakerRed = {(651.25 - 14)*0.0254, (218.42)*0.0254, (78 + 14 * Math.tan(Math.toRadians(14)))*0.0254};
    private double gravity = 9.8;

    public SuperShot() {
        this.robot = new double[3];
        this.target = new double[3];
        this.shooterSpeed = 0.0;
    }

    // Get Methods

    public double[] getRobot() {
        return this.robot;
    }

    public double[] getTarget() {
        return this.target;
    }

    public double getShooterVelocity() {
        return this.shooterSpeed;
    }

    public double getTheta() {
        return this.theta;
    }

    public double getPhi() {
        return this.phi;
    }

    // Set Methods

    public void setRobot(double[] robot) {
        this.robot = robot;
    }

    public void setTarget(double[] target) {
        this.target = target;
    }

    public void setShooterSpeed(double shooterSpeed) {
        this.shooterSpeed = shooterSpeed;
    }

    public void update(double[] robot, boolean isRedSide) {
        setRobot(robot);
        if (isRedSide) {
            setTarget(speakerRed);
        }
        else {
            setTarget(speakerBlue);
        }
        updateAngles();
    }

    private void updateAngles() {
        double g = gravity;
        double s = shooterSpeed;
        double d = getHypotFromArray(subtractArrays(target, robot));
        double h = target[2];
        this.theta = Math.toDegrees(getAngleFromArray(subtractArrays(target, robot)));
        this.phi = Math.toDegrees(Math.atan((s*s - Math.sqrt(s*s*s*s - g*(g*d*d + 2*h*s*s))) / (g * d)));
    }

    private double[] subtractArrays(double[] array1, double[] array2) {
        double[] result = {array1[0] - array2[0], array1[1] - array2[1], array1[2] - array2[2]};
        return result;
    }

    private double getHypotFromArray(double[] array) {
        return Math.hypot(array[0], array[1]);
    }

    private double getAngleFromArray(double[] array) {
        return Math.atan2(array[1], array[0]);
    }

}