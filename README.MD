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
* Make a second service called ‘time-keeper’
  * it will have a function called printSomething(String input) which will be called from the ‘my-osgi-app’ service and will print a string.

## Third Stage: 
* Create a gui for my-osgi-app. 
  * It needs a text field and a button. 
  * Ensure this is shown when you start your service

## Fourth Stage:
* Create function getTheTime() in the time-keeper app that returns the time (as a string)
* When you press the button in my-osgi-app, it retrieves the time from ‘time-keeper’ and displays it in the textfield

## Fifth Stage:
* Create an interface in the 'time-keeper' class called TimeKeeperService. It will have a void method called printWhoYouAre()
* Create 4 more services in the ‘time-keeper’ class, ServiceA ServiceB ServiceC ServiceD.
  * Each component:
    * Must implement TimeKeeperService.
    * Must print service name when printWhoYouAre() is called.
  * In my-osgi-service, make it so as each TimeKeeperService goes offline/online, it calls printWhoYouAre() on the service.
  * Open the web console for Karaf and when you stop/start the components then they should print to console.

## Six Stage:
* Display 4 buttons in the ‘my-osgi-app’ with the names of the services in the time-keeper service.
* Make it so that when each service is activated/deactivated, the buttons deactivate/activate.
* Test using web console.

## Seventh Stage:
* The calculator app that Alex has done.

## Eight Stage:
* Add another service to Alex’s calculator.

## Ninth Stage:
* Make it like an AEM service (WIP).


## Useful Commands (Maven):
* ```mvn clean install -U```
* ```rm -rf ~/.m2/repository/(repository name)```

## Useful Commands (Karaf):
* ```bin/karaf```
* ```halt```
* ```bundle:install mvn:com.something/articfact-id/version```
* ```bundle:update (bundle number)```
* ```list```
* ```feature:install scr```
* ```scr:list```
* ```feature:install webconsole```
* ```http://localhost:8181/system/console/components (user:karaf/password:karaf)```
