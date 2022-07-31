![cinema logo](cinema_logo.png)
# Cinema project
___

### 📒 Project description:
___
    A simple application that supports authentication, registration and other CRUD operations.
###  🔗 Features:
___
* registration like a user;
* authentication like a user;
* create/find by email a user;
* create a ticket;
* create/update/get users shopping cart;
* create order/get users orders history;
* create/get/find available movie session;
* create/get movie;
* create/get cinema hall;
* display list of all movies;
* display list of all cinema halls;

### 🖥 Technologies used:
___
* JDK 11
* Maven 3.8.6
* Hibernate 5.4.21 final
* MySql 8.0.22

### 🚀  How to run:
___
To correctly use this service you have to install MySQL.
1. Clone this project to your environment:
2. Create schema manually;
3. Write url to schema into property with name:"connection.url" in /src/main/resources/hibernate.cfg.xml file
4. Write login and password to your db into properties with name: "connection.username" and "connection.password" in /src/main/resources/hibernate.cfg.xml file
5. Run Main.class (Press 'run' button).
6. Go ahead and use it!

### 🧩 Whole schema of project:
![whole schema](Hibernate_Cinema_Uml.png)

# cinema-project
