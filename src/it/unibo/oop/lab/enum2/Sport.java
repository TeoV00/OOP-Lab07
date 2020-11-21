/**
 * 
 */
package it.unibo.oop.lab.enum2;
import org.junit.validator.PublicClassValidator;

import it.unibo.oop.lab.enum2.Place;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
    /*
     * Declare the following sports: basket - volley - tennis - bike - F1 - motogp - soccer
     */

    BASKET(Place.INDOOR, 5 , "basket"),
    SOCCER(Place.OUTDOOR, 11 , "soccer"),
    TENNIS(Place.OUTDOOR, 1 ,"tennis"),
    BIKE(Place.OUTDOOR, 1 , "bike"),
    F1(Place.OUTDOOR, 1 , "f1"),
    MOTOGP(Place.OUTDOOR, 1 , "motoGP" ),
    VOLLEY(Place.INDOOR, 6 , "volley");
    
    /*
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
    private static final int INDIVIDUAL_TEAM_COMPONENT = 1; 
    private int noTeamMember;
    private String nameSport;
    private Place place;
    /*
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
    Sport(final Place place, final int noTeamMembers, final String actualName){
        this.place = place;
        this.noTeamMember = noTeamMembers;
        this.nameSport = actualName;
    }
    /*
     * [METHODS] To be defined
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     */
    public boolean isIndividualSport() {
        return this.noTeamMember == INDIVIDUAL_TEAM_COMPONENT;
    }
    /* 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     */
    public boolean isIndoorSport() {
        return this.place.equals(Place.INDOOR);
    }
    /* 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     */
    public Place getPlace() {
        return this.place;
    }
    /* 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
    @Override
    public String toString() {
        return "[" + this.nameSport + "[Member: " + this.noTeamMember + ",Place: " + this.place + "]]";
    }
}
