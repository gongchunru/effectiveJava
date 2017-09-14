package com.java.improve.Patterns.builderPattern.builder01;

/**
 * Created by gongchunru
 * Date：2017/7/21.
 * Time：14:34
 */
public class Person02 {

    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String suffix;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomewOwner;

    public Person02(
            final String newLastName,
            final String newFirstName,
            final String newMiddleName,
            final String newSalutation,
            final String newSuffix,
            final String newStreetAddress,
            final String newCity,
            final String newState,
            final boolean newIsFemale,
            final boolean newIsEmployed,
            final boolean newIsHomeOwner)
    {
        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.middleName = newMiddleName;
        this.salutation = newSalutation;
        this.suffix = newSuffix;
        this.streetAddress = newStreetAddress;
        this.city = newCity;
        this.state = newState;
        this.isFemale = newIsFemale;
        this.isEmployed = newIsEmployed;
        this.isHomewOwner = newIsHomeOwner;
    }

    public static class Person02Builder{
        private String newLastName;
        private String newFirstName;
        private String newMiddleName;
        private String newSalutation;
        private String newSuffix;
        private String newStreetAddress;
        private String newCity;
        private String newState;
        private boolean newIsFemale;
        private boolean newIsEmployed;
        private boolean newIsHomeOwner;

        public Person02Builder setNewLastName(String newLastName) {
            this.newLastName = newLastName;
            return this;
        }

        public Person02Builder setNewFirstName(String newFirstName) {
            this.newFirstName = newFirstName;
            return this;
        }

        public Person02Builder setNewMiddleName(String newMiddleName) {
            this.newMiddleName = newMiddleName;
            return this;
        }

        public Person02Builder setNewSalutation(String newSalutation) {
            this.newSalutation = newSalutation;
            return this;
        }

        public Person02Builder setNewSuffix(String newSuffix) {
            this.newSuffix = newSuffix;
            return this;
        }

        public Person02Builder setNewStreetAddress(String newStreetAddress) {
            this.newStreetAddress = newStreetAddress;
            return this;
        }

        public Person02Builder setNewCity(String newCity) {
            this.newCity = newCity;
            return this;
        }

        public Person02Builder setNewState(String newState) {
            this.newState = newState;
            return this;
        }

        public Person02Builder setNewIsFemale(boolean newIsFemale) {
            this.newIsFemale = newIsFemale;
            return this;
        }

        public Person02Builder setNewIsEmployed(boolean newIsEmployed) {
            this.newIsEmployed = newIsEmployed;
            return this;
        }

        public Person02Builder setNewIsHomeOwner(boolean newIsHomeOwner) {
            this.newIsHomeOwner = newIsHomeOwner;
            return this;
        }

        public Person02 createPerson02() {
            return new Person02(newLastName, newFirstName, newMiddleName, newSalutation, newSuffix, newStreetAddress, newCity, newState, newIsFemale, newIsEmployed, newIsHomeOwner);
        }
    }




}
