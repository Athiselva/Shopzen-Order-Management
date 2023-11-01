<img src="https://github.com/Athiselva/Shopzen-SQL/blob/main/Microservice.jpg" alt="Microservice" width="550" height="300">

# Sprintboot - Shopzen Order Management APIs

This repository contains two Spring Boot RESTful APIs for managing orders and payments in an e-commerce platform. Below are the details and usage instructions for each API.

## Order Management API

The Order Management API provides endpoints for creating, fetching, updating, and deleting orders.

### Endpoints:

- **Add Order:**
  - **HTTP Method:** POST
  - **URL:** `/order-management/api/add`
  - **Description:** Create a new order.
  - **Request Body:** Order details in JSON format.
  - **Response:** A success message with the order ID.

- **Fetch All Orders:**
  - **HTTP Method:** GET
  - **URL:** `/order-management/api/fetchall`
  - **Description:** Fetch a list of all orders.
  - **Response:** A list of order objects.

- **Fetch Order by ID:**
  - **HTTP Method:** GET
  - **URL:** `/order-management/api/fetch/{id}`
  - **Description:** Fetch an order by its ID.
  - **Response:** The order object.

- **Update Order:**
  - **HTTP Method:** PUT
  - **URL:** `/order-management/api/update`
  - **Description:** Update an existing order.
  - **Request Body:** Updated order details in JSON format.
  - **Response:** The updated order object.

- **Delete Order by ID:**
  - **HTTP Method:** DELETE
  - **URL:** `/order-management/api/delete/{id}`
  - **Description:** Delete an order by its ID.
  - **Response:** A success message.

## Payment Management API

The Payment Management API provides endpoints for creating, fetching, updating, and deleting payments.

### Endpoints:

- **Add Payment:**
  - **HTTP Method:** POST
  - **URL:** `/payment-management/api/create`
  - **Description:** Create a new payment.
  - **Request Body:** Payment details in JSON format.
  - **Response:** A success message with the payment ID.

- **Fetch All Payments:**
  - **HTTP Method:** GET
  - **URL:** `/payment-management/api/fetchall`
  - **Description:** Fetch a list of all payments.
  - **Response:** A list of payment objects.

- **Fetch Payment by ID:**
  - **HTTP Method:** GET
  - **URL:** `/payment-management/api/fetch/{id}`
  - **Description:** Fetch a payment by its ID.
  - **Response:** The payment object.

- **Update Payment:**
  - **HTTP Method:** PUT
  - **URL:** `/payment-management/api/update`
  - **Description:** Update an existing payment.
  - **Request Body:** Updated payment details in JSON format.
  - **Response:** The updated payment object.

- **Delete Payment by ID:**
  - **HTTP Method:** DELETE
  - **URL:** `/payment-management/api/delete/{id}`
  - **Description:** Delete a payment by its ID.
  - **Response:** A success message.

## Usage

You can interact with these APIs using HTTP requests. Here are some examples using `curl`:

- **Create a new order:**
   ```shell
   curl -X POST -H "Content-Type: application/json" -d '{"customerId": 1, "product": "Product Name", "quantity": 3, "totalAmount": 100}' http://localhost:8080/order-management/api/add
