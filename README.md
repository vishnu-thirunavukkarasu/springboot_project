# Spring Boot + React Product Manager

Simple full-stack app to manage products: list them, add new ones (with images), edit, delete, and search.  

Backend is Spring Boot with REST API.  
Frontend is React showing products in cards and handling forms + image previews.

Main goal here was to refresh my Java/Spring skills and get comfortable connecting a backend to a React frontend.

## What it does

- CRUD for products (name, description, price, category, stock, image)
- Upload and show product images
- Search by keyword
- Basic frontend to view/add/edit/delete products

## Tech used

**Backend**
- Java 17+
- Spring Boot 3
- Spring Web + Data JPA
- Maven
- (using H2 or whatever db you set in properties)

**Frontend**
- React
- Axios for API calls
- Basic CSS

## How to run it

### Backend
The main backend code is in `ecomDemoBackend/ecomDemo/`

```bash
cd ecomDemoBackend/ecomDemo
mvn clean install
mvn spring-boot:run
