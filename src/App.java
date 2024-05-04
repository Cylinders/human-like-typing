import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


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
    JTextArea input_text;
    JScrollPane scroll_input;
    TextField wpm, error;
    Label wpmLabel, errLabel;
    Typer typer;
    public App(){
        typer = new Typer();
        frame = new Frame("Typing");
    
        button = new Button("Type the text");
        input_text = new JTextArea("Enter your text here.");
        input_text.setRows(10);
        scroll_input = new JScrollPane(input_text);
        input_text.setLineWrap(true);
        input_text.setWrapStyleWord(true);



        wpm = new TextField("130");
        wpmLabel = new Label("WPM: ");
        error = new TextField("92");
        errLabel = new Label("Accuracy (1-100): ");

        wpm.setBounds(575,75,100,20);
        wpmLabel.setBounds(575, 50, 100, 20);
        error.setBounds(575, 125, 100, 20);
        errLabel.setBounds(575, 100, 100,20);

        
        frame.add(wpm);
        frame.add(wpmLabel);
        frame.add(error);
        frame.add(errLabel);
        scroll_input.setBounds(50,50,400,200);

        frame.add(scroll_input);
        
        button.setBounds(510,265,80,20);
        frame.add(button);
        button.addActionListener(this);
        frame.setSize(700,300);
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
