package JAVA;
import java.awt.Robot;
import java.util.Random;
import java.util.Scanner;
import java.sql.Time;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.*;
import JAVA.autogui;
import java.lang.Thread;

// RUTHVIK VENKATESAN AND VIHAS VEGGALAM 2024; LIFELIKE HUMAN TYPING

/* 
 * 
 * 
 * This simulator is intended for solely educational purposes. It was designed
 * with the intent of simulating human-like typing to design an exploit for 
 * biometric checking against computer inputs. 
 * 
 * For example, if users copy and paste things into Google Docs, extensions 
 * exist which catch the quick copy and pastes and flag them to alert educators
 * about teaching. 
 * 
 * However, in order to showcase a vulnerablity in this system, we designed an 
 * exploit which takes advantage of the Java Robot class to emulate human-like
 * typing and keyboard input. 
 * 
 * The Random class is used to generate Random, humanlike errors in the typing
 * and user input process. 
 * 
 * The Scanner class is used for CLI application testing. This will be deprecated
 * once a GUI is developed. 
 * 
 * 
 * PROTECTED BY GNU PUBLIC LICENSE. 
 * 
 */


public class main {
     
    public static void main(String[] args) {

        Thread.sleep(5000);
        autogui x = new autogui(); 
        x.typewrite('h');
        x.typewrite('e');
        x.typewrite('l');
        x.typewrite('o'); 


        

        

    }
        

}

/* robot.keyPress(KeyEvent.VK_H);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_L);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_L);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_O);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_SPACE);

    */