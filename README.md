# Webshop Chic&Choc Product Service
<p>This repository is a part of my webshop project. It's a microservice API that handles products</p>

### Frontend Repo's:

<a href="https://github.com/Kibuns/Webshop-ChicnChoc">Webshop react web application</a>
 <<< ***ALL INFO ABOUT PROJECT FOUND HERE*** 
### Backend Repo's:
<a href="https://github.com/Kibuns/WebshopCHICNCHOC-ProductService">This</a>

<a href="https://github.com/Kibuns/WebshopOrderService">Order Service</a>

<a href="https://github.com/Kibuns/WebshopGatewayService">Gateway Service</a>

## API Mapping
```/api/products```: returns an array of all the products in the database

```/api/product/{id}```: return the product with the matching {id}

```/api/post```: posts a product object to the product database. May not have an id field, id is autoincrement

```/api/update```: updates the product that you give to it, it does this by looking for the id and over riding that product

```/api/delete/{id}```: deletes the product associated with {id}
