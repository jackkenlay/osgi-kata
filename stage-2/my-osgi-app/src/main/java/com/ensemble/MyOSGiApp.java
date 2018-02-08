package com.ensemble;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(service = MyOSGiApp.class, immediate = true)
public class MyOSGiApp {

    @Reference
    private TimeKeeper timeKeeper;

    @Activate
    public void activate() {
        System.out.println("My OSGi MyOSGiApp: Component Activated");
        timeKeeper.printSomething("Hello from My OSGI app");
    }

    @Deactivate
    public void deactivate() {
        System.out.println("My OSGi MyOSGiApp: Component Deactivated");
    }
}
