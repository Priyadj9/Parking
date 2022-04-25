# Parking-Lot
🚗🚗Parking lot using Java OOP


This is a parking lot system built using Object Oriented Programming in Java. I have used Maven as a project management toot to simplify the build process.
The Project Object Model(POM) file contains information related to the project and configuration information such as dependencies, source directory, plugin, goals etc. used by Maven to build the project.
The maven-archetype-quickstart is the specified archetype added while structuring the project.

🔦 The main structure is divided into several components like model,validator,cost,commands and exception so that each functionality can be handled and debugged independently.

🔦 Each slot is given a number starting at 1 increasing with increasing distance from the entry point in steps of one. 
When a car enters the lot, a ticket issued to the driver which includes documenting the registration number and allocating an available parking slot to the car before actually handing over a ticket to the driver.

🔦 The customer is allocated a parking slot which is nearest to the entry. At the exit the customer returns the ticket which then marks the slot they were using as being available.


Data Structures such as HahMap and ArrayList are used to store the information regarding slot and slot sizes in the form of key/value pairs.

🔐 The internal functionality of various parts of the parking system is abstracted using interfaces which makes the customers use the lot efficiently without revealing any necessary information. 
