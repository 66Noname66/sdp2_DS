package com.logistics;

import com.logistics.app.DeliveryApplication;
import com.logistics.factory.GUIFactory;
import com.logistics.factory.MacOSFactory;
import com.logistics.factory.WindowsFactory;
import com.logistics.logistics.Logistics;
import com.logistics.logistics.RoadLogistics;
import com.logistics.logistics.SeaLogistics;
import com.logistics.util.DeliveryMode;
import com.logistics.util.UIPlatform;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String modeInput = null;
        String platformInput = null;

        if  (args.length >= 2) {
            modeInput = args[0];
            platformInput = args[1];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter delivery mode (ROAD / SEA): ");
            if(scanner.hasNextLine()) modeInput = scanner.nextLine().trim();
            System.out.print("Enter UI platform (WINDOWS / MACOS): ");
            if(scanner.hasNextLine()) platformInput = scanner.nextLine().trim();

        }
        DeliveryMode mode = parseDeliveryMode(modeInput);
        UIPlatform platform = parseUIPlatform(platformInput);

        if (mode == null || platform == null) {
            System.err.println("Error: Invalid or missing parameters. Stopping execution cleanly without executing logistics workflow.");
            return;
        }

        Logistics logistics = configureLogistics(mode);
        GUIFactory factory = configureGUIFactory(platform);

        DeliveryApplication app = new DeliveryApplication(factory, logistics);
        app.run("laboratory equipment", "Aktau warehouse");

    }
    private static DeliveryMode parseDeliveryMode(String input) {
        if (input == null || input.isBlank()) return null;
        try {
            return DeliveryMode.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
    private static UIPlatform parseUIPlatform(String input) {
        if (input == null || input.isBlank()) return null;
        try {
            return UIPlatform.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
    private static Logistics configureLogistics(DeliveryMode mode) {
        return switch (mode){
            case ROAD -> new RoadLogistics();
            case SEA -> new SeaLogistics();
        };
    }
    private static GUIFactory configureGUIFactory(UIPlatform platform) {
        return switch (platform){
            case WINDOWS -> new WindowsFactory();
            case MACOS -> new MacOSFactory();
        };
    }

}