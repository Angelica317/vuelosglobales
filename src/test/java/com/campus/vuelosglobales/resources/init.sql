CREATE DATABASE IF NOT EXISTS VuelosGlobales;
USE VuelosGlobales;

-- Tablas independientes primero
CREATE TABLE airport_countries (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);

CREATE TABLE airport_documenttypes (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE airport_airlines (
    id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);

CREATE TABLE airport_manufactures (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE airport_tripulatroles (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE airport_statuses (
    id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);

-- Tablas con una dependencia
CREATE TABLE airport_cities (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    country_id VARCHAR(5),
    FOREIGN KEY (country_id) REFERENCES airport_countries(id)
);

CREATE TABLE airport_models (
    id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    manufacture_id INT,
    FOREIGN KEY (manufacture_id) REFERENCES airport_manufactures(id)
);

-- Tablas con dos o más dependencias
CREATE TABLE airport_airports (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    city_id VARCHAR(5),
    FOREIGN KEY (city_id) REFERENCES airport_cities(id)
);

CREATE TABLE airport_planes (
    id INT PRIMARY KEY,
    registration VARCHAR(30),
    capacity INT,
    fabrication_date DATE,
    status_id INT,
    model_id INT,
    FOREIGN KEY (status_id) REFERENCES airport_statuses(id),
    FOREIGN KEY (model_id) REFERENCES airport_models(id)
);

CREATE TABLE airport_employees (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    position INT,
    ingressdate DATE,
    airline_id INT,
    airport_id VARCHAR(5),
    FOREIGN KEY (position) REFERENCES airport_tripulatroles(id),
    FOREIGN KEY (airline_id) REFERENCES airport_airlines(id),
    FOREIGN KEY (airport_id) REFERENCES airport_airports(id)
);

CREATE TABLE airport_gates (
    id INT PRIMARY KEY,
    name VARCHAR(10),
    airport_id VARCHAR(5),
    FOREIGN KEY (airport_id) REFERENCES airport_airports(id)
);

CREATE TABLE airport_revisions (
    id INT PRIMARY KEY,
    date DATE,
    plane_id INT,
    FOREIGN KEY (plane_id) REFERENCES airport_planes(id)
);

CREATE TABLE airport_revisiondetails (
    id VARCHAR(20) PRIMARY KEY,
    description TEXT,
    employee_id VARCHAR(20),
    FOREIGN KEY (employee_id) REFERENCES airport_employees(id)
);

CREATE TABLE airport_revemployees (
    employee_id VARCHAR(20),
    revision_id INT,
    PRIMARY KEY (employee_id, revision_id),
    FOREIGN KEY (employee_id) REFERENCES airport_employees(id),
    FOREIGN KEY (revision_id) REFERENCES airport_revisions(id)
);

CREATE TABLE airport_trips (
    id INT PRIMARY KEY,
    date DATE,
    price DOUBLE
);

CREATE TABLE airport_flightconnections (
    id INT PRIMARY KEY,
    flight_number VARCHAR(20),
    trip_id INT,
    plane_id INT,
    airport_id VARCHAR(5),
    FOREIGN KEY (trip_id) REFERENCES airport_trips(id),
    FOREIGN KEY (plane_id) REFERENCES airport_planes(id),
    FOREIGN KEY (airport_id) REFERENCES airport_airports(id)
);

CREATE TABLE airport_flightfares (
    id INT PRIMARY KEY,
    name VARCHAR(20),
    details TEXT,
    price DOUBLE(7,3)
);

CREATE TABLE airport_customers (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    age INT,
    document_type_id INT,
    FOREIGN KEY (document_type_id) REFERENCES airport_documenttypes(id)
);

CREATE TABLE airport_tripbookings (
    id INT PRIMARY KEY,
    date DATE,
    trip_id INT,
    FOREIGN KEY (trip_id) REFERENCES airport_trips(id)
);

CREATE TABLE airport_tripbookingdetails (
    id INT PRIMARY KEY,
    tripbooking_id INT,
    customer_id VARCHAR(20),
    flightfare_id INT,
    FOREIGN KEY (tripbooking_id) REFERENCES airport_tripbookings(id),
    FOREIGN KEY (customer_id) REFERENCES airport_customers(id),
    FOREIGN KEY (flightfare_id) REFERENCES airport_flightfares(id)
);

CREATE TABLE airport_tripcrews (
    employee_id VARCHAR(20),
    flightconnection_id INT,
    PRIMARY KEY (employee_id, flightconnection_id),
    FOREIGN KEY (employee_id) REFERENCES airport_employees(id),
    FOREIGN KEY (flightconnection_id) REFERENCES airport_flightconnections(id)
);