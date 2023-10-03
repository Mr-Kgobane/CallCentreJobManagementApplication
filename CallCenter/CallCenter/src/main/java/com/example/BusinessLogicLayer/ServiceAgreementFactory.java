package com.example.BusinessLogicLayer;

import com.example.DataAccessLayer.ServiceAgreement;

public interface ServiceAgreementFactory {
    ServiceAgreement createServiceAgreement(int agreementID, String startDate, String endDate, String detailsOfServices, String contractStatus);

}
