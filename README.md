#SuperShot
To implement, simply add SuperShot to the same folder as your Robot or RobotContainer files, and create a new SuperShot object. (in this example we called it superShot)
After you create your superShot object call superShot.setShooterSpeed(double Speed) in m/s to set your shooter's exit velocity. 
And that's all, these equations do not account for your robots speed or acceleration it is meant to be used purely for stationary shooting.

To use we have the following functions
Call superShot.update(double[] robotPosition, boolean isRedAlliance) to update your robot position and angle based on double[] (x, y, z) and a boolean to set which shooter you wish to target.
Call superShot.getTheta() to return your needed robot rotation in degrees
Call superShot.getPhi() to return your needed shooter rotation in degrees
