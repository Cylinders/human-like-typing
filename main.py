import pyautogui as gui 
import time
import random
import string


content = input("Copy and paste the prompt into here. Then, you will have five seconds to move your mouse over to the document writing application in order to simulate the typing.").split()

time.sleep(5)

def tenpercentchance(): 
    return random.random() > .9

def sevenpercentchance(): 
     return random.random() > .93

def randomCharacter(): 
     return random.choice(string.ascii_letters)

for word in content: 
        for letter in word: 
            gui.typewrite(letter)
            time.sleep(.1 * random.random())
            
            if tenpercentchance(): 
                time.sleep(.5 * random.random())

            if sevenpercentchance(): 
                if (random.randint(1, 2) == 1): 
                    gui.typewrite(randomCharacter())
                    time.sleep(.1 * random.random())
                    gui.press('backspace')
                else: 
                    gui.typewrite(randomCharacter())
                    time.sleep(.1 * random.random())
                    gui.typewrite(randomCharacter())
                    time.sleep(.1 * random.random())
                    gui.press('backspace')
                    time.sleep(.1 * random.random())
                    gui.press('backspace')
        gui.typewrite(" ")
        time.sleep(.3 * random.random())
        
        if tenpercentchance(): 
            time.sleep(.7 * random.random())



print("Program completed succesfully. EXIT. EXIT.")