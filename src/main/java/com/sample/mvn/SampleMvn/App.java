package com.sample.mvn.SampleMvn;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	LOGGER.info("Info ");
    	LOGGER.debug("debug ");
    	LOGGER.warn("warn");
    	LOGGER.error("ERROR");
        System.out.println( "Hello World!" );
    }
}
