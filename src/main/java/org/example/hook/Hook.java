package org.example.hook;

import io.cucumber.java.After;
import org.example.drivers.DriverManager;

public class Hook {

    @After
    public void tearDown() {
        // Cierra el driver después de cada escenario
        System.out.println("Cerrando el driver después del escenario...");
        DriverManager.quitDriver();
    }
}
