 Software Design Patterns - Assignment 2: Factory Method & Abstract Factory

Course: Software Design Patterns 
Author: Seipenov Damir, Group: SE-2523

 Project Overview
This Java application integrates two creational design patterns:
1. Factory Method: Manages dynamic delivery logistics (`Truck` vs `Ship`).
2. Abstract Factory: Constructs platform-consistent UI component pairs (`Windows` vs `macOS` Button and Checkbox).

 Package Structure
 `com.logistics.model` — Domain interfaces (`Transport`, `Button`, `Checkbox`) and concrete implementations.
 `com.logistics.logistics` — Factory Method roles (`Logistics`, `RoadLogistics`, `SeaLogistics`).
 `com.logistics.factory` — Abstract Factory roles (`GUIFactory`, `WindowsFactory`, `MacOSFactory`).
 `com.logistics.app` — Client application (`DeliveryApplication`).
 `com.logistics.util` — Enums (`DeliveryMode`, `UIPlatform`).
 `com.logistics` — Startup bootstrapper (`Main`).

 Prerequisites
 Java Development Kit (JDK): Version 17 or higher.

 How to Build and Run

 Option 1: Native javac & java (Command Line)
1. Compile source files:
   ```bash
   javac -d bin src/main/java/com/logistics/*.java src/main/java/com/logistics/*/*.java
<img width="754" height="296" alt="Снимок экрана 2026-09-20 185643" src="https://github.com/user-attachments/assets/a2120b3d-57e0-40ac-b479-933368c9920d" />
<img width="764" height="235" alt="Снимок экрана 2026-09-20 185748" src="https://github.com/user-attachments/assets/e4d81749-80b0-47ef-a83d-7a73f0b495ce" />
