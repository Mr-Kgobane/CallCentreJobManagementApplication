package com.example.BusinessLogicLayer;

import com.example.DataAccessLayer.ServiceAgreement;

public class ServiceContractFactory implements ServiceAgreementFactory{
    @Override
    public ServiceAgreement createServiceAgreement(int agreementID, String startDate, String endDate, String detailsOfServices, String contractStatus) {
        return null;
    }
}
