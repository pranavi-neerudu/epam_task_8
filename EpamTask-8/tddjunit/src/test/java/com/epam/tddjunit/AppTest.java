package com.epam.tddjunit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
	Remove2Chars removechar=new Remove2Chars();
	

    
    public void testApp()
    {
        assertTrue( "BCD".equals(removechar.remove("ABCD")) );
    }
    public void test1App()
    {
        assertTrue( "CD".equals(removechar.remove("AACD")) );
    }
    public void test2App()
    {
        assertTrue( "BCD".equals(removechar.remove("BACD")) );
    }
    public void test3App()
    {
        assertTrue( "BBAA".equals(removechar.remove("BBAA")) );
    }
    public void test4App()
    {
        assertTrue( "BAA".equals(removechar.remove("AABAA")) );
    }
}
