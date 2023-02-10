# assignment9

### Spring assignment

* Create a new Spring Application. The details are as follows.

 * a. Add a class named Customer in the src/main/java with all following attributes
     * i. Name-String
     * ii. Username-String
     * iii. Password-String
     * iv. Age-int
     * v. SSN-String
     * vi. Address-String(just city name)
     * vii. Email-String
     * viii. Phone-long
     * ix. Balance-float

* b. Create an interface Account with showAccount() method.
* c. Inject Account interface in Customer class using @Autowired
* d. Create two classes Saving and Current implementing Account interface.
* e. Inject Saving/ Current account using @Qualifier while creating a customer.


**Note:**

           Make use of @Bean @Component @ComponentScan @Configuration as needed, Create packages and sub-packages as needed.

*Just zoom in to see an overview of the code and the output*

snapshot of the Code + Output:

![ss16](https://user-images.githubusercontent.com/124228487/218003376-cdc8cfa3-9797-4db2-8964-37695ed2f1c8.png)
