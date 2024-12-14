package com.example.prisonmanagementsoftaware.hasibulhasan;

public class Prisoner {
    private String prisonerId, prisonerName, email, password, crimeName, emergencyContact, dateOfBirth, dateOfAdmission;
    private int sentenceDurationYears, sentenceDurationMonths, sentenceDurationDays, timeServedYears, timeServedMonths, timeServedDays;
    private boolean eligibleForParole;

    public String getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(String prisonerId) {
        this.prisonerId = prisonerId;
    }

    public String getPrisonerName() {
        return prisonerName;
    }

    public void setPrisonerName(String prisonerName) {
        this.prisonerName = prisonerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCrimeName() {
        return crimeName;
    }

    public void setCrimeName(String crimeName) {
        this.crimeName = crimeName;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public int getSentenceDurationYears() {
        return sentenceDurationYears;
    }

    public void setSentenceDurationYears(int sentenceDurationYears) {
        this.sentenceDurationYears = sentenceDurationYears;
    }

    public int getSentenceDurationMonths() {
        return sentenceDurationMonths;
    }

    public void setSentenceDurationMonths(int sentenceDurationMonths) {
        this.sentenceDurationMonths = sentenceDurationMonths;
    }

    public int getSentenceDurationDays() {
        return sentenceDurationDays;
    }

    public void setSentenceDurationDays(int sentenceDurationDays) {
        this.sentenceDurationDays = sentenceDurationDays;
    }

    public int getTimeServedYears() {
        return timeServedYears;
    }

    public void setTimeServedYears(int timeServedYears) {
        this.timeServedYears = timeServedYears;
    }

    public int getTimeServedMonths() {
        return timeServedMonths;
    }

    public void setTimeServedMonths(int timeServedMonths) {
        this.timeServedMonths = timeServedMonths;
    }

    public int getTimeServedDays() {
        return timeServedDays;
    }

    public void setTimeServedDays(int timeServedDays) {
        this.timeServedDays = timeServedDays;
    }

    public boolean isEligibleForParole() {
        return eligibleForParole;
    }

    public void setEligibleForParole(boolean eligibleForParole) {
        this.eligibleForParole = eligibleForParole;
    }

    public Prisoner(String prisonerId, String prisonerName, String email, String password, String crimeName, String emergencyContact, String dateOfBirth, String dateOfAdmission, int sentenceDurationYears, int sentenceDurationMonths, int sentenceDurationDays, int timeServedYears, int timeServedMonths, int timeServedDays, boolean eligibleForParole) {
        this.prisonerId = prisonerId;
        this.prisonerName = prisonerName;
        this.email = email;
        this.password = password;
        this.crimeName = crimeName;
        this.emergencyContact = emergencyContact;
        this.dateOfBirth = dateOfBirth;
        this.dateOfAdmission = dateOfAdmission;
        this.sentenceDurationYears = sentenceDurationYears;
        this.sentenceDurationMonths = sentenceDurationMonths;
        this.sentenceDurationDays = sentenceDurationDays;
        this.timeServedYears = timeServedYears;
        this.timeServedMonths = timeServedMonths;
        this.timeServedDays = timeServedDays;
        this.eligibleForParole = eligibleForParole;
    }

    @Override
    public String toString() {
        return prisonerId;
    }
}
