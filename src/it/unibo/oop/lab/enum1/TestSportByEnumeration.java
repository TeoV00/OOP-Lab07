package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        
        SportSocialNetworkUserImpl<User> puletti = new SportSocialNetworkUserImpl<>("Pippo", "Paoletti", "puletti",43);
        puletti.addSport(Sport.BASKET);
        puletti.addSport(Sport.VOLLEY);
        puletti.addSport(Sport.F1);
        System.out.println("Puletti DONT LIKE motogp: " + !puletti.hasSport(Sport.MOTOGP));
        System.out.println("Puletti Like Basket: " + puletti.hasSport(Sport.BASKET));
        
    }
}
