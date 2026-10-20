# GoCycle — Shared Bike and Scooter Rental System

**SENG 300 — Assignment 1**  
University of Calgary | Fall 2026

## Project Overview

GoCycle is a Java-based shared transportation system designed to support the rental and management of pedal bikes, electric bikes, and electric scooters.

The project includes components for vehicle management, docking stations, trips, pricing, payments, and notifications. It applies object-oriented design principles to organize responsibilities and support future extensions.

## Requirements

- Java Development Kit (JDK)
- Windows PowerShell for the build commands below
- Git (optional, for cloning the repository)

## Project Structure

Java source files are organized under `src/gocycle/`.

The project includes components for:

- **Vehicles:** Pedal bikes, electric bikes, electric scooters, availability, battery management, and maintenance.
- **Stations:** Docking stations and docking points.
- **Trips:** Rider and trip information.
- **Pricing:** Fare calculation and pricing policies.
- **Payments:** Payment interfaces and implementations.
- **Notifications:** Simulated fault and low-battery notifications.

## Build Instructions

Open Windows PowerShell in the project's root directory.

Compile all Java source files:

```powershell
javac -d out (Get-ChildItem -Path src -Filter *.java -Recurse).FullName
```

The compiled `.class` files will be placed in the `out` directory.

## Run Instructions

To run the vehicle subsystem tests:

```powershell
java -cp out gocycle.vehicle.VehicleTest
```

These tests demonstrate:

- Vehicle availability checks
- Electric vehicle battery restrictions
- Validation of battery percentages
- Vehicle fault reporting and maintenance
- Simulated notifications to maintenance crews and control room operators

The vehicle test is the verified executable entry point. Other system components are provided as Java classes.

## Group Members

| Deborah Andom | 30243042 |
| Memphis Olaes | 30175046 |
| Jackson Schaab | 30237580 |
| RJ Rinos | 30235897 |

