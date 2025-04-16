
# GraphQL with Spring Boot


# Ejecutar el proyecto

## GraphQl 

http://localhost:8080/graphiql?path=/graphql
```
query getBookById {
  bookById(id:1){
    id
    name
    pageCount
  }
}
```

```
query getAllBooks {
  allBooks {
    name
    author {
      firstName
      lastName
    }
  }
}
```

```
{
  "createBook": {
    "name": "Libro Prueba #2",
    "pageCount": 10599,
    "authorId": 1
  }
}
```


## Postman

http://localhost:8080/graphql

```
bookById(id:1){
    id
    name
    pageCount
  }
}
```

```
query getBookById {
  bookById(id:1){
    id
    author {
      id
      firstName
    }
  }
}
```