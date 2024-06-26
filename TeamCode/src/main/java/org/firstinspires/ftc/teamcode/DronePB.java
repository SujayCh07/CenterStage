package org.firstinspires.ftc.teamcode;

//import the necessary packages for instantiating Motor/Hardware Map
import com.qualcomm.robotcore.hardware.Servo;

public class DronePB {
    private boolean launched; // attribute of if the airplane has been launched
    private double angleUnlock; //power for unlocking slider
    Servo SRV_DL;

    PusherBot bot;

    // instantiation of the class
    public DronePB(PusherBot iBot) {
        // Take the passed in value of telemetry and assign to class variables.
        bot = iBot;

        launched = false;
        angleUnlock = .50;
        SRV_DL = bot.hardwareMap.servo.get("drone_srv"); //create intake motor object
        SRV_DL.setDirection(Servo.Direction.REVERSE); // Set servo of left gripper to run the opposite direction.

    }

    public void launchDrone() {
        SRV_DL.setPosition(angleUnlock);
        launched = true;
    }
}