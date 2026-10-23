package frc.robot.Lab;

import frc.robot.Scratchbot.Scratchbot;



public class Lab 
{
    public static void Lab()
        {
            //random number gen
            int x = (int)(Math.random() * 3);


           //code 
            boolean TurnClockwise = false;

            //if code

            if (TurnClockwise = true)
                {
                    Scratchbot.sb_turnClockwise(x);
                    System.out.println("the bot has turned " + x +"radians");

                }

            if (TurnClockwise = false)
                {
                    Scratchbot.sb_turnCounterClockwise(x);
                    System.out.println("the bot has turned " + x + "radians");
                    
                }




        }

}