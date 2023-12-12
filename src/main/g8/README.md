# Sample Apache Pekko HTTP server

This is a sample Apache Pekko HTTP endpoint keeping an in-memory database of users that can be created and listed.

Sources in the sample:

* `QuickstartApp.scala` -- contains the main method which bootstraps the application
* `UserRoutes.scala` -- Apache Pekko HTTP `routes` defining exposed endpoints
* `UserRegistry.scala` -- the actor which handles the registration requests
* `JsonFormats.scala` -- converts the JSON data from requests into Scala types and from Scala types into JSON responses

## Interacting with the sample

After starting the sample with `sbt run` the following requests can be made with [HTTPie](https://httpie.io/):

List all users:

```sh
http http://localhost:8080/users
```

Create a user:

```sh
http POST localhost:8080/users name="Liselott" age:=32 countryOfResidence="Norway"
```

Get the details of one user:

```sh
http http://localhost:8080/users/Liselott
```

Delete a user:

```sh
http DELETE http://localhost:8080/users/Liselott
```
