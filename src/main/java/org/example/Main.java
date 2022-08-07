package org.example;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("org.example:name=game");
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            server.registerMBean(new Game(), objectName);

            System.out.println("Accepting new requests.");
            while(true);
        } catch (MalformedObjectNameException | InstanceAlreadyExistsException |
                 MBeanRegistrationException | NotCompliantMBeanException e) {
            // handle exceptions
        }
    }
}
