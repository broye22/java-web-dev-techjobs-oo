package org.launchcode.techjobs_oo;

import javax.naming.Name;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    @Override
    public String toString() {
        String errorMessage;
        errorMessage = "Oops no Data Available!";
        if (this.employer.getValue() == null){
            employer.setValue("Oops No data Available!");
            return employer.getValue();
        }
        if (this.name.equals("")) {
            return "Job{" +
                    "id=" + id + ", " +
                    "\n" + "name='" + "Oops Unavailable" + ",  " +
                    "\n" + "employer=" + employer + ",  " +
                    "\n" + "location=" + location + ",  " +
                    "\n" + "positionType=" + positionType + ",  " +
                    "\n" + "coreCompetency=" + coreCompetency +
                    '}';
        }

        if (this.location.getValue() == null) {
            return "Job{" +
                    "id=" + id + ", " +
                    "\n" + "name='" + name + ",  " +
                    "\n" + "employer=" + employer + ",  " +
                    "\n" + "location=" + "Oops No Data Available!" + ",  " +
                    "\n" + "positionType=" + positionType + ",  " +
                    "\n" + "coreCompetency=" + coreCompetency +
                    '}';
        }if (this.positionType == null) {
            return "Job{" +
                    "id=" + id + ", " +
                    "\n" + "name='" + name + ",  " +
                    "\n" + "employer=" + employer + ",  " +
                    "\n" + "location=" + location + ",  " +
                    "\n" + "positionType=" + "Oops No Data Available!" + ",  " +
                    "\n" + "coreCompetency=" + coreCompetency +
                    '}';
        }  if (this.coreCompetency.getValue() == " ") {
            return "Job{" +
                    "id=" + id + ", " +
                    "\n" + "name='" + name + ",  " +
                    "\n" + "employer=" + employer + ",  " +
                    "\n" + "location=" + location + ",  " +
                    "\n" + "positionType=" + positionType + ",  " +
                    "\n" + "coreCompetency=" + "Oops No Data Available!" +
                    '}';
        } else {
            return "id=" + id +
                    "\n" + "name= " + name  +
                    "\n" + "employer= " + employer +
                    "\n" + "location= " + location  +
                    "\n" + "positionType= " + positionType  +
                    "\n" + "coreCompetency= " + coreCompetency;
        }
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
