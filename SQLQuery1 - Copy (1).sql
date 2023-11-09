
Use  PremierServiceSolutions

CREATE TABLE CallRecord ( 
	CallID INT PRIMARY KEY,
	ClientID INT,
	Time_Stamp timestamp,
	ProblemDetails varchar(255)
);


-- Create PersonalDetails table 

CREATE TABLE PersonalDetails ( 

    PersonalDetailsID INT PRIMARY KEY, 

    FirstName VARCHAR(255), 

    LastName VARCHAR(255), 

    Email VARCHAR(255), 

    Phone VARCHAR(20), 

    Address VARCHAR(255) 

); 

 

-- Create BusinessClient table 

CREATE TABLE BusinessClient ( 

    BusinessClientID INT PRIMARY KEY, 

    CompanyName VARCHAR(255), 

    Email VARCHAR(255), 

    Address VARCHAR(255) 

); 

 

-- Create Client table 

CREATE TABLE Client ( 

    ClientID INT PRIMARY KEY, 

    PersonalDetailsID INT, 

    BusinessClientID INT, 

    ServiceLevelID INT, 

   

); 

 

-- Create ServiceLevelAgreement table 

CREATE TABLE ServiceLevelAgreement ( 

    ServiceLevelID INT PRIMARY KEY, 

    StartDate DATE, 

    EndDate DATE, 

    ContactStatus VARCHAR(255), 

    ClientID INT, 

    Availability VARCHAR(255), 

    PackageDetails VARCHAR(255), 

    ContractType VARCHAR(255), 

    ServiceType VARCHAR(255), 

  

); 

 

-- Create ServiceContract table 

CREATE TABLE ServiceContract ( 

    ContractID INT PRIMARY KEY, 

    ServiceLevelID INT, 


); 

 

-- Create Job table 

CREATE TABLE Job ( 

    JobID INT PRIMARY KEY, 

    JobType VARCHAR(255), 

    Status VARCHAR(255), 

    JobDescription TEXT, 

    ScheduledDate DATE, 

    ClientID INT, 

    CallAgentID INT, 

    TechnicianID INT, 

    ContractID INT, 

    ManagerID INT, 

   
); 

 

-- Create CallAgent table 

CREATE TABLE CallAgent ( 

    CallAgentID INT PRIMARY KEY, 

    PersonalDetailsID INT, 

    ClientID INT, 


); 

 

-- Create Technician table 

CREATE TABLE Technician ( 

    TechnicianID INT PRIMARY KEY, 

    EmployeeID INT, 

    JobID INT, 

 

); 

 

-- Create Employee table 

CREATE TABLE Employee ( 

    EmployeeID INT PRIMARY KEY, 

    PersonalDetailsID INT, 

); 

 

-- Create Managers table 

CREATE TABLE Managers ( 

    ManagerID INT PRIMARY KEY, 

    EmployeeID INT, 

    LoginID INT, 


); 

 

-- Create Login table 

CREATE TABLE Login ( 

    LoginID INT PRIMARY KEY, 

    LastName VARCHAR(255), 

    EmployeeID INT, 

 

); 

