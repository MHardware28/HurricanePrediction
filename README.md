Hurricane Prediction System

A Java application that demonstrates two major software design patterns—Template Method and Command Pattern—through a simulated hurricane prediction workflow. The system models how weather data is fetched, processed, analyzed, and saved using clearly defined components.

Description

This project represents a simplified hurricane forecasting system. It uses object-oriented design to organize prediction tasks into reusable steps and encapsulated commands. Two prediction approaches are included: a Machine Learning Prediction and a Statistical Prediction, each following the same structured workflow.

The program also uses a command invoker that allows multiple commands to be added and executed in order, making the system scalable and easy to extend.

Design Patterns Used
Template Method Pattern

The HurricanePredictionTemplate abstract class defines the overall structure of the hurricane prediction workflow. The template method enforces the following sequence:

Fetch data

Preprocess data

Apply prediction model

Postprocess results

Subclasses such as MachineLearningPrediction and StatisticalPrediction implement their own versions of these steps, while still following the same overall process.

Command Pattern

Each major operation in the prediction pipeline is wrapped inside a command object.
Commands used in this system include:

Fetching weather data

Running the prediction model

Saving prediction results

The PredictionInvoker stores these commands and executes them in order. This allows the system to easily change, add, or reorder operations without modifying the core logic.

Class Overview
Main

Creates all prediction components, command objects, and receivers. Demonstrates machine learning and statistical predictions by running the template workflow.

HurricanePredictionTemplate

Defines the fixed algorithm structure for hurricane prediction through the template method. Ensures consistency across different prediction models.

MachineLearningPrediction & StatisticalPrediction

Concrete implementations of the template steps. Each class defines how data is fetched, preprocessed, analyzed, and finalized.

Command Classes

Includes FetchDataCommand, PredictionCommand, and SaveResultsCommand. Each command triggers an action on a receiver object, such as fetching data or saving results.

PredictionInvoker

Stores multiple commands and executes them in order. Allows flexible arrangement of tasks.

Receivers

WeatherDataFetcher handles data retrieval

PredictionModel applies the prediction logic

ResultSaver saves the processed results

These classes perform the actual work behind each command.

How the System Works

The Main class sets up prediction models and receiver objects.

Command objects are created to represent fetch, predict, and save actions.

Commands can be executed individually or managed by the invoker.

The Template Method executes the step-by-step prediction workflow for both the Machine Learning and Statistical models.
    
 
    

- Modular & Reusable Tasks: Commands can be reused across prediction strategies, making it easy to extend or modify.

---

## Project Structure

