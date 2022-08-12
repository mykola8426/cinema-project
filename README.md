![cinema logo](cinema_logo.png)
# Cinema project

### 📒 Project description:
      A simple web application that supports authentication, registration and other CRUD operations.
###  🔗 Features:
___
* registration like a user;
* authentication like a user;
* authentication like a admin;
* create/find by email a user;
* create a ticket;
* create/update/get users shopping cart;
* create order/get users orders history;
* create/get/find available movie session;
* create/get movie;
* create/get cinema hall;
* display list of all movies;
* display list of all cinema halls;


#####  Access rights to individual endpoints according to roles:
```
GET: /cinema-halls (USER or ADMIN)
POST: /cinema-halls (ADMIN)
GET: /movies (USER or ADMIN)
POST: /movies (ADMIN)
GET: /movie-sessions/available (USER or ADMIN)
POST: /movie-sessions (ADMIN)
PUT: /movie-sessions/{id} (ADMIN)
GET: /orders (USER)
POST: /orders/complete (USER)
POST: /register (ALL)
GET: /shopping-carts/by-user (USER)
PUT: /shopping-carts/movie-sessions (USER)
GET: /users/by-email (ADMIN)
```
### 🖥 Technologies used:
___
* JDK 11
* Maven 3.8.6
* Hibernate 5.4.21 final
* MySql 8.0.22
* Spring(WEB, Security, MVC, REST)

### 🚀  Run Locally:
___
To correctly use this service you have to install MySQL, Apache Tomcat version 9 and PostMan.
1. Clone this project to your environment:
2. Create schema manually;
3. Write url to schema into property with name:"db.url" in /src/main/resources/db.properties file
4. Write login and password to your db into properties with name: "db.username" and "db.password" in /src/main/resources/db.properties file 
5. By default  schema creating = 'create-drop', you can change it to 'validate' into property "hibernate.hbm2ddl.auto" in /src/main/resources/db.properties file and all that you create and save in db will store for long time 
6. Add Tomcat Server configure:
    * Press 'edit configuration' near run button.
    * Select the plus in the upper left corner.
    * Find Tomcat Server and choose local.
    * Press fix button in lower right corner.
    * Choose 'cinema-project:war exploded'.
    * Click 'apply' and 'Ok'.
7. Go ahead and use it(default users created in DataIntializer.class)!

### 🧩 Database diagram:
![whole schema](Hibernate_Cinema_Uml.png)

### Created by Mykola Yakymiv
