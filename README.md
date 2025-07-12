A simple Spring Boot application for managing a library's book catalog with RESTful APIs and MySQL integration.



### Pre-requistics
1. Java Development Kit (JDK 21 or higher)

2. Apache Maven 3.8+

3. MySQL Server (version 8.x recommended)

4. GUI tools (optional): MySQL Workbench or MySQL Shell

5.  IDE (Recommended): IntelliJ IDEA (with Spring support)

6.  Spring Boot version used: 3.5.3





##  How to Run the Project

### 1. Clone the repository

on your git bash, please enter the following commands:

a) *git clone https://github.com/whoa12/Library-Management.git*

b) *cd Library-Management*

### 2. Configure the Database

Before running the application, please make sure that you have MySQL installed and running on your system.

Then, create a database named librarydb. You can do this either in MySQL Workbench or using MySQL Shell:

*CREATE DATABASE librarydb;*


###   3. Configure Credentials & Run the Application

In Git Bash (from inside the project directory), run:

*export DB_USERNAME=your_username && export DB_PASSWORD=your_password && mvn spring-boot:run*
Please replace the placeholders with your actual MySQL username and password.



### 4. Endpoints:
Here are the main API endpoints you can try out:

POST	        /book/add	                               Add a new book
GET	          /book/list	                             Retrieve a list of all books
GET	          /book/{bookId}	                         Get details of a specific book
PUT	          /book/{bookId}/update	                   Update book availability
DELETE	      /book/{bookId}/delete	                   Delete a book by ID



### Postman Screenshots:

a) Adding a new book:
![image alts](https://github.com/whoa12/Library-Management/blob/main/Screenshot%20(103).png?raw=true)

b) Getting all books:
![image alt](https://github.com/whoa12/Library-Management/blob/main/Screenshot%20(104).png?raw=true)

c) get details of a specific book
![image alt](https://github.com/whoa12/Library-Management/blob/main/Screenshot%20(105).png?raw=true)

d) updating the availibility of a book
![image alt](https://github.com/whoa12/Library-Management/blob/main/Screenshot%20(106).png?raw=true)

e) deleting a book
![image alt](https://github.com/whoa12/Library-Management/blob/main/Screenshot%20(107).png?raw=true)

d) Input validation on an invalid request:

Book with the given id is not found:
![image alt](https://github.com/whoa12/Library-Management/blob/main/Screenshot%20(108).png?raw=true)

When incomplete details of a book are given as an input
![image alt](https://github.com/whoa12/Library-Management/blob/main/Screenshot%20(109).png?raw=true)


### Postman collection link: [View Collection](https://anshulpathak-4414537.postman.co/workspace/Anshul-Pathak's-Workspace~0f41530e-0ef1-47f6-8705-cc3dfc6ac776/collection/46707845-ea9f497f-df5d-43ee-b3fe-92c6f43c1422?action=share&creator=46707845)





