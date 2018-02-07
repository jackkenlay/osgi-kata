# OSGI Kata/Coding Challenge (WIP)

## About
A number of challenges that build up an OSGi service.

## Prerequisites
* My OSGi Maven [Archetype](https://github.com/jackkenlay/osgi-archetype) (not necessary)
* IDE
* [Apache Karaf](https://karaf.apache.org/)

## First Stage: 
* Uninstall old Kata projects first to avoid confusion
* Make a service called ‘my-osgi-app’ that runs on Karaf

## Second Stage: 
* Make a second service called ‘time-keeper’, it will have a function called printSomething(String input) which will be called from the ‘my-osgi-app’ service and will print a string.

## Third Stage: 
* Create a gui for my-osgi-app. It needs a text field and a button. Ensure this is shown when you start your service

## Fourth Stage:
* When you press the button in my-osgi-app, it retreives the time from ‘time-keeper’ and displays it in the textfield

## Fifth Stage:
* Create 4 more services in the ‘time-keeper’ app. They all have a name, which is gettable. For each component of this type, display 4 buttons in the ‘my-osgi-app’ with their names. Open the web console for Karaf and when you stop/start the components the buttons should disable/enable on your ‘my-osgi-app’ GUI.

## Sixth Stage:
* The calculator app that Alex has done.

## Seventh Stage:
* Add another service to Alex’s calculator.

## Useful Commands (Maven)
* ```mvn clean install -U```

## Useful Commands (Karaf):
* ```bin/karaf```
* ```halt```
* ```bundle:install mvn:com.something/articfact-id/version```
* ```bundle:update (bundle number)```
