# Online Store Project with Creational Design Patterns

![Store Image](store_image.jpg)

## Table of Contents

- [Introduction](#introduction)
- [Objectives](#objectives)
- [Creational Design Patterns](#creational-design-patterns)
- [Project Overview](#project-overview)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [How to Run](#how-to-run)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Welcome to the Online Store project! This project is a practical implementation of Creational Design Patterns in object-oriented software design. The goal is to demonstrate the use of various creational design patterns to create flexible and controlled object instantiation mechanisms.

## Objectives

1. Study and understand Creational Design Patterns.
2. Choose a domain, define its main classes/models/entities, and select appropriate instantiation mechanisms.
3. Use creational design patterns for object instantiation in a sample project.

## Creational Design Patterns

Creational design patterns are a category of design patterns that focus on the process of object creation. They provide ways to create objects in a flexible and controlled manner, enhancing code modularity and maintainability. In this project, we have implemented several creational design patterns, including:

- Factory Method
- Singleton
- Builder
- Prototype

## Project Overview

In this project, we have created an Online Store system that incorporates various creational design patterns to manage product creation, payment options, and catalog management. Here's an overview of the main components:

- **Product Factory**: Utilizes the Factory Method pattern to create different types of products, such as books and electronics.

- **Singleton Catalog**: Demonstrates the Singleton pattern for managing a catalog of products. It ensures there is a single instance of the catalog throughout the application.

- **Payment Options**: The project implements Builder patterns for creating Visa and MasterCard payment options. The builder allows flexible configuration of payment details.

- **Product Interface**: The project defines a common product interface that products like books and electronics implement. It also includes a `clone` method to create product clones using the Prototype pattern.

## Project Structure

The project is organized into the following modules/packages:

- **client**: Contains code related to the user interface and interactions.
- **domain**: Contains the core domain logic and entities.
  - **factory**: Houses factories for creating objects.
  - **models**: Contains the primary entity classes.

## Technologies Used

- Python (programming language)
- Git (version control)
- GitHub (hosting the project repository)

## How to Run

To run the project locally, follow these steps:

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/yourusername/online-store.git
