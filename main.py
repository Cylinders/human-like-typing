import pyautogui as gui 
import time
import random
import string

# TODO: NEEDS SETUP: LIVE INPUT HANDLING SO THAT HITTING ESCAPE EXITS THE PROGRAM EASILY
# import pygame

def percentChance(percent): 
    return random.random() > (1 - (.1 * percent))

def randomCharacter(): 
    return random.choice(string.ascii_letters)

# Defining the iterator variable for the enhanced for loops outside: 
# Saves the computation time of variable initialization and deletion later 
# Garbage collector would automatically delete the variable once you exited the for loop it was used for, which takes up compute time. 

i = 0

def main(): 

    
    # For easier testing. 

    if (input("enter 1 for the testing environment. This will load a sample. Else, if you need to enter your own task, just hit enter") == "1"):
        print("INITIALIZING TEST ENVIRONMENT")
        content = [r"Life as a child is a kaleidoscope of discovery and wonder, each day brimming with new adventures and experiences. From the innocence of infancy to the spirited curiosity of early childhood, every moment is imbued with a sense of boundless possibility. Playtime becomes a cherished realm where imagination knows no bounds, transforming mundane surroundings into fantastical landscapes ripe for exploration. Whether immersed in the pages of a storybook, building towering forts from cushions, or chasing elusive dreams in the backyard, every activity is an opportunity to learn, grow, and forge connections with the world. Amidst the laughter and occasional tears, there's an innate resilience that propels children forward, eager to embrace the next chapter of their journey with unbridled enthusiasm. Life as a child is a tapestry woven with the threads of joy, innocence, and the inexhaustible spirit of youth.".split()]
    else: 
        print("INITIALIZING RUNTIME ENVIRONMENT")
        
        if (input("Enter 1 if you will enter your content into the input.txt file. This is better suited for longer entries. Else, just hit enter.") == "1"):
            input("Enter your content into the text file and then hit enter. Make sure to clear the text file if anything was already in it. Then, you will have five seconds to move your mouse over to the typing screen.")
            content = open("input.txt", "r").readlines()
            for paragraph in content:
                paragraph = paragraph.split() 

        else:
            content = [input("Copy and paste the prompt into here. Then, you will have five seconds to move your mouse over to the document writing application in order to simulate the typing.").split()]


    time.sleep(5)




    
    for paragraph in content:
        for word in paragraph:
            i = 0 
            for letter in word: 
                gui.typewrite(letter)
                time.sleep(.05 * random.random())
                    
                if percentChance(10): 
                    time.sleep(.5 * random.random())

                if percentChance(4): 
                    match random.randint(1, 3):
                        case 1: 
                            gui.typewrite(randomCharacter())
                            time.sleep(.1 * random.random())
                            gui.press('backspace')    
                        case 2: 
                            gui.typewrite(randomCharacter())
                            time.sleep(.1 * random.random())
                            gui.typewrite(randomCharacter())
                            gui.press('backspace')
                            time.sleep(.1 * random.random())
                            gui.press('backspace')
                        case 3: 
                            if (i < len(word) - 1): 
                                if (word[i + 1].isupper()): 
                                    gui.typewrite(word[i].lower())
                                    time.sleep(.1 * random.random())
                                    gui.press("backspace")

                                else: 
                                    gui.typewrite(word[i + 1].upper())
                                    time.sleep(.1 * random.random())
                                    gui.press("backspace")
                            else: 
                                if (word[i].isupper()): 
                                    gui.typewrite(word[i].lower())
                                    time.sleep(.1 * random.random())
                                    gui.press("backspace")

                                else: 
                                    gui.typewrite(word[i].upper())
                                    time.sleep(.1 * random.random())
                                    gui.press("backspace")

                i = i + 1
            gui.typewrite(" ")
        time.sleep(.3 * random.random())
                
        if percentChance(10): 
            time.sleep(.7 * random.random())

        gui.press("enter")







    print("Program completed succesfully. EXIT. EXIT.")


if __name__ == "__main__":
    main()