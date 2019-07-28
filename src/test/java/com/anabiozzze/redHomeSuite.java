package com.anabiozzze;

import com.anabiozzze.client.redHomeTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class redHomeSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for redHome");
    suite.addTestSuite(redHomeTest.class);
    return suite;
  }
}
