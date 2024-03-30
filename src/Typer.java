import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;

public class Typer {
    static Robot robot;
    static KeyInformation keyInformation;

    public static void main(String[] args) throws IOException,
            AWTException, InterruptedException {
    
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Create an instance of Robot class
        robot = new Robot();
        String sentence = "As an AI language model, I don't have personal opinions or thoughts";
        type_sentence(sentence, 120, 92);
    }
    public Typer() {
        try{
        robot = new Robot();
        keyInformation = new KeyInformation();

        }
        catch(AWTException exception){
            System.out.println(exception.toString());
        }
    }

    public static void type_sentence(String sentence, int wpm, int accuracy) throws InterruptedException {
        int delay_ms = (int) (1 / ((4.2 * wpm) / 30.0) * 1000);
        delay_ms = Math.max(0, delay_ms);
        String[] words = sentence.split(" ");

        for (String word : words) {

            boolean stuck = getStuck(word, accuracy);
            boolean result = type(word, stuck, delay_ms, (int) (Math.random() * 5) + 1, accuracy);
            while(!result){
                ctrl_backspace();
                result = type(word, stuck, delay_ms, (int) (Math.random() * 5) + 1, accuracy);
            }
            type(" ", false, (int) (delay_ms * 1.5), 1, 101);
        }
        reset_monkey_type();
       
    }
    public static void reset_monkey_type(){
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_SHIFT);
    }
    public static void ctrl_backspace(){
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
    
    public static int randomize_delay(int delay) {
        return Math.max(0, delay + (int) (Math.random() * 100) - 50);
    }

    public static boolean type(String word, boolean stuck, int delay, int tries, int accuracy)
            throws InterruptedException {
        boolean success = Math.random() > .20;
        double deletion = success ? -0.1 : 0.6;
        
        int stopping_point = (int) (Math.random() * word.length());

        for (int i = 0; i < word.length(); i++) {
                if (i != stopping_point || !stuck) {

                    if (Math.random() > accuracy / 100.0) {
                        type_char(get_error_key(word.substring(i, i + 1)));
                        Thread.sleep(randomize_delay(delay));
                        if(Math.random() > deletion){
                            type_char("del");
                            Thread.sleep(randomize_delay(delay * 2));
                        }

                    }
                    type_char(word.substring(i, i + 1));
                    Thread.sleep(delay);
                } else if (i == stopping_point) {
                    for (int j = 0; j < tries; j++) {
                        type_char(get_error_key(word.substring(i, i + 1)));
                        Thread.sleep(randomize_delay(delay));
                    }
                    for (int j = 0; j < tries; j++) {
                        if(Math.random() > deletion){
                            type_char("del");
                            Thread.sleep(randomize_delay(delay * 2));
                        }
                    } 
                    type_char(word.substring(i, i + 1));
                    Thread.sleep(randomize_delay(delay));
                }
                
        }
        return success;
    }

    public static String get_error_key(String correct_key) {
        String[] options = KeyInformation.getKey(correct_key);
        if (options.length == 0) {
            return correct_key;
        }
        int index = (int) (Math.random() * options.length);
        return options[index];

    }
    public static boolean getStuck(String word, int accuracy) {
        if (word.length() < 6) {
            return false;
        }
        if (accuracy >= 100){
            return false;
        }
        return (int) (100 * Math.random() - (100 * accuracy)/300) > 50;

    }
    public static void type_char(String character) {
        if (character.equals("del")) {
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            return;
        }
        assert character.length() == 1 : ("Character (" + character + ") was too long.");
        boolean uppercase = false;

        try {
            int test = Integer.parseInt(character);
            robot.keyPress(48 + test);
            return;

        } catch (NumberFormatException e) {
            char c = character.charAt(0);

            uppercase = character.toUpperCase().equals(character) && Character.isLetter(c);
        }

        if (uppercase) {
            robot.keyPress(KeyEvent.VK_SHIFT);
        }
        character = character.toLowerCase();
        switch (character) {
            case ".":
                robot.keyPress(KeyEvent.VK_PERIOD);
                break;
            case "/": 
                robot.keyPress(KeyEvent.VK_SLASH); 
                break;
            case "\\": 
                robot.keyPress(KeyEvent.VK_BACK_SLASH); 
                break;
            case "<": 
                robot.keyPress(KeyEvent.VK_LESS); 
                break;
            case ">": 
                robot.keyPress(KeyEvent.VK_GREATER); 
                break;
            case ",": 
                robot.keyPress(KeyEvent.VK_COMMA); 
                break;
            case "?": 
                robot.keyPress(KeyEvent.VK_SHIFT); 
                robot.keyPress(KeyEvent.VK_SLASH); 
                robot.keyRelease(KeyEvent.VK_SHIFT); 
                break;
            case "[": 
                robot.keyPress(KeyEvent.VK_OPEN_BRACKET); 
                break;
            case "]": 
                robot.keyPress(KeyEvent.VK_CLOSE_BRACKET); 
                break;
            case "{": 
                robot.keyPress(KeyEvent.VK_BRACELEFT); 
                break;
            case "}": 
                robot.keyPress(KeyEvent.VK_BRACERIGHT); 
                break;
            case "|": 
                robot.keyPress(KeyEvent.VK_SHIFT); 
                robot.keyPress(KeyEvent.VK_BACK_SLASH); 
                robot.keyRelease(KeyEvent.VK_SHIFT); 
                break;
            case ":": 
                robot.keyPress(KeyEvent.VK_COLON); 
                break;
            case ";": 
                robot.keyPress(KeyEvent.VK_SEMICOLON); 
                break;
            case "'": 
                robot.keyPress(KeyEvent.VK_QUOTE); 
                break;
            case "\"": 
                robot.keyPress(KeyEvent.VK_QUOTEDBL); 
                break;
            case "+": 
                robot.keyPress(KeyEvent.VK_PLUS); 
                break;
            case "=": 
                robot.keyPress(KeyEvent.VK_EQUALS); 
                break;
            case "-": 
                robot.keyPress(KeyEvent.VK_MINUS); 
                break;
            case "_": 
                robot.keyPress(KeyEvent.VK_UNDERSCORE); 
                break;
            case "(": 
                robot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS); 
                break;
            case ")": 
                robot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS); 
                break;
            case "*": 
                robot.keyPress(KeyEvent.VK_ASTERISK); 
                break;
            case "&": 
                robot.keyPress(KeyEvent.VK_AMPERSAND); 
                break;
            case "^": 
                robot.keyPress(KeyEvent.VK_CIRCUMFLEX); 
                break;
            case "%": 
                robot.keyPress(KeyEvent.VK_SHIFT); 
                robot.keyPress(KeyEvent.VK_5); 
                robot.keyRelease(KeyEvent.VK_SHIFT); 
                break;
            case "$": 
                robot.keyPress(KeyEvent.VK_DOLLAR); 
                break;
            case "#": 
                robot.keyPress(KeyEvent.VK_NUMBER_SIGN); 
                break;
            case "@": 
                robot.keyPress(KeyEvent.VK_AT); 
                break;
            case "!": 
                robot.keyPress(KeyEvent.VK_EXCLAMATION_MARK); 
                break; 
            case " ":
                robot.keyPress(KeyEvent.VK_SPACE);
                break;
            case "a":
                robot.keyPress(KeyEvent.VK_A);
                break;
            case "b":
                robot.keyPress(KeyEvent.VK_B);
                break;
            case "c":
                robot.keyPress(KeyEvent.VK_C);
                break;
            case "d":
                robot.keyPress(KeyEvent.VK_D);
                break;
            case "e":
                robot.keyPress(KeyEvent.VK_E);
                break;
            case "f":
                robot.keyPress(KeyEvent.VK_F);
                break;
            case "g":
                robot.keyPress(KeyEvent.VK_G);
                break;
            case "h":
                robot.keyPress(KeyEvent.VK_H);
                break;
            case "i":
                robot.keyPress(KeyEvent.VK_I);
                break;
            case "j":
                robot.keyPress(KeyEvent.VK_J);
                break;
            case "k":
                robot.keyPress(KeyEvent.VK_K);
                break;
            case "l":
                robot.keyPress(KeyEvent.VK_L);
                break;
            case "m":
                robot.keyPress(KeyEvent.VK_M);
                break;
            case "n":
                robot.keyPress(KeyEvent.VK_N);
                break;
            case "o":
                robot.keyPress(KeyEvent.VK_O);
                break;
            case "p":
                robot.keyPress(KeyEvent.VK_P);
                break;
            case "q":
                robot.keyPress(KeyEvent.VK_Q);
                break;
            case "r":
                robot.keyPress(KeyEvent.VK_R);
                break;
            case "s":
                robot.keyPress(KeyEvent.VK_S);
                break;
            case "t":
                robot.keyPress(KeyEvent.VK_T);
                break;
            case "u":
                robot.keyPress(KeyEvent.VK_U);
                break;
            case "v":
                robot.keyPress(KeyEvent.VK_V);
                break;
            case "w":
                robot.keyPress(KeyEvent.VK_W);
                break;
            case "x":
                robot.keyPress(KeyEvent.VK_X);
                break;
            case "y":
                robot.keyPress(KeyEvent.VK_Y);
                break;
            case "z":
                robot.keyPress(KeyEvent.VK_Z);
                break;
            case "0":
                robot.keyPress(48);
                break;
            case "\"":
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_QUOTE);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                break;
            case "'":
                robot.keyPress(KeyEvent.VK_QUOTE);
                break;
            case ",":
                robot.keyPress(KeyEvent.VK_COMMA);
                break;
            default:
                unknown();

        }
        if (uppercase) {
            robot.keyRelease(KeyEvent.VK_SHIFT);
        }
    }
    public static void unknown(){
        robot.keyPress( KeyEvent.VK_ALT );


        robot.keyPress( KeyEvent.VK_NUMPAD2 );
        robot.keyRelease( KeyEvent.VK_NUMPAD2 );
        robot.keyPress( KeyEvent.VK_NUMPAD5 );
        robot.keyRelease( KeyEvent.VK_NUMPAD5 );
        robot.keyPress( KeyEvent.VK_NUMPAD5 );
        robot.keyRelease( KeyEvent.VK_NUMPAD5 );
        robot.keyPress( KeyEvent.VK_NUMPAD8 );
        robot.keyRelease( KeyEvent.VK_NUMPAD8 );
    
        robot.keyRelease( KeyEvent.VK_ALT );
    }
}