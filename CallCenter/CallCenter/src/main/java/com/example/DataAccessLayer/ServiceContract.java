package com.example.DataAccessLayer;

import java.util.List;

public class ServiceContract {
    public ServiceContract(String contactType, String packageDetails, List<String> serviceLevelAgreements, boolean availability, String performanceData) {
        this.contactType = contactType;
        this.packageDetails = packageDetails;
        this.serviceLevelAgreements = serviceLevelAgreements;
        this.availability = availability;
        this.performanceData = "";
    }
    public ServiceContract() {
    }

    private String contactType;

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(String packageDetails) {
        this.packageDetails = packageDetails;
    }

    public List<String> getServiceLevelAgreements() {
        return serviceLevelAgreements;
    }

    public void setServiceLevelAgreements(List<String> serviceLevelAgreements) {
        this.serviceLevelAgreements = serviceLevelAgreements;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getPerformanceData() {
        return performanceData;
    }

    public void setPerformanceData(String performanceData) {
        this.performanceData = performanceData;
    }

    private String packageDetails;
    private List<String> serviceLevelAgreements;
    private  boolean availability;
    private String performanceData;

    void addSLA(String sla){
        serviceLevelAgreements.add(sla);
    }
}
