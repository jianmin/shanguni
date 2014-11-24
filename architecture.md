CMC (China Marathon Cloud) is a cloud-enabled, mobile-ready, 
web application.

What's the stack?
=================

The idea was very simple, in essence: a single language on the 
client and the server, allowing us to reuse components and 
resources. 

The language is JavaScript. 

The stack is the MEAN Stack: MongoDB, Express, AngularJS and Node.js

Specifically:

Front end: AngularJS + Bootstrap
Middle tier: Nginx + Node.js (Express, Socket.IO)
Database: MongoDB

Why MongoDB?
============

MongoDB is a NoSQL document-based database that uses JavaScript 
as its query language, allowing us to complete the end-to-end 
JavaScript platform. But that’s not even the main reason to 
choose this database.

MongoDB is a schema-less database that allows us to persist 
our objects in a flexible way and thus adapt faster to changes 
in requirements. Plus, it’s highly scalable and map-reduce based, 
which make it suitable for big data applications. MongoDB is so 
flexible that it can be used as a schema-less document database, 
a relational datastore (although it lacks transactions), or even 
as a key-value store for caching responses.
