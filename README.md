# Lab 3 -- Java ATM

**50 points**   

## Purpose:  

In this assignment, you will develop a program that acts at a smart ATM.

This assignment will give you a chance to practice the following:

1. Making decision with if-else
2. Using loop
3. Formating number
4. Using Strings
5. Creating testcases

## Problem
You work at a bank and your current project is to design and implement a new interface for a new generation of ATMs.

## Description
Your task is to write a Java program to interact with a customer who wants to **deposit** to, **withdraw** from, and **check the balance** of their bank account. 
You can assume the customer has been authenticated and authorized to access their account. 

## Requirements

Note: The following is *ALMOST BUT NOT QUITE* an algorithm. Do you see what is wrong with it?

1. When a user first accesses the ATM, the user should be asked for their name.  
2. The ATM should greet the user by name with a greeting message, then ask the user what they would like to do.  
3. If a user selects **deposit**   
    * The ATM should increase the user's balance by the provided amount  
4. Otherwise, if a user selects **withdraw**  
    * The ATM should reduce the balance by the users provided amount if and only if there are sufficients funds.  
5. Otherwise, if the user selects **check balance**  
    * The ATM should display the current balance  
6. Otherwise, if the user selects **leave**  
    * The ATM should ask if the user would like a receipt printed or emailed.  
	* The ATM should display the total amount deposited/withdrawn and a thank you message.  
	* The ATM should remind them to take the recipe or check their email depending on the option above.  
7. If the user has not chosen to leave:  
    * The ATM should return to the main menu and process starting from step 3.  
8. EXTRA CREDIT: Proper error checking should be included:  
    * The user should not be able to select invalid menu options.  
	* The user should not be able to enter negative numbers for deposits or withdrawls.  
	* The program should not crash if the user enters something that is not a number. 
9. The initial balance for the user is **$212.90**  
10. Complete your algorithm before working on your code.   
11. Complete your test cases before working on your code.  
12. **Hint:** Classes are the best way to solve this, but we are not done with them yet. Instead, consider the use of methods (you will need the `static` modifier).


## What to Submit:

To **GitHub**:
* algorithm.txt containing your algorithm
* testcases.txt containing at least 5 test cases with a rationale for the test, inputs, and expected outputs.
* you java file with all code you wrote and the proper comments at the top and throughout your code


Individually, to **Moodle**:
* a  **reflection** (min 150 words, max 1 page) and answer these questions:  
    * What did you learn in Lab 3?
    * What was it like working with if-else and loops in Java? What about when you did it in Python for 151? Did any knowledge carry over? 
    * What was it like working with your partner for this week? 

	* **This is part of your participation grade**







