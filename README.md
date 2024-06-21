User Management
The User Management API allows you to work with users' data. You can retrieve all users, get one user based on id, add new ones to the database, update the information of already existing one and delete them. This project is made in IntelliJ IDEA and uses MySQL Workbench 8.0 CE. The tools and their versions used are all listed in the pom.xml file. 

To start the project first you need to create a database with the name User_Management then in the application.properties file you should write the username and password which are correct for your database. 

Endpoints:
1.	Get all users
Endpoint : /users
Method: Get
Response: 
•	if there are users all users are showed;
•	if no users: 404 Not Found ;

2.	Get one user by id
Endpoint : /users/{id}
Method: Get
Response: 
•	if there is one user with that id it is shown;
•	if there is no user with that id: 404 Not Found and a message saying: "Could not find user " + id;

3.	Update user
Endpoint : /users/{id}
Method: Put
Request Body with JSON:
{
    "fName": "First",
    "lName": "Last",
    "dateOfBirth":"1940-03-20",
    "phoneNumber":"087546586",
    "email": "firstLa@ga" 
}
Response: 
•	if there is no user with that id: 404 Not Found and a message saying: "Could not find user " + id;
•	if something is missing from the body: 400 Bad Request
{
    "fName": "First",
    "lName": "Last",
    "dateOfBirth":"1940-03-20",
    "email": "firstLa@ga" 
} 
•	if the email address or the phone number is not written correctly: 400 Bad Request
•	if everything is alright: the updated user will be shown
4.	Delete user
Endpoint : /users/{id}
Method: Delete
Response: 
•	if there is one user with that id it will be deleted and shown;
•	if there is no user with that id: 404 Not Found and a message saying: "Could not find user " + id;

5.	Create user
Endpoint : /users
      Method: Post
Request Body with JSON:
{
    "fName": "First",
    "lName": "Last",
    "dateOfBirth":"1940-03-20",
    "phoneNumber":"087546586",
    "email": "firstLa@ga" 
}

Response: it will show the newly created user
