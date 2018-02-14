package com.ensemble;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(service = MyOSGiApp.class, immediate = true)
public class MyOSGiApp {

    @Activate
    public void activate() {
        System.out.println("My OSGi MyOSGiApp: Component Activated");
    }

    @Deactivate
    public void deactivate() {
        System.out.println("My OSGi MyOSGiApp: Component Deactivated");
    }
}
