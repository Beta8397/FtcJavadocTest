package org.firstinspires.ftc.teamcode.fakestuff;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * FakeBotAutonomous contains utility methods for operating a FakeBot
 * autonomously, within a linear opmode.
 */
public class FakeBotAutonomous {

    /**
     * Constructor. This should be called from the runOpMode method of a linear opmode,
     * and should be passed an initialized FakeBot object, and the opmode itself.
     * @param fakeBot   The FakeBot object
     * @param linearOpMode  The LinearOpMode using this FakeBotAutonomous object.
     */
    public FakeBotAutonomous(FakeBot fakeBot, LinearOpMode linearOpMode){
        // Constructor code goes here.
    }

    /**
     * Drive a linear path from the current position to the specified point.
     *
     * @param targetX   X of target position
     * @param targetY   Y of target position
     * @param speed     Drive speed, inches/sec
     * @param orientationDegrees    Desired orientation (heading of robot, degrees
     * @param tolerance     Target position tolerance, inches
     */
    public void driveToPoint(double targetX, double targetY, double speed, double orientationDegrees,
                        double tolerance){
        // Code here to make the robot drive a linear path from its current position to the
        // specified point.
    }

    /**
     * Turn robot to the specified heading in degrees
     *
     * @param targetHeadingDegrees  Target heading in degrees
     * @param maxTurnSpeed  Maximum turn speed, degrees/sec
     * @param toleranceDegrees  Target tolerance, degrees
     */
    public void turnToHeading(double targetHeadingDegrees, double maxTurnSpeed,
                              double toleranceDegrees){
        // Code here to make the robot turn to the specified heading.
    }
}
