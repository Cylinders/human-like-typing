import java.awt.event.*;
import java.awt.*;


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
 * exploit which takes advantage of the Python pyautogui module to emulate human-like
 * typing and keyboard input. 
 * 
 * 
 * PROTECTED BY GNU PUBLIC LICENSE. 
 * 
 */


public class App extends Frame implements ActionListener {
    Frame frame;
    Button button;
    TextField input_text, wpm, error;
    Label wpmLabel, errLabel;
    Typer typer;
    public App(){
        typer = new Typer();
        frame = new Frame("Typing");
    
        button = new Button("Type the text");
        input_text = new TextField("Enter your text here.");

        wpm = new TextField("130");
        wpmLabel = new Label("WPM: ");
        error = new TextField("92");
        errLabel = new Label("Accuracy (1-100): ");

        wpm.setBounds(275,75,100,20);
        wpmLabel.setBounds(275, 50, 100, 20);
        error.setBounds(275, 125, 100, 20);
        errLabel.setBounds(275, 100, 100,20);

        
        frame.add(wpm);
        frame.add(wpmLabel);
        frame.add(error);
        frame.add(errLabel);
        input_text.setBounds(50,50,200,200);

        frame.add(input_text);
        
        button.setBounds(110,265,80,20);
        frame.add(button);
        button.addActionListener(this);
        frame.setSize(500,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
        


    }
    public static void main(String[] args){
        App app = new App();
    }
    public void actionPerformed(ActionEvent e){
        String input_data = input_text.getText();
        String wpm_data = wpm.getText();
        String error_data = error.getText();
        int wpm_number = 0;
        int error_number = 0;
        if(e.getSource() == button){
            try{
                wpm_number = Integer.parseInt(wpm_data);
            }catch(NumberFormatException c){
                wpm_number = 130;
                wpmLabel.setText("Input Error, Defaulting 130 WPM.");
            }
            try{
                error_number = Integer.parseInt(error_data);
            }catch(NumberFormatException c){
                error_number = 92;
                errLabel.setText("Input Error, Defaulting to 92%.");

            }

            try{
                button.setLabel("Writing (5)");
                Thread.sleep(1000);
                button.setLabel("Writing (4)");
                Thread.sleep(1000);
                button.setLabel("Writing (3)");
                Thread.sleep(1000);
                button.setLabel("Writing (2)");
                Thread.sleep(1000);
                button.setLabel("Writing (1)");
                Thread.sleep(1000);
                button.setLabel("Writing");

                wpmLabel.setText("WPM: ");
                errLabel.setText("Accuracy (1-100): ");


             }
             catch (InterruptedException ex) {

              }
            try{
                Typer.type_sentence(input_data, wpm_number, error_number);
                button.setLabel("Written");
            }
            catch(InterruptedException exception){
                System.out.println("ERROR: EXITING"); 
            }
            
        }
    }
    
}
