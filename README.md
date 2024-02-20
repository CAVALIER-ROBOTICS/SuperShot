# SuperShot
This is an example of 7492 base level shooting code for the 2024 FRC game Crescendo.

## Implementation
To setup simply add SuperShot to the same folder as your Robot or RobotContainer files, and create a new SuperShot object (in this example we called it superShot).
After you create your superShot object call superShot.setShooterSpeed(double Speed) in m/s to set your shooter's exit velocity.

### WARNING
These equations do not account for your robots current translational speed or acceleration, it is meant for purely *stationary* shooting.

## Usage
Call superShot.update(double[] robotPosition, boolean isRedAlliance) to update your robot position and angle based on double[x, y, z] and a boolean to set which speaker (red or blue) you wish to target.

Call superShot.getTheta() to return your needed robot rotation in degrees

Call superShot.getPhi() to return your needed shooter angle in degrees
