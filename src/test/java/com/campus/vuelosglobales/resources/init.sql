CREATE DATABASE IF NOT EXISTS VuelosGlobales;
USE VuelosGlobales;

-- Tablas independientes primero
CREATE TABLE countries (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);

CREATE TABLE documenttypes (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE airlines (
    id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);

CREATE TABLE manufactures (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE tripulatroles (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE statuses (
    id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);

-- Tablas con una dependencia
CREATE TABLE cities (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    country_id VARCHAR(5),
    FOREIGN KEY (country_id) REFERENCES countries(id)
);

CREATE TABLE models (
    id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    manufacture_id INT,
    FOREIGN KEY (manufacture_id) REFERENCES manufactures(id)
);

-- Tablas con dos o más dependencias
CREATE TABLE airports (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    city_id VARCHAR(5),
    FOREIGN KEY (city_id) REFERENCES cities(id)
);

CREATE TABLE planes (
    id INT PRIMARY KEY,
    registration VARCHAR(30),
    capacity INT,
    fabrication_date DATE,
    status_id INT,
    model_id INT,
    FOREIGN KEY (status_id) REFERENCES statuses(id),
    FOREIGN KEY (model_id) REFERENCES models(id)
);

CREATE TABLE employees (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    position INT,
    ingressdate DATE,
    airline_id INT,
    airport_id VARCHAR(5),
    FOREIGN KEY (position) REFERENCES tripulatroles(id),
    FOREIGN KEY (airline_id) REFERENCES airlines(id),
    FOREIGN KEY (airport_id) REFERENCES airports(id)
);

CREATE TABLE gates (
    id INT PRIMARY KEY,
    name VARCHAR(10),
    airport_id VARCHAR(5),
    FOREIGN KEY (airport_id) REFERENCES airports(id)
);

CREATE TABLE revisions (
    id INT PRIMARY KEY,
    date DATE,
    plane_id INT,
    FOREIGN KEY (plane_id) REFERENCES planes(id)
);

CREATE TABLE revisiondetails (
    id VARCHAR(20) PRIMARY KEY,
    description TEXT,
    employee_id VARCHAR(20),
    FOREIGN KEY (employee_id) REFERENCES employees(id)
);

CREATE TABLE revemployees (
    employee_id VARCHAR(20),
    revision_id INT,
    PRIMARY KEY (employee_id, revision_id),
    FOREIGN KEY (employee_id) REFERENCES employees(id),
    FOREIGN KEY (revision_id) REFERENCES revisions(id)
);

CREATE TABLE trips (
    id INT PRIMARY KEY,
    date DATE,
    price DOUBLE
);

CREATE TABLE flightconnections (
    id INT PRIMARY KEY,
    flight_number VARCHAR(20),
    trip_id INT,
    plane_id INT,
    airport_id VARCHAR(5),
    FOREIGN KEY (trip_id) REFERENCES trips(id),
    FOREIGN KEY (plane_id) REFERENCES planes(id),
    FOREIGN KEY (airport_id) REFERENCES airports(id)
);

CREATE TABLE flightfares (
    id INT PRIMARY KEY,
    name VARCHAR(20),
    details TEXT,
    price DOUBLE(7,3)
);

CREATE TABLE customers (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    age INT,
    document_type_id INT,
    FOREIGN KEY (document_type_id) REFERENCES documenttypes(id)
);

CREATE TABLE tripbookings (
    id INT PRIMARY KEY,
    date DATE,
    trip_id INT,
    FOREIGN KEY (trip_id) REFERENCES trips(id)
);

CREATE TABLE tripbookingdetails (
    id INT PRIMARY KEY,
    tripbooking_id INT,
    customer_id VARCHAR(20),
    flightfare_id INT,
    FOREIGN KEY (tripbooking_id) REFERENCES tripbookings(id),
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    FOREIGN KEY (flightfare_id) REFERENCES flightfares(id)
);

CREATE TABLE tripcrews (
    employee_id VARCHAR(20),
    flightconnection_id INT,
    PRIMARY KEY (employee_id, flightconnection_id),
    FOREIGN KEY (employee_id) REFERENCES employees(id),
    FOREIGN KEY (flightconnection_id) REFERENCES flightconnections(id)
);

-- Datos de prueba para `countries`
INSERT INTO `countries` (`id`, `name`) VALUES
(1, 'United States'),
(2, 'Canada'),
(3, 'Mexico');

-- Datos de prueba para `cities`
INSERT INTO `cities` (`id`, `name`, `country_id`) VALUES
(1, 'New York', 1),
(2, 'Toronto', 2),
(3, 'Mexico City', 3);

-- Datos de prueba para `airports`
INSERT INTO `airports` (`id`, `name`, `id_city`) VALUES
(1, 'John F. Kennedy International Airport', 1),
(2, 'Toronto Pearson International Airport', 2),
(3, 'Mexico City International Airport', 3);

-- Datos de prueba para `airlines`
INSERT INTO `airlines` (`id`, `name`) VALUES
(1, 'Delta Air Lines'),
(2, 'Air Canada'),
(3, 'Aeroméxico');

-- Datos de prueba para `planes`
INSERT INTO `planes` (`id`, `capacity`, `fabrication_date`, `plates`, `model_id`, `status_id`) VALUES
(1, 180, '2010-05-15', 'N12345', 1, 1),
(2, 200, '2012-08-23', 'C67890', 2, 1),
(3, 220, '2015-12-10', 'M54321', 3, 2);

-- Datos de prueba para `manufacturers`
INSERT INTO `manufacturers` (`id`, `name`) VALUES
(1, 'Boeing'),
(2, 'Airbus'),
(3, 'Embraer');

-- Datos de prueba para `models`
INSERT INTO `models` (`id`, `name`, `manufacturer_id`) VALUES
(1, '737', 1),
(2, 'A320', 2),
(3, 'E190', 3);

-- Datos de prueba para `statuses`
INSERT INTO `statuses` (`id`, `name`) VALUES
(1, 'Active'),
(2, 'Maintenance');

-- Datos de prueba para `employees`
INSERT INTO `employees` (`id`, `ingres_date`, `name`, `airline_id`, `airport_id`, `tripulantrole_id`) VALUES
(1, '2018-06-01', 'John Doe', 1, 1, 1),
(2, '2019-09-15', 'Jane Smith', 2, 2, 2),
(3, '2020-11-30', 'Carlos Hernández', 3, 3, 3);

-- Datos de prueba para `tripulantroles`
INSERT INTO `tripulantroles` (`id`, `description`, `name`) VALUES
(1, 'Pilot', 'Pilot'),
(2, 'Flight Attendant', 'Attendant'),
(3, 'Mechanic', 'Mechanic');

-- Datos de prueba para `revisions`
INSERT INTO `revisions` (`id`, `revision_date`, `plane_id`) VALUES
(1, '2023-01-10', 1),
(2, '2023-02-20', 2),
(3, '2023-03-15', 3);

-- Datos de prueba para `revemployees`
INSERT INTO `revemployees` (`employee_id`, `revision_id`) VALUES
(1, 1),
(2, 2),
(3, 3);

-- Datos de prueba para `revisiondetails`
INSERT INTO `revisiondetails` (`id`, `description`, `employee_id`, `revision_id`) VALUES
(1, 'Engine check', 1, 1),
(2, 'Landing gear maintenance', 2, 2),
(3, 'Cabin inspection', 3, 3);

-- Datos de prueba para `flightconnections`
INSERT INTO `flightconnections` (`id`, `connection_number`, `airport_id`, `plane_id`, `trip_id`) VALUES
(1, 'DL100', 1, 1, 1),
(2, 'AC200', 2, 2, 2),
(3, 'AM300', 3, 3, 3);

-- Datos de prueba para `trips`
INSERT INTO `trips` (`id`, `price_trip`, `trip_date`, `employee_id`) VALUES
(1, 500.00, '2024-07-01', 1),
(2, 450.00, '2024-07-15', 2),
(3, 400.00, '2024-08-05', 3);

-- Datos de prueba para `tripcrews`
INSERT INTO `tripcrews` (`connection_id`, `employee_id`) VALUES
(1, 1),
(2, 2),
(3, 3);

-- Datos de prueba para `customers`
INSERT INTO `customers` (`id`, `email`, `first_name`, `last_name`, `phone`) VALUES
(1, 'john@example.com', 'John', 'Doe', '123-456-7890'),
(2, 'jane@example.com', 'Jane', 'Smith', '098-765-4321'),
(3, 'carlos@example.com', 'Carlos', 'Hernández', '567-890-1234');

-- Datos de prueba para `flightfares`
INSERT INTO `flightfares` (`id`, `description`, `details`, `value`) VALUES
(1, 'Economy', 'Standard seat', 200.00),
(2, 'Business', 'Business class seat', 500.00),
(3, 'First Class', 'Luxury seat', 1000.00);

-- Datos de prueba para `tripbookings`
INSERT INTO `tripbookings` (`id`, `date`, `trips_id`) VALUES
(1, '2024-06-20', 1),
(2, '2024-06-25', 2),
(3, '2024-06-28', 3);

-- Datos de prueba para `tripbookingdetails`
INSERT INTO `tripbookingdetails` (`id`, `trip_booking_detail_date`, `customers_id`, `fares_id`, `trip_booking_id`) VALUES
(1, '2024-06-20', 1, 1, 1),
(2, '2024-06-25', 2, 2, 2),
(3, '2024-06-28', 3, 3, 3);

-- Datos de prueba para `gates`
INSERT INTO `gates` (`id`, `gatenumber`, `airport_id`) VALUES
(1, 'A1', 1),
(2, 'B2', 2),
(3, 'C3', 3);

-- Datos de prueba para `documenttypes`
INSERT INTO `documenttypes` (`id`, `name`) VALUES
(1, 'Passport'),
(2, 'Driver License'),
(3, 'ID Card');
