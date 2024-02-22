package JAVA;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.*;

// RUTHVIK VENKATESAN 2024. @Cylinders

/* 
 * 
 * This class is intended to be an emulation of the python pyautogui module in Java. 
 * 
 * It is intended to make input emulation a much easier process in Java. 
 * 
 * It is intended to make the Robot Class easier to use. 
 * 
 * PROTECTED BY GNU PUBLIC LICENSE. 
 * 
 * 
 * 
 */





public class autogui {

    static Robot gui; 

    public autogui() throws AWTException { 
        gui = new Robot(); 
    }

    public boolean typewrite(char x){ 

        try {

            

            return true; 
        }

        catch(Exception e) {
            return false; 
        }


    }
}
