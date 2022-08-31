package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //equivalent to beans.xml file
@ComponentScan  // equivalent to <context:component-scan base-package="com"></context:component-scan>

public class MyConfiguration {

}
