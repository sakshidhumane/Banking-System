-Project Description

The Simple Banking System is a Java-based console application that allows users to perform basic banking operations such as:
Creating a bank account
Depositing money
Withdrawing money
Checking account balance
This project is designed to demonstrate Object-Oriented Programming (OOP) concepts and basic data persistence using file handling or JDBC.
	
-Features
Create new bank accounts
Secure deposit and withdrawal operations
Balance inquiry
Account data persistence using File Handling / Database
Console-based interactive menu
Error handling for invalid operations

-OOP Concepts Used
Encapsulation – Private data members with getters/setters
Inheritance – Account hierarchy (SavingsAccount, CurrentAccount, etc.)
Abstraction – Abstract Account class
Polymorphism – Method overriding for account-specific behavior

	Simple-Banking-System/
│
├── src/
│   ├── model/
│   │   ├── Account.java
│   │   ├── SavingsAccount.java
│   │   └── CurrentAccount.java
│   │
│   ├── service/
│   │   └── BankService.java
│   │
│   ├── util/
│   │   └── FileHandler.java
│   │
│   └── Main.java
│
├── data/
│   └── accounts.txt
│
├── README.md
└── .gitignore
