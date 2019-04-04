package Branching;

//
// TestingFile.java
// ComputerScience
//
// Copyright © 2019 Noah Wilder & David Shemesh. All rights reserved.
// Last modified on 04/04/19 3:49 PM.
//


public class TestingFile {
    String noah;

    public static void main(String[] args) {
        System.out.println("I got so much GIT");

        System.out.println("Wow, I'm branching!");

        System.out.println("2 + 2 = " + (2 + 2));
    }

    public static void newStuff() {
        System.out.println("New stuff");
    }
    public static void printDavid() {
        System.out.println("David");
    }

    public TestingFile(String noah) {
        this.noah = noah;
    }

    public String getNoah() {
        return noah;
    }

    public void setNoah(String noah) {
        this.noah = noah;
    }
}
