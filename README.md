# Online Store Project with Creational Design Patterns

![Store Image](store_image.jpg)

## Table of Contents

- [Introduction](#introduction)
- [Objectives](#objectives)
- [Creational Design Patterns](#creational-design-patterns )
- [Structural Design Patterns](#structural-design-patterns )
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
4. Study and understand the Structural Design Patterns.
5. As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user.
6. Implement some additional functionalities, or create a new project using structural design patterns.

## Creational Design Patterns

Creational design patterns are a category of design patterns that focus on the process of object creation. They provide ways to create objects in a flexible and controlled manner, enhancing code modularity and maintainability. In this project, we have implemented several creational design patterns, including:

- Factory Method
- Singleton
- Builder
- Prototype

## Structural Design Patterns

Structural design patterns are a category of design patterns that focus on the composition of classes and objects to form larger structures and systems. They provide a way to organize objects and classes in a way that is both flexible and efficient, while allowing for the reuse and modification of existing code. Structural design patterns address common problems encountered in the composition of classes and objects, such as how to create new objects that inherit functionality from existing objects, how to create objects that share functionality without duplicating code, or how to define relationships between objects in a flexible and extensible way.

- Adapter
- Bridge
- Composite

## Project Overview

In this project, we have created an Online Store system that incorporates various creational design patterns to manage product creation, payment options, and catalog management. Here's an overview of the main components:

- **Product Factory**: Utilizes the Factory Method pattern to create different types of products, such as books and electronics.

- **Singleton Catalog**: Demonstrates the Singleton pattern for managing a catalog of products. It ensures there is a single instance of the catalog throughout the application.

- **Payment Options**: The project implements Builder patterns for creating Visa and MasterCard payment options. The builder allows flexible configuration of payment details.

- **Product Interface**: The project defines a common product interface that products like books and electronics implement. It also includes a `clone` method to create product clones using the Prototype pattern.

- **Bridge**: The Bridge pattern is applied to decouple the abstraction (e.g., promotions) from its implementation. In the Online Store project, we use the Bridge pattern to separate the abstraction of promotions from their specific implementations.

- **Adapter** The Adapter pattern is used to allow the system to work with classes that have incompatible interfaces. In the Online Store project, the Adapter pattern can be applied to adapt user notification services with various channels (e.g., email, SMS, push notifications).

- **Composite** The Composite pattern is beneficial in scenarios where you need to treat both individual objects and compositions of objects uniformly.

## Project Structure

The project is organized into the following modules/packages:

- **client**: Contains code related to the user interface and interactions.
- **domain**: Contains the core domain logic and entities.
  - **factory**: Houses factories for creating objects.
  - **models**: Contains the primary entity classes.

## Technologies Used

- Java (programming language)
- Git (version control)
- GitHub (hosting the project repository)

## How to Run

To run the project locally, follow these steps:

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/yourusername/online-store.git
