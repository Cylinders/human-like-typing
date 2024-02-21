import java.awt.Robot;
import java.util.Random;
import java.util.Scanner;
import java.sql.Time;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.*;

// RUTHVIK VENKATESAN AND VIHAS VEGGALAM : 2024; LIFELIKE HUMAN TYPING

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
 * TODO: @DatLightning : Develop a Java GUI to deprecate CLI application. 
 * 
 * 
 */


public class main {
    
    static Robot gui;
    
    gui = new Robot(); 
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); 


        System.out.println("CLI Application - Human typing simulator. "); 

        System.out.println("Enter the number 1 if testing the application. Else, hit enter"); 

        boolean testRun = false; 

        try {

            if(input.nextInt() == 1) {

                testRun = true;
                System.out.println("Initiating a testrun."); 

            }        

        }
        
        catch(Exception e){

            System.out.println("Starting the application."); 

        }

        

        

        

    }
        
    boolean typewrite(char x){
        try { 
    switch(x) {
        case 'a':
            gui.keyPress(KeyEvent.VK_A);
            break; 
        case 'A':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_A);
            break;
        case 'b':
            gui.keyPress(KeyEvent.VK_B);
            break; 
        case 'B':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_B);
            break;
        case 'c':
            gui.keyPress(KeyEvent.VK_C);
            break; 
        case 'C':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_C);
            break;
        case 'd':
            gui.keyPress(KeyEvent.VK_D);
            break; 
        case 'D':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_D);
            break;
        case 'e':
            gui.keyPress(KeyEvent.VK_E);
            break; 
        case 'E':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_E);
            break;
        case 'f':
            gui.keyPress(KeyEvent.VK_F);
            break; 
        case 'F':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_F);
            break;
        case 'g':
            gui.keyPress(KeyEvent.VK_G);
            break; 
        case 'G':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_G);
            break;
        case 'h':
            gui.keyPress(KeyEvent.VK_H);
            break; 
        case 'H':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_H);
            break;
        case 'i':
            gui.keyPress(KeyEvent.VK_I);
            break; 
        case 'I':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_I);
            break;
        case 'j':
            gui.keyPress(KeyEvent.VK_J);
            break; 
        case 'J':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_J);
            break;
        case 'k':
            gui.keyPress(KeyEvent.VK_K);
            break; 
        case 'K':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_K);
            break;
        case 'l':
            gui.keyPress(KeyEvent.VK_L);
            break; 
        case 'L':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_L);
            break;
        case 'm':
            gui.keyPress(KeyEvent.VK_M);
            break; 
        case 'M':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_M);
            break;
        case 'n':
            gui.keyPress(KeyEvent.VK_N);
            break; 
        case 'N':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_N);
            break;
        case 'o':
            gui.keyPress(KeyEvent.VK_O);
            break; 
        case 'O':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_O);
            break;
        case 'p':
            gui.keyPress(KeyEvent.VK_P);
            break; 
        case 'P':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_P);
            break;
        case 'q':
            gui.keyPress(KeyEvent.VK_Q);
            break; 
        case 'Q':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_Q);
            break;
        case 'r':
            gui.keyPress(KeyEvent.VK_R);
            break; 
        case 'R':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_R);
            break;
        case 's':
            gui.keyPress(KeyEvent.VK_S);
            break; 
        case 'S':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_S);
            break;
        case 't':
            gui.keyPress(KeyEvent.VK_T);
            break; 
        case 'T':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_T);
            break;
        case 'u':
            gui.keyPress(KeyEvent.VK_U);
            break; 
        case 'U':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_U);
            break;
        case 'v':
            gui.keyPress(KeyEvent.VK_V);
            break; 
        case 'V':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_V);
            break;
        case 'w':
            gui.keyPress(KeyEvent.VK_W);
            break; 
        case 'W':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_W);
            break;
        case 'x':
            gui.keyPress(KeyEvent.VK_X);
            break; 
        case 'X':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_X);
            break;
        case 'y':
            gui.keyPress(KeyEvent.VK_Y);
            break; 
        case 'Y':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_Y);
            break;
        case 'z':
            gui.keyPress(KeyEvent.VK_Z);
            break; 
        case 'Z':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_Z);
            break;
        case '0':
            gui.keyPress(KeyEvent.VK_0);
            break;
        case '1':
            gui.keyPress(KeyEvent.VK_1);
            break;
        case '2':
            gui.keyPress(KeyEvent.VK_2);
            break;
        case '3':
            gui.keyPress(KeyEvent.VK_3);
            break;
        case '4':
            gui.keyPress(KeyEvent.VK_4);
            break;
        case '5':
            gui.keyPress(KeyEvent.VK_5);
            break;
        case '6':
            gui.keyPress(KeyEvent.VK_6);
            break;
        case '7':
            gui.keyPress(KeyEvent.VK_7);
            break;
        case '8':
            gui.keyPress(KeyEvent.VK_8);
            break;
        case '9':
            gui.keyPress(KeyEvent.VK_9);
            break;
        case '!':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_1); // Exclamation mark
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        case '@':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_2); // At symbol
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        case '#':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_3); // Pound symbol
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        case '$':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_4); // Dollar symbol
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        case '%':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_5); // Percent symbol
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        case '^':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_6); // Caret symbol
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        case '&':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_7); // Ampersand symbol
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        case '*':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_8); // Asterisk symbol
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        case '(':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_9); // Left parenthesis
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        case ')':
            gui.keyPress(KeyEvent.VK_SHIFT);
            gui.keyPress(KeyEvent.VK_0); // Right parenthesis
            gui.keyRelease(KeyEvent.VK_SHIFT);
            break;
        }


            return true; 
        }

        catch(Exception e) {
            return false; 
        }
        


        // This is just for potential boolean logic in future. Exceptions throw a false.
        return true;
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