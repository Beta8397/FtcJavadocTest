package org.firstinspires.ftc.teamcode.fakestuff;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * A test opmode for FakeBot and FakeBotAutonomous. Robot starts at the origin, with a
 * heading of 0. It drives forward 24 inches along the x axis, strafes leftward 24 inches
 * along in the +y direction, turns 90 degrees counter-clockwise, then strafes leftward
 * 24 inches in the minus-x direction.
 */
public class TestFakeAutonomous extends LinearOpMode {

    // The FakeBot object
    private FakeBot bot = new FakeBot();

    /**
     * The starting point for the opmode.
     */
    public void runOpMode(){
        // Initialize the bot
        bot.init(hardwareMap);

        // Get a FakeBotAutonomous object
        FakeBotAutonomous fakeBotAuto = new FakeBotAutonomous(bot, this);

        // Set bot's pose at (0,0,0)
        bot.setPose(0,0,0);

        waitForStart();

        // Drive straight 24 inches along X axis
        fakeBotAuto.driveToPoint(24, 0, 20, 0, 1);

        // Strafe left 24 inches, in the +Y direction
        fakeBotAuto.driveToPoint(24, 24, 20, 0, 1);

        // Turn 90 degrees (to a heading of 90 degrees)
        fakeBotAuto.turnToHeading(90, 30, 2);

        // Strafe left 24 inches in the minus-X direction
        fakeBotAuto.driveToPoint(0, 24, 20, 90, 1);
    }
}
