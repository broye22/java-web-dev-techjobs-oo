package org.launchcode.techjobs_oo.Tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import javax.xml.namespace.QName;

import java.lang.reflect.Parameter;
import java.sql.SQLOutput;

import static org.junit.Assert.*;


public class JobTests {

    @Test
    public void testSettingJobId(){
        Job fakeJob = new Job();
       Job fake2Job = new Job();
       assertTrue(fakeJob.getId() == 1 && fake2Job.getId() == 2);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job fake3Job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
            Assert.assertTrue(fake3Job instanceof Job);

    }

    @Test
    public void testJobsForEquality(){
        Job fakeJob1 = new Job("Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        Job fakeJob2 = new Job("Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        assertFalse(fakeJob1.getId() == fakeJob2.getId());

    }
    @Test
    public void testForNull2(){
        Job fakeJob;
        fakeJob = new Job("",
                new Employer(),
                new Location(),
                new PositionType(""),
                new CoreCompetency(""));
        System.out.println(fakeJob);
    }

    @Test
    public void testForNull(){
       Job fakeJob = new Job();
        System.out.println(new Job());
    }

}
