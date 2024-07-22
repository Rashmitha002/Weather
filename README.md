
# Weather Report Application

## Overview
The Weather Report Application provides real-time weather information for cities worldwide. It consists of a backend built with Spring Boot and a frontend developed using Angular. The application displays current, historical, and forecast weather data.

## Features
- Display current weather data
- View historical weather data
- Access weather forecasts
- User-friendly interface

## Technologies Used
### Backend
- **Spring Boot**: Java-based framework for creating RESTful APIs
- **Weather API**: Provides real-time, historical, and forecast weather data

### Frontend
- **Angular**: Frontend framework for building the user interface
- **HTML/CSS**: Markup and styling for the application

## Setup and Installation

### Prerequisites
- Java Development Kit (JDK) 17
- Node.js and npm (Node Package Manager)
- Angular CLI

### Backend Setup
1. Clone the repository:
    
    git clone [<repository-url>](https://github.com/Rashmitha002/Weather.git)
   
2. Navigate to the backend directory:
   
    cd WeatherAppBackend
   
3. Build the project using Maven:
   
    mvn clean install
   
4. Run the Spring Boot application:
   
    mvn spring-boot:run
    

### Frontend Setup
1. Navigate to the frontend directory:
   
    cd WeatherApplicationFrontEnd
  
2. Install the dependencies:
  
    npm install
    
3. Start the Angular application:
  
    ng serve
    

## Usage
- Open your web browser and go to `http://localhost:4200`
- Enter a city name to get the weather report
- Navigate through tabs to view current, historical, and forecast weather data

## API Endpoints
### Current Weather
- **Endpoint**: `/api/weather/current`
- **Method**: GET
- **Description**: Retrieves the current weather data for a specified city.

### Historical Weather
- **Endpoint**: `/api/weather/historical`
- **Method**: GET
- **Description**: Retrieves historical weather data for a specified city and date range.

### Weather Forecast
- **Endpoint**: `/api/weather/forecast`
- **Method**: GET
- **Description**: Retrieves weather forecast data for a specified city.

## Contributing
1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a new Pull Request



## Contact
For any queries or feedback, please contact [rashmitha.js@hitachids.com].
