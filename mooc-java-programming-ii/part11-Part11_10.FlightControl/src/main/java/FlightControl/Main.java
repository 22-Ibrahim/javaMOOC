package FlightControl;

import FlightControl.logic.FlightControl;
import flightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl flightControl = new FlightControl();
        Scanner scanner = null;
        TextUI textui = new TextUI(flightControl, scanner);
        textui.start();
        
    }
}
