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

