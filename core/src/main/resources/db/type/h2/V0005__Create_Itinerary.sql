    CREATE TABLE Itinerary ( 
      id BIGINT NOT NULL AUTO_INCREMENT,  
      modificationCounter INTEGER NOT NULL,     
      name VARCHAR(255),
      Desc VARCHAR(2000),
      creationDate TIMESTAMP,      
      CONSTRAINT PK_Itinerary PRIMARY KEY(id)     
    );
    
    CREATE TABLE ActivityType ( 
      id BIGINT NOT NULL AUTO_INCREMENT,  
      modificationCounter INTEGER NOT NULL,
      name VARCHAR(255),
      active BOOLEAN,
      CONSTRAINT PK_ActivityType PRIMARY KEY(id)      
    );
    
    CREATE TABLE ActivityStatus ( 
      id BIGINT NOT NULL AUTO_INCREMENT,  
      modificationCounter INTEGER NOT NULL,
      name VARCHAR(255),
      desc VARCHAR(2000),
      CONSTRAINT PK_ActivityStatus PRIMARY KEY(id)      
    );
    
    CREATE TABLE Activity ( 
      id BIGINT NOT NULL AUTO_INCREMENT,  
      modificationCounter INTEGER NOT NULL,
      idItinerary  BIGINT NOT NULL,
      idActType BIGINT NOT NULL,
      idActStatus BIGINT NOT NULL,
      name VARCHAR(255),
      desc VARCHAR(2000),
      priority BIGINT,     
      CONSTRAINT PK_Activity PRIMARY KEY(id),
      CONSTRAINT FK_Activity_idActType FOREIGN KEY(idActType) REFERENCES ActivityType(id) NOCHECK,
      CONSTRAINT FK_Activity_idItinerary FOREIGN KEY(idItinerary) REFERENCES Itinerary(id) NOCHECK,
      CONSTRAINT FK_Activity_idActStatus FOREIGN KEY(idActStatus) REFERENCES ActivityStatus(id) NOCHECK
    );    
    

    
    CREATE TABLE ServiceType ( 
      id BIGINT NOT NULL AUTO_INCREMENT,  
      modificationCounter INTEGER NOT NULL,
      name VARCHAR(255),
      desc VARCHAR(2000),
      active BOOLEAN,
      CONSTRAINT PK_ServiceType PRIMARY KEY(id)      
    );

    CREATE TABLE ServiceRegistration ( 
      id BIGINT NOT NULL AUTO_INCREMENT,  
      modificationCounter INTEGER NOT NULL,
      idServiceType BIGINT NOT NULL,
      name VARCHAR(255),
      desc VARCHAR(2000),
      latitude DOUBLE,
      longitude DOUBLE,
      serviceUrl VARCHAR(2000),
      address VARCHAR(3000),
      CONSTRAINT PK_ServiceRegistration PRIMARY KEY(id),
      CONSTRAINT FK_ServiceRegistration_idServiceType FOREIGN KEY(idServiceType) REFERENCES ServiceType(id) NOCHECK      
    );
    
    