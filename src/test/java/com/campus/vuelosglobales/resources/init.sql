CREATE DATABASE IF NOT EXISTS VuelosGlobales;
USE VuelosGlobales;

CREATE TABLE airport_country (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);

CREATE TABLE airport_city (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    country_id VARCHAR(5),
    FOREIGN KEY (country_id) REFERENCES airport_country(id)
);

CREATE TABLE airport_documenttype (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE airport_airline (
    id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);

CREATE TABLE airport_airport (
    id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    city_id VARCHAR(5),
    FOREIGN KEY (city_id) REFERENCES airport_city(id)
);

CREATE TABLE airport_gate (
    id INT PRIMARY KEY,
    name VARCHAR(10),
    airport_id VARCHAR(5),
    FOREIGN KEY (airport_id) REFERENCES airport_airport(id)
);

CREATE TABLE airport_manufacture (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE airport_model (
    id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    manufacture_id INT,
    FOREIGN KEY (manufacture_id) REFERENCES airport_manufacture(id)
);

CREATE TABLE airport_tripulatrole (
    id INT PRIMARY KEY,
    name VARCHAR(40) NOT NULL
);

CREATE TABLE airport_status (
    id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL
);

CREATE TABLE airport_plane (
    id INT PRIMARY KEY,
    registration VARCHAR(30),
    capacity INT,
    fabrication_date DATE,
    status_id INT,
    model_id INT,
    FOREIGN KEY (status_id) REFERENCES airport_status(id),
    FOREIGN KEY (model_id) REFERENCES airport_model(id)
);

CREATE TABLE airport_employee (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    position INT,
    ingressdate DATE,
    airline_id INT,
    airport_id VARCHAR(5),
    FOREIGN KEY (position) REFERENCES airport_tripulatrole(id),
    FOREIGN KEY (airline_id) REFERENCES airport_airline(id),
    FOREIGN KEY (airport_id) REFERENCES airport_airport(id)
);

CREATE TABLE airport_revision (
    id INT PRIMARY KEY,
    date DATE,
    plane_id INT,
    FOREIGN KEY (plane_id) REFERENCES airport_plane(id)
);

CREATE TABLE airport_revisiondetail (
    id VARCHAR(20) PRIMARY KEY,
    description TEXT,
    employee_id VARCHAR(20),
    FOREIGN KEY (employee_id) REFERENCES airport_employee(id)
);

CREATE TABLE airport_revemployee (
    employee_id VARCHAR(20),
    revision_id INT,
    PRIMARY KEY (employee_id, revision_id),
    FOREIGN KEY (employee_id) REFERENCES airport_employee(id),
    FOREIGN KEY (revision_id) REFERENCES airport_revision(id)
);

CREATE TABLE airport_trip (
    id INT PRIMARY KEY,
    date DATE,
    price DOUBLE
);

CREATE TABLE airport_flightconnection (
    id INT PRIMARY KEY,
    flight_number VARCHAR(20),
    trip_id INT,
    plane_id INT,
    airport_id VARCHAR(5),
    FOREIGN KEY (trip_id) REFERENCES airport_trip(id),
    FOREIGN KEY (plane_id) REFERENCES airport_plane(id),
    FOREIGN KEY (airport_id) REFERENCES airport_airport(id)
);

CREATE TABLE airport_flightfare (
    id INT PRIMARY KEY,
    name VARCHAR(20),
    details TEXT,
    price DOUBLE(7,3)
);

CREATE TABLE airport_customer (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    age INT,
    document_type_id INT,
    FOREIGN KEY (document_type_id) REFERENCES airport_documenttype(id)
);

CREATE TABLE airport_tripbooking (
    id INT PRIMARY KEY,
    date DATE,
    trip_id INT,
    FOREIGN KEY (trip_id) REFERENCES airport_trip(id)
);

CREATE TABLE airport_tripbookingdetail (
    id INT PRIMARY KEY,
    tripbooking_id INT,
    customer_id VARCHAR(20),
    flightfare_id INT,
    FOREIGN KEY (tripbooking_id) REFERENCES airport_tripbooking(id),
    FOREIGN KEY (customer_id) REFERENCES airport_customer(id),
    FOREIGN KEY (flightfare_id) REFERENCES airport_flightfare(id)
);

CREATE TABLE airport_tripcrew (
    employee_id VARCHAR(20),
    flightconnection_id INT,
    PRIMARY KEY (employee_id, flightconnection_id),
    FOREIGN KEY (employee_id) REFERENCES airport_employee(id),
    FOREIGN KEY (flightconnection_id) REFERENCES airport_flightconnection(id)
);