package frc.robot.Lab;

import frc.robot.Scratchbot.Scratchbot;



public class Lab 
{
    public static void runLab()
        {
        Scratchbot.sb_setRobotMovement(
        () -> Scratchbot.sb_getControllerLeftX(),
        () -> Scratchbot.sb_getControllerLeftY()
        );






        }
    
}