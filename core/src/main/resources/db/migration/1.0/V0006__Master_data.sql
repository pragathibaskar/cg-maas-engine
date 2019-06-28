
Insert INTO ActivityType (id, modificationCounter, name , active) values (1, 0, 'Parking', true);
Insert INTO ActivityType (id, modificationCounter, name , active) values (2, 0, 'Entertainment', true);
Insert INTO ActivityType (id, modificationCounter, name , active) values (3, 0, 'FoodnRetail', true);

Insert INTO ServiceType (id, modificationCounter, name , desc, active) values (1, 0, 'Parking', 'Parking Service',true);
Insert INTO ServiceType (id, modificationCounter, name , desc, active) values (2, 0, 'Entertainment', 'Entertainment Service', true);
Insert INTO ServiceType (id, modificationCounter, name , desc, active) values (3, 0, 'FoodnRetail', 'FoodnRetail Service', true);


Insert INTO ActivityStatus (id, modificationCounter, name , desc) values (1, 0, 'PENDING', 'Acivity Pending');
Insert INTO ActivityStatus (id, modificationCounter, name , desc) values (2, 0, 'COMPLETE', 'Acivity Completed');

INSERT INTO Itinerary (id, modificationCounter, name, desc, creationDate) VALUES (1, 1, 'GoaTrip', 'Blr to Goa', CURRENT_TIMESTAMP + (60 * 60 * 24 * 5));

INSERT INTO Activity (id, modificationCounter, name, desc, idActType, idActStatus, priority, idItinerary) VALUES (1, 1, 'Book Parking', 'Book Parking space', 1 ,1, 1, 1);
INSERT INTO Activity (id, modificationCounter, name, desc, idActType, idActStatus, priority, idItinerary) VALUES (2, 1, 'Book Entertainment', 'Book Entertainment ticket', 2, 1, 2, 1);


INSERT INTO ServiceRegistration (id, modificationCounter, name, desc, idServiceType, latitude, longitude, serviceUrl, address) VALUES (1, 0, 'WhitefieldParkingService', 'Parking Service : whitefield', 1, 9.1234567, 3.1234567, 'http://dummyserviceurl/parkingservice', 'DTP ,whitefield, BLR');
INSERT INTO ServiceRegistration (id, modificationCounter, name, desc, idServiceType, latitude, longitude, serviceUrl, address) VALUES (2, 0, 'WhitefieldEntertainmentService', 'Form Mall Showtimes : whitefield', 2, 9.1234567, 3.1234567, 'http://dummyserviceurl/entertainmentservice', 'VarthurRoad, whitefield, BLR');
INSERT INTO ServiceRegistration (id, modificationCounter, name, desc, idServiceType, latitude, longitude, serviceUrl, address) VALUES (3, 0, 'WhitefieldFoodnRetailService', 'FoodnRetail Service : whitefield', 2, 9.1234567, 3.1234567, 'http://dummyserviceurl/foodnretailservice', 'VarthurRoad, whitefield, BLR');