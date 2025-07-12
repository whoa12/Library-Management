##  How to Run the Project

### 1. Clone the repository

on your git bash, enter the following commands
a) *git clone https://github.com/whoa12/Library-Management.git*
b) *cd Library-Management*

### 2. Configure the Database
Before running the application, please make sure that you have MySQL installed and running on your system.
Then, create a database named librarydb. You can do this either in MySQL Workbench or using MySQL Shell:
*CREATE DATABASE librarydb;*


### 3.  3. Configure Credentials & Run the Application
In Git Bash (from inside the project directory), run:

*export DB_USERNAME=your_username && export DB_PASSWORD=your_password && mvn spring-boot:run*
Please replace the placeholders with your actual MySQL username and password.



### 3. Endpoints:
Here are the main API endpoints you can try out:

POST	        /book/add	                               Add a new book
GET	          /book/list	                             Retrieve a list of all books
GET	          /book/{bookId}	                         Get details of a specific book
PUT	          /book/{bookId}/update	                   Update book availability
DELETE	      /book/{bookId}/delete	                   Delete a book by ID

### Postman Screenshots:
Adding a new book:




