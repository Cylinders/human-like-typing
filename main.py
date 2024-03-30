import pyautogui as gui 
import time
import random
import string
import tkinter as tk


# RUTHVIK VENKATESAN AND VIHAS VEGGALAM : 2024; LIFELIKE HUMAN TYPING

""" 
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
 """





def percentChance(percent): 
    return random.random() > (1 - (.1 * percent))

def randomCharacter(): 
    return random.choice(string.ascii_letters)

# Defining the iterator variable for the enhanced for loops outside: 
# Saves the computation time of variable initialization and deletion later 
# Garbage collector would automatically delete the variable once you exited the for loop it was used for, which takes up compute time. 

i = 0
content = [r"Life as a child is a kaleidoscope of discovery and wonder, each day brimming with new adventures and experiences. From the innocence of infancy to the spirited curiosity of early childhood, every moment is imbued with a sense of boundless possibility. Playtime becomes a cherished realm where imagination knows no bounds, transforming mundane surroundings into fantastical landscapes ripe for exploration. Whether immersed in the pages of a storybook, building towering forts from cushions, or chasing elusive dreams in the backyard, every activity is an opportunity to learn, grow, and forge connections with the world. Amidst the laughter and occasional tears, there's an innate resilience that propels children forward, eager to embrace the next chapter of their journey with unbridled enthusiasm. Life as a child is a tapestry woven with the threads of joy, innocence, and the inexhaustible spirit of youth.".split()]

def main(): 
    root = tk.Tk();
    bgcolor = "#000000"
    fgcolor = "#ffffff"
    entry = tk.Entry(root, bg=bgcolor, fg=fgcolor, selectbackground=fgcolor)
    entry.grid(row = 0, column = 0)
    # For easier testing. 

    
    def pull_text():   
        global content
        with open("input.txt", "r") as file:
             content = file.readlines()
       
        for index, paragraph in enumerate(content):
                content[index] = paragraph.split()

    enter_text = tk.Button(root, bg=bgcolor,fg=fgcolor,text="Input Text From Input.txt", command=pull_text)
    enter_text.grid(row = 1, column = 0)
    
    def write_text():
      write.config(text = "Click To Write Text. (5)")
      root.update_idletasks();
      root.after(1000)
      write.config(text = "Click To Write Text. (4)")
      root.update_idletasks();
      root.after(1000)
      write.config(text = "Click To Write Text. (3)")
      root.update_idletasks();
      root.after(1000)
      write.config(text = "Click To Write Text. (2)")
      root.update_idletasks();
      root.after(1000)
      write.config(text = "Click To Write Text. (1)")
      root.update_idletasks();
      root.after(1000)
      write.config(text = "Writing.")
      root.update_idletasks();
      

      for paragraph in content:
        for word in paragraph:
            i = 0 
            for letter in word: 
                gui.typewrite(letter)
                root.after(int(1000 * .05 * random.random()))
                    
                if percentChance(10): 
                    root.after(int(1000 * .5 * random.random()))

                if percentChance(4): 
                    match random.randint(1, 3):
                        case 1: 
                            gui.typewrite(randomCharacter())
                            root.after(int(1000 * .1 * random.random()))
                            gui.press('backspace')    
                        case 2: 
                            gui.typewrite(randomCharacter())
                            root.after(int(1000 * .1 * random.random()))
                            gui.typewrite(randomCharacter())
                            gui.press('backspace')
                            root.after(int(1000 * .1 * random.random()))
                            gui.press('backspace')
                        case 3: 
                            if (i < len(word) - 1): 
                                if (word[i + 1].isupper()): 
                                    gui.typewrite(word[i].lower())
                                    root.after(int(1000 * .1 * random.random()))
                                    gui.press("backspace")

                                else: 
                                    gui.typewrite(word[i + 1].upper())
                                    root.after(int(1000 * .1 * random.random()))
                                    gui.press("backspace")
                            else: 
                                if (word[i].isupper()): 
                                    gui.typewrite(word[i].lower())
                                    root.after(int(1000 * .1 * random.random()))
                                    gui.press("backspace")

                                else: 
                                    gui.typewrite(word[i].upper())
                                    root.after(int(1000 * .1 * random.random()))
                                    gui.press("backspace")

                i = i + 1
            gui.typewrite(" ")
        root.after(int(1000 * .3 * random.random()))
                
        if percentChance(10): 
            root.after(int(1000 * .7 * random.random()))

        gui.press("enter")
        write.config(text = "Click To Write Text.")
        root.update_idletasks();



    write = tk.Button(root, bg=bgcolor,fg=fgcolor,text="Click To Write Text.", command=write_text)
    write.grid(row = 2, column = 0)




    
   




    root.mainloop()

if __name__ == "__main__":
    main()
