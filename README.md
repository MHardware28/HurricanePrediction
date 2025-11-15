# Hurricane Prediction Program

This Java project predicts hurricanes using a structured, modular workflow. 
It demonstrates the use of the Template Method and Command design patterns to create reusable and flexible prediction tasks.

---

## Features

- Template Method Pattern: Defines a standardized workflow for hurricane prediction:
  1. Fetch data
  2. Preprocess data
  3. Apply prediction model
  4. Post-process results

- Command Pattern: Encapsulates each step as an independent task:
  - FetchDataCommand – retrieves hurricane data
  - PredictionCommand – runs the prediction model
  - SaveResultsCommand – saves the results
  - Commands are executed by PredictionInvoker for flexibility

- Multiple Prediction Strategies:
  - StatisticalPrediction – uses historical data
  - MachineLearningPrediction – uses historical and real-time data
 
    

- Modular & Reusable Tasks: Commands can be reused across prediction strategies, making it easy to extend or modify.

---

## Project Structure

 
    

- Modular & Reusable Tasks: Commands can be reused across prediction strategies, making it easy to extend or modify.

---

## Project Structure

