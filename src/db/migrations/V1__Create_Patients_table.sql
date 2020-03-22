CREATE TABLE Patients(
    PatientID INT PRIMARY KEY,
    FirstName VARCHAR(30) NOT NULL,
    LastName VARCHAR(30) NOT NULL,
    DOB VARCHAR(10) NOT NULL,
    Gender VARCHAR(15) NOT NULL,
    Address VARCHAR(60) NOT NULL,
    PhoneNumber VARCHAR(15) NOT NULL,
    InsurancePlan VARCHAR (50) NOT NULL,
    MedicalHistory VARCHAR(300) NOT NULL,
    Medications VARCHAR(100) NOT NULL
);

