# Blog Summarization Project with Cohere API
This project is a Spring Boot application that integrates with the Cohere API to summarize blog content. The application allows users to submit blog content, which is then summarized using Cohere's text generation model.

# Prerequisites
Before running the project, ensure you have the following installed:

Java 17+ (for Spring Boot)

Maven (to build the project)

Spring Boot (already included in the project dependencies)

PostgreSQL (or any database you choose)

Cohere API Key (for text summarization)

## Step 1: Set up the Cohere API Key
Sign up at Cohere and obtain your API key.

Replace the COHERE_API_KEY value in AIService.java with your Cohere API key:


``
private static final String COHERE_API_KEY = "your-cohere-api-key"; 
``

## Step 2: Set up the Database (PostgreSQL) Ensure you have PostgreSQL running on your local machine or use a cloud-based PostgreSQL service.

Create Database: Create a database in PostgreSQL :

``
CREATE DATABASE <NAME>; 
``

Configure the Database: Update application.properties to configure PostgreSQL connection:

``
spring.datasource.url=jdbc:postgresql://localhost:5432/<NAME OF THE DATABASE>
spring.datasource.username=postgres spring.datasource.password=<YOUR POSTGRE PASS>
``

## Step 3: Build the Project
Open the terminal and navigate to the project directory.

Run the following Maven command to build the project:

``
mvn clean install
``

## Step 4: Run the Application
Once the project is built successfully, run the application using:

``
mvn spring-boot:run 
``

Your application will start running on http://localhost:8080.

## Step 5: Test the API

For testing , use the following API Collection to test -> https://drive.google.com/file/d/13DlXOYxcAP4I731MTTAJ6QflONs2iv1t/view?usp=sharing

## Step 6: Set up Docker for the Application

Create the Docker Image: First, build the Docker image for your application. Open the terminal in your project directory and run the following command:

``
docker build -t blog-app .
``

Run the Docker Container: After the image is built, run the application in a Docker container with the following command:

``
docker run -p 8080:8080 blog-app
``

This will start the application on `` http://localhost:8080. ``

Verify the Application: After running the container, you can verify that the application is running by visiting ``http://localhost:8080`` in your browser or using Postman to test the API.
