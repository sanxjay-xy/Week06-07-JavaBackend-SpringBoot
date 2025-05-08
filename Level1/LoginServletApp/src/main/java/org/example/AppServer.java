package org.example;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class AppServer {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

        String contextPath = "";
        String docBase = new java.io.File(".").getAbsolutePath();
        var context = tomcat.addContext(contextPath, docBase);

        Tomcat.addServlet(context, "loginServlet", new LoginServlet());
        context.addServletMappingDecoded("/login", "loginServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}