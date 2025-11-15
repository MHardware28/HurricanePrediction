# Hurricane Prediction Program
A Java application that demonstrates the implementation of two major design patterns (Template Method and Command Pattern) in a hurricane forecasting scenario. The system simulates collecting weather data, preprocessing it, running prediction models, and saving results.

This Java project predicts hurricanes using a structured, modular workflow. 
It demonstrates the use of the Template Method and Command design patterns to create reusable and flexible prediction tasks.

---
## Description
- This project is designed to model a simplified hurricane prediction workflow using object-oriented design principles. The system handles weather data retrieval, prediction execution, and results processing by using two structured design patterns commonly found in real-world software systems.

- The program includes two prediction approaches, Machine Learning and Statistical, each following the same steps using the Template Method Pattern. Operational tasks such as fetching data or saving results are encapsulated using the Command Pattern for flexibility and modularity.
  
## Design Patterns Implemented

- 1. Template Method Pattern

The HurricanePredictionTemplate abstract class defines the step-by-step structure of the prediction process:
- Fetch data
- Preprocess data
- Apply prediction model
- Postprocess results

Concrete classes (MachineLearningPrediction and StatisticalPrediction) implement these steps with their own customized behaviors.

- 2. Command Pattern - Operations in the prediction pipeline are encapsulated into separate command classes:
- FetchDataCommand — retrieves weather data
- PredictionCommand — triggers the prediction model
- SaveResultsCommand — saves or outputs prediction results

These commands are executed through a PredictionInvoker, allowing operations to be queued, rearranged, or extended without modifying core logic.

## Features
- Two prediction approaches: Machine Learning and Statistical
- Step-by-step hurricane prediction workflow using the Template Method Pattern
- Commands for data fetching, prediction execution, and saving results
- Invoker capable of storing and executing multiple commands
 
## Requirements
- Java Development Kit (JDK) 8 or higher
- No external libraries required

## Class Structure
1. Abstract Classes
- HurricanePredictionTemplate: Defines the template for all prediction workflows

2. Concrete Prediction Classes
- MachineLearningPrediction: Represents a machine-learning-based prediction
- StatisticalPrediction: Represents a statistical prediction approach

3. Command Pattern Classes
- HurricaneCommand: Interface for all commands
- FetchDataCommand: Executes data retrieval
- PredictionCommand: Executes prediction model
- SaveResultsCommand: Executes result saving

4. Invoker
- PredictionInvoker: Stores and executes commands in order

5. Receiver Classes
- WeatherDataFetcher: Fetches real or simulated weather data
- PredictionModel: Runs the prediction logic
- ResultSaver: Saves or outputs results

## Example Output -
```
===============================
Fetching the weather data: 
Predicting:
Saving these results: 
Machine Learning Prediction: 
 
Statistical Prediction:
===============================
```

- Modular & Reusable Tasks: Commands can be reused across prediction strategies, making it easy to extend or modify.

---

## Project Structure

