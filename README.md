Homework 1
Daniel Shtarker - 207362393

Overview -----------------------------------------------------------------------------------

This Java program implements a simple banking system comprising three account types: 
PremiumAccount, BasicAccount, and StandardAccount. These account classes adhere to 
the IAccount interface, defining common banking functionalities like deposit, withdrawal, 
and balance retrieval. Additionally, the program introduces the Bank class, implementing 
the IBank interface, which acts as a centralised manager for multiple accounts.

Account Classes ----------------------------------------------------------------------------

The account classes share commonalities in their implementation:


- IAccount Interface Implementation:
All account classes implement the IAccount interface, 
ensuring consistency in method signatures. These methods 
include Deposit, Withdraw, GetCurrentBalance, and GetAccountNumber.


- Private Identifiers and Constructors:
Each account class defines private identifiers such as accountNumber, 
CurrentBalance, and specific attributes like creditLimit or withdrawLimit. 
Constructors initialize these variables and set the initial CurrentBalance to 0.


- UpdateCurrentBalance Method:
A private method, UpdateCurrentBalance, is responsible for modifying the 
CurrentBalance after different transactions, ensuring encapsulation of balance updates.

Unique Features in Each Account Class ------------------------------------------------------

- PremiumAccount:
No credit or withdrawal limit.
The Withdraw method directly returns the requested amount and updates the CurrentBalance.

- StandardAccount:
Defines a withdrawal limit as CurrentBalance + creditLimit.
The Withdraw method restricts withdrawals to the defined limit, considering 
the account's current balance.

- BasicAccount:
Limited withdrawals based on the creditLimit.
The Withdraw method enforces withdrawal restrictions based on the credit
limit and the current account balance.

Bank Class ---------------------------------------------------------------------------------

The Bank class manages a collection of accounts, providing functionalities 
outlined in the IBank interface:

- List of Accounts:
Maintains a list of IAccount objects to manage multiple accounts efficiently.

- OpenAccount Method:
Implements the OpenAccount method, allowing the addition of an account to the bank's list.

- CloseAccount Method:
Implements the CloseAccount method, removing an account based on its account number while ensuring a non-negative balance.

- GetAllAccounts Method:
Retrieves a list of all accounts currently held by the bank.

- GetAllAccountsInDebt and GetAllAccountsWithBalance Methods:
Identify accounts with negative balances or balances exceeding a specified amount, providing insightful account information.



Main Class Integration -------------------------------------------------------------------------

The Main class exemplifies the program's functionality by creating instances 
of different account types, opening accounts in the bank, executing transactions, 
and querying account information. It showcases the seamless interaction between the 
bank and its account classes.
