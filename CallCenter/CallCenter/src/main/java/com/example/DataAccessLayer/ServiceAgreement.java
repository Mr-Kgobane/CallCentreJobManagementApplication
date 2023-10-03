package com.example.DataAccessLayer;

import java.util.List;

public class ServiceAgreement {
    public ServiceAgreement(int agreementID, String startDate, String endDate, String detailsOfService, String contractStatus, String managementInfo) {
        this.agreementID = agreementID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.detailsOfService = detailsOfService;
        this.contractStatus = contractStatus;
        this.managementInfo = "";
    }

    private int agreementID;
    private String startDate;
    private String endDate;
    private String detailsOfService;
    private String contractStatus;

    public ServiceAgreement() {
    }

    private String managementInfo;
}
