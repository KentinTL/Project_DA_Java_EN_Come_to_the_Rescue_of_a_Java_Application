# How intall and use the Project02Eclipse

>Project02Eclips is an cmd app, you can use it for sort and count a file unordered with a lot of same word by line for exemple: 
* lime
* lime
* orange
* lime
* apple
* apple
* orange 

>After using it you're gonna got a result like this
* apple = 2
* lime = 3
* orange = 2

## Understand ? So let's Go

##First Step install Java and JDK
Follow the step on the oracle doc [here](https://docs.oracle.com/en/java/javase/21/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A)

## Second step clone the repo on Eclipse 
If u dont know how to do the i put a link with a tutorial for you right [here](https://www.geeksforgeeks.org/how-to-clone-a-project-from-github-using-eclipse/)

## Third Step put the file you need to sort and count
Go into the AnalitycsCounter.java file and change the file path in this :  
		ReadSymptomDataFromFile myReader = new ReadSymptomDataFromFile("urFilePath");
And save

## Fourth Step open your cmd and :
1. Navigate into your git folder where the project is
2. Navigate from git to Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/
3. Do this command:  javac -cp src src/com/hemebiotech/analytics/AnalyticsCounter.java
4. Then this command: java -cp src com.hemebiotech.analytics.AnalyticsCounter

## Finally 
If you have follow this 5 steps, you normaly have result.out in your project with your file sorted and counted