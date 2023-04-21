
## User Management System


This is a Spring Boot project for managing user information. It provides RESTful endpoints for adding, getting, updating, and deleting users.

## FrameWorks and Language used
- Spring Boot
 - Maven
 - Java

## Features

- Add new users to the database
- Retrieve users by ID or retrieve all users
- Update a user's information
- Delete a user from the database

## Data Flow 
         
- Controller ->  The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part
- models -> Here the class user is defined and the whatever a user class will load. e.g -userId, userName, address, phone number etc.
- Services -> The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
- Repository -> Here database is stored, for which I have used arrayList. In the database layer, CRUD (create, read, update, delete) operations are performed.

## Data Structure Used in Project 
  - In our project ArrayList and the methods involved with ArrayList, like add method for posting new User, remove method for deleting a user, combination of add and remove method for update user and linear search function for searching a user in Java by specific userId.



## Project Summory
we have created a Spring Boot project for a User Management System with endpoints to add, get, update and delete users. The project uses Spring Web for building RESTful APIs . We have also used the MVC pattern to structure the code.

## Author 
Pooja Gurnule
## Contributing

If you would like to contribute to this project, please submit a pull request or report an issue on the GitHub repository.



