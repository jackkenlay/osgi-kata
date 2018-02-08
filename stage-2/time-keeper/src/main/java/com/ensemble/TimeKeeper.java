package com.ensemble;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(service = TimeKeeper.class, immediate = true)
public class TimeKeeper {
    @Activate
    public void activate() {
        System.out.println("TimeKeeper: Component Activated");
    }

    @Deactivate
    public void deactivate() {
        System.out.println("TimeKeeper: Component Deactivated");
    }

    public void printSomething(String input){
        System.out.println("TimeKeeper->printSomething: " + input);
    }
}
