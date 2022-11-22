
# Template-Java-App

## Description

This is a template app created in java that will create a new window and open it. It includes code that makes drawing things to the window and making a app much easier.

## Code

### Classes

|Class Name   |Description                                                           |
|:-----------:|:--------------------------------------------------------------------:|
|Main         |The main class                                                        |
|WindowManager|Controlls anything to do with the window.                             |
|AppWindow    |Extends JFrame. Creates a new window when inisilized.                 |
|WindowObject |Anything that you can draw on the screen. e.g. Rect, Oval, String, etc|
|App Manager  |Controlls the app and has the main loop.                              |

### Guide

This app was made to make drawing to the JFrame much easier and to make it so you dont have to fiddle around with a Graphics2D and it all gets managed in 1 class. It works by having a list in the WindowManager class of instructions of what to draw and then when you run drawScreen() it runs through the instructions and draws evrything. This is to make it so that it doesent matter what class or what code you are drawing to the screen it all gets drawn at the same time and keeps the graphics nice and smooth. It also makes it so that you dont need to fiddle around with a graphics object.

You start by making a new WindowManager class. Then run init() on the class to create the window and set it up. You can add objects to be drawn when you run drawRect(), drawOval(), etc. Then to get it all drawn to the screen run drawScreen(). Inside the App Manager class there is a tick() function that gets run 60 times a second (Or however the amount the fps variable is).

### Example
    // Inside the App Manager class
    public void tick() {
      // Draws a rectangle with the color red, fills it, from position of 100 100 with a size of 50 50
      windowManager.drawRect(Color.RED, true, 100, 100, 50, 50);
      // Draws a oval with the color blue, fills it, from a position of 100 200 with a size of 50 50
      windowManager.drawOval(Color.BLUE, true, 100, 200, 50, 50);
      
      // Draws all the saved objects to the screen.
      windowManager.drawScreen();
    }
    
## Notes

- Whenever you draw a object without it being filled you have to specify a linewidth
