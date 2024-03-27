package org.firstinspires.ftc.teamcode.util;

/**
 * Pose represents robot's position (x,y) and orientation (theta) on the field. It is
 * immutable -- once a Pose object is created, it cannot be changed.
 */
public class Pose {
    private final double x;
    private final double y;
    private final double theta;

    /**
     * Constructor
     * @param xInches   X position in inches
     * @param yInches   Y position in inches
     * @param headingRadians    Heading in radians
     */
    public Pose(double xInches, double yInches, double headingRadians){
        x = xInches;
        y = yInches;
        theta = headingRadians;
    }
}
