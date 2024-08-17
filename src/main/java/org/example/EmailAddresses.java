package org.example;

public class EmailAddresses {

    private String primaryEmailAddress;
    private String secondaryEmailAddress;

    public void setPrimaryEmailAddress(String primaryEmailAddress) {
        this.primaryEmailAddress = primaryEmailAddress;
    }

    public String getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    public void setSecondaryEmailAddress(String secondaryEmailAddress) {
        this.secondaryEmailAddress = secondaryEmailAddress;
    }

    public String getSecondaryEmailAddress() {
        return secondaryEmailAddress;
    }
}
