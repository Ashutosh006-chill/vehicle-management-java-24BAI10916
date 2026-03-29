# Java Vehicle Fleet Management System
**Student Name:** Ashutosh Dora  
**Registration Number:** 24BAI10916  
**Course:** Programming in Java

## Project Overview
This repository contains a Console-Based Vehicle Management System developed in Java. The project acts as a capstone to demonstrate core Object-Oriented Programming (OOP) principles, including Encapsulation, Abstraction, and dynamic Collection handling (using `ArrayList`), to manage a digital fleet of vehicles.

## Core Features
* **Register Vehicles:** Add new vehicles to the system with attributes like Brand, Model, Year, and Price.
* **View Fleet:** Dynamically iterate through registered data and output a formatted list of all active vehicles.
* **State Management:** Securely handle vehicle data lifecycle using the dedicated `FleetManager` class.

## Instructions to Run (CLI)
This application is strictly command-line interface (CLI) driven and does not require a GUI.

1. **Ensure Java is Installed:** You must have the Java Development Kit (JDK) installed on your machine.
2. **Clone the Repository:** `git clone https://github.com/Ashutosh006-chill/java-vehicle-fleet-24BAI10916.git`
3. **Navigate to the Directory:**
   `cd java-vehicle-fleet-24BAI10916`
4. **Compile the Java Files:**
   `javac *.java`
5. **Execute the Program:**
   `java Main`

## Repository Structure
* `Vehicle.java`: The foundational data model encapsulating vehicle attributes.
* `FleetManager.java`: The controller class handling the business logic and `List` data structures.
* `Main.java`: The primary entry point containing the interactive user loop and `Scanner` implementation.
