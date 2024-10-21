package com.EggProd.EggProd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PreDestroy;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

@SpringBootApplication
public class EggProdApplication {

    public static void main(String[] args) {
        SpringApplication.run(EggProdApplication.class, args);
    }

    @WebListener
    public static class MyContextListener implements ServletContextListener {

        @Override
        public void contextInitialized(ServletContextEvent sce) {
            // No-op
        }

        @Override
        public void contextDestroyed(ServletContextEvent sce) {
            // Deregister JDBC drivers to prevent memory leaks
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            while (drivers.hasMoreElements()) {
                Driver driver = drivers.nextElement();
                try {
                    DriverManager.deregisterDriver(driver);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // Stop the MySQL AbandonedConnectionCleanupThread
            //com.mysql.cj.jdbc.AbandonedConnectionCleanupThread.checkedShutdown();
        }
    }
}