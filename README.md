# charter-assessment

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction
(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

Given a record of every transaction during a three-month period, calculate the reward points earned for each customer per month and total.

Used **Spring Boot**.

A dataset of 20 customers and 100 purchases of random amounts was created as a demo in an H2 database. The purchases are recorded in the three-month period from 12/01/2022 to 02/28/2023.

There are two API endpoints:
- customers endpoint: [localhost:8081/customers](localhost:8081/customers)
- purchases endpoint: [localhost:8081/purchases](localhost:8081/purchases)
