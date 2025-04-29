# CSC320-1-Module-3

Pseudocode

1. Start
2. Declare variables: income, taxRate, withholding
3. Prompt user to enter weekly income
4. Read income
5. If income < 500
       taxRate = 0.10
   Else if income >= 500 and income < 1500
       taxRate = 0.15
   Else if income >= 1500 and income < 2500
       taxRate = 0.20
   Else
       taxRate = 0.30
6. withholding = income * taxRate
7. Display withholding amount
8. End