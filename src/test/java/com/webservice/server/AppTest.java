package com.webservice.server;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for sample App.
 */
public class AppTest extends TestCase {
    /**
     * Instantiate the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being executed
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue( true );
        assertTrue( true );
        assertTrue( true );
        assertTrue( true );
        assertTrue( true );
        assertTrue( true );
    }
}
