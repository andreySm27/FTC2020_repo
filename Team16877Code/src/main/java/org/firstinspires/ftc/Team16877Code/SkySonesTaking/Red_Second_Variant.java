package org.firstinspires.ftc.Team16877Code.SkySonesTaking;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.Team16877Code.AutonautsAPI;

import static java.lang.Math.abs;

//import com.qualcomm.robotcore.eventloop.opmode.Disabled;

@Autonomous(name="RXYX")
public class Red_Second_Variant extends AutonautsAPI {
    @Override
    public void runOpMode() {
        INIT();
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitStart();
        liftServo(false);
        runLeft(0.67, 0.5);
        runForward(0.9, 0.5);
        liftServo(true);
        sleep(200);
        runBack(0.8, 0.5);
        runRight(1.17, 0.5);
        liftServo(false);
        sleep(200);
        runBack(0.10, 0.5);
        runLeft(0.3, 0.5);
    }
}
