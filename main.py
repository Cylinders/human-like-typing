import pyautogui as gui 
import time


content = input("Copy and paste the prompt into here. Then, you will have five seconds to move your mouse over to the document writing application in order to simulate the typing.").split()

time.sleep(5)
try: 
        
    for word in content: 
        gui.typewrite(word)
        gui.typewrite(" ")
        time.sleep(.1)
except: 
    print("ERROR")
    exit


print("Program completed succesfully. EXIT. EXIT.")