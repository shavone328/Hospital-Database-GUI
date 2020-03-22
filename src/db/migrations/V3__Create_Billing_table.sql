CREATE TABLE Billing(
    VisitID INT PRIMARY KEY,
    VisitType VARCHAR(30) NOT NULL,
    CoPay INT NOT NULL,
    DateofVisit VARCHAR(30) NOT NULL,
    DoctorID INT NOT NULL,
    FOREIGN KEY (DoctorID) REFERENCES Doctors(DoctorID) ON DELETE CASCADE,
    PatientID INT NOT NULL,
    FOREIGN KEY (PatientID) REFERENCES Patients(PatientID) ON DELETE CASCADE
);