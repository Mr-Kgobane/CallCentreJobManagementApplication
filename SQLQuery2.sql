Use PremierServiceSolutions

ALTER TABLE Client 

ADD FOREIGN KEY (ServiceLevelID) REFERENCES ServiceLevelAgreement(ServiceLevelID); 

  

-- Add foreign key to ServiceLevelAgreement table 

ALTER TABLE ServiceLevelAgreement 

ADD FOREIGN KEY (ClientID) REFERENCES Client(ClientID); 

  

-- Add foreign key to ServiceContract table 

ALTER TABLE ServiceContract 

ADD FOREIGN KEY (ServiceLevelID) REFERENCES ServiceLevelAgreement(ServiceLevelID); 

  

-- Add foreign keys to Job table 

ALTER TABLE Job 

ADD FOREIGN KEY (ClientID) REFERENCES Client(ClientID); 

  

ALTER TABLE Job 

ADD FOREIGN KEY (CallAgentID) REFERENCES CallAgent(CallAgentID); 

  

ALTER TABLE Job 

ADD FOREIGN KEY (TechnicianID) REFERENCES Technician(TechnicianID); 

  

ALTER TABLE Job 

ADD FOREIGN KEY (ContractID) REFERENCES ServiceContract(ContractID); 

  

ALTER TABLE Job 

ADD FOREIGN KEY (ManagerID) REFERENCES Managers(ManagerID); 

  

-- Add foreign keys to CallAgent table 

ALTER TABLE CallAgent 

ADD FOREIGN KEY (PersonalDetailsID) REFERENCES PersonalDetails(PersonalDetailsID); 

  

ALTER TABLE CallAgent 

ADD FOREIGN KEY (ClientID) REFERENCES Client(ClientID); 

  

-- Add foreign keys to Technician table 

ALTER TABLE Technician 

ADD FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID); 

  

ALTER TABLE Technician 

ADD FOREIGN KEY (JobID) REFERENCES Job(JobID); 

  

-- Add foreign keys to Employee table 

ALTER TABLE Employee 

ADD FOREIGN KEY (PersonalDetailsID) REFERENCES PersonalDetails(PersonalDetailsID); 

  

-- Add foreign keys to Managers table 

ALTER TABLE Managers 

ADD FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID); 

  

ALTER TABLE Managers 

ADD FOREIGN KEY (LoginID) REFERENCES Login(LoginID); 

  

-- Add foreign keys to Login table 

ALTER TABLE Login 

ADD FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID); 

 