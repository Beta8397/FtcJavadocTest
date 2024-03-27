package org.firstinspires.ftc.teamcode.fakestuff;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.util.Pose;

/**
 *  Fake robot class for an omnidirectional (e.g., mecanum or omniwheel) robot with
 *  the ability to drive in any direction while simultaneously turning, and to
 *  keep track of its position using odometry.
 */
public class FakeBot {

    private Pose pose = new Pose(0,0,0);

    /**
     * Initialization method. After creating a FakeBot object with the constructor,
     * the opmode must call init, passing in the hardwaremap, before using the FakeBot
     * object.
     *
     * @param hwMap     HardwareMap to be passed in by the opmode.
     */
    public void init(HardwareMap hwMap){
        // Initialize hardware here
    }

    /**
     * Sets the robot's position and orientation on the field. That is, tells the software
     * where the robot is currently located on the field. This would typically called at the
     * beginning of an opmode, or at some point when we have new, good information (e.g., from
     * a sensor) regarding location.
     *
     * @param xInches   X in inches
     * @param yInches   Y in inches
     * @param headingDegrees    Heading in degrees
     */
    public void setPose(double xInches, double yInches, double headingDegrees){
        // Put code here to set robot pose on the field.
    }

    /**
     * Do one iteration of the odometry algorithm to update the robot's pose on the field.
     * After calling this method, the getPose method can be called to obtain the newly
     * updated pose information.
     */
    public void updateOdometry(){
        // Put odometry code here.
    }

    /**
     * Obtain the current estimate of robot pose on the field.
     *
     * @return  Estimate of robot pose.
     */
    public Pose getPose(){
        return pose;
    }

    /**
     * Set robot drive powers (each from -1 to +1) by providing strafe (px), forward (py),
     * and Turn (pTurn) components.
     *
     * @param px    Rightward (+) or Leftward (-) component of drive power
     * @param py    Forward (+) or Reverse (-) component of drive power
     * @param pTurn     CCW (+) or CW (-) Turning component of drive power
     */
    public void setPower(double px, double py, double pTurn){
        // Code here to set robot drive powers
    }

    /**
     * Set robot drive speeds by providing strafe speed (vx, in inches/sec),
     * forward speed (py, in inches/sec), and turning speed (vTurn, radians/sec).
     *
     * @param vx    Strafe speed, inches/sec
     * @param vy    Forward speed, inches/sec
     * @param vTurn Turn speed, inches/sec
     */
    public void setDriveSpeed(double vx, double vy, double vTurn){

    }


}
