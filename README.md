# Online Bookstore Project with SOLID Principles

![Bookstore Image](bookstore_image.jpg)

## Table of Contents

- [Introduction](#introduction)
- [SOLID Principles](#solid-principles)
- [Project Overview](#project-overview)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [How to Run](#how-to-run)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Welcome to the Online Bookstore project! This project is a demonstration of how SOLID principles are applied in object-oriented software design to create a more maintainable, flexible, and understandable online bookstore system.

## SOLID Principles

SOLID is a set of five object-oriented design principles that guide the development of software with an emphasis on modularity and maintainability. Here's how these principles are applied in our project:

### 1. Single Responsibility Principle (SRP)

- **Book**: The `Book` class has a single responsibility for representing book attributes and calculating the final price.

- **Customer**: The `Customer` class represents customers and their shopping carts, adhering to the SRP by managing customer-related functionality.

- **Shopping Cart**: The `ShoppingCart` class manages the shopping cart functionality with a focus on cart operations.

### 2. Open-Closed Principle (OCP)

- The project is designed to be open for extension and closed for modification. New classes and features can be added without altering existing code.

### 3. Liskov Substitution Principle (LSP)

- Derived classes (if any) can be substituted for their base classes without affecting the correctness of the program. For example, a `Book` object can be substituted for a `ProductInterface` object.

### 4. Interface Segregation Principle (ISP)

- Interfaces are designed to be specific to the needs of clients. For example, the `CustomerInterface` provides methods for checking items in the catalog and adding items to the cart, tailored to customer roles.

### 5. Dependency Inversion Principle (DIP)

- Dependencies are abstracted through interfaces and injected, allowing for flexible and testable code. For instance, the `Order` class depends on interfaces for payment processing and shopping cart management.

## Project Overview

In this project, we have created a basic online bookstore system with SOLID principles in mind. The system includes:

- **Book**: Represents a book with specific attributes and pricing.

- **Customer**: Represents customers with different roles (e.g., admin, buyer) and shopping carts.

- **Shopping Cart**: Manages shopping cart functionality, such as adding and removing items.

- **Payment Gateway**: Handles payment processing securely.

- **BookCatalog**: Provides a catalog of available books and allows for searching and getting book details.

- **Order**: Represents a customer's order, including customer information, selected books, and order summary generation.

## Project Structure

The project is structured into the following modules/packages:

- **client**: Contains code related to the user interface and interactions.
- **domain**: Contains the core domain logic and entities.
  - **factory**: Contains factories for creating objects.
  - **models**: Contains the main entity classes.

## Technologies Used

- Python (programming language)
- Git (version control)
- GitHub (hosting the project repository)

## How to Run

To run the project locally, follow these steps:

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/yourusername/online-bookstore.git
