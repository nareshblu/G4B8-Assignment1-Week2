# G4B8-Assignment1-Week2

## Colaborators 
Members | Email
------------- | -------------
Shivani Bhatt  | shivanibhatt251@gmail.com
Sudeer Kumar Unnikrishnan  | kumar_sudeer@yahoo.com
Chandan Jyoti Sarma | chandanjs2509@gmail.com
Naresh Kumar | gnareshblaze@gmail.com
Veena CK | Vck02021988@gmail.com

## Algorithm
1. Create a project Week2Assignment1.
2. Create a package com.greatlearning.assignment1.
3. Create classes as superDepartment, adminDepartment, hrDepartment and techDepartment.
4. In SuperDepartment class (super class) create 4 methods as departmentName, getTodaysWork, getWorkDeadline and  isTodayAHoliday with return type as String and no parameters.
    - departmentName will return “ Super Department “ 
    - getTodaysWork will return “ No Work as of now” 
    - getWorkDeadline will return “ Nil “ 
    - isTodayAHoliday will return “ Today is not a holiday”
5. In AdminDepartmenet class extends superDepartment class and create 3 methods as departmentName, getTodaysWork and  getWorkDeadline with return type as String and no parameters.
    - departmentName will return “ Admin Department “ 
    - getTodaysWork will return “Complete your documents Submission” 
    - getWorkDeadline will return “ Complete by EOD “  
6. In HRDepartment class extends superDepartment class and create 4 methods as  departmentName, getTodaysWork, getWorkDeadline and doActivity  with return type as String and no parameters.
    - departmentName will return “ Hr Department “ 
    - getTodaysWork will return “ Fill today’s timesheet and mark your attendance”
    - getWorkDeadline will return “ Complete by EOD “ 
    - doActivity “team Lunch” 
7. In TechDepartment class extends superDepartment class and create 4 methods as departmentName, getTodaysWork, getWorkDeadline and getTechStackInformation with return type as String and no parameters.
    - departmentName will return “ Tech Department “ 
    - getTodaysWork will return “ Complete coding of module 1” 
    - getWorkDeadline will return “ Complete by EOD “ 
    - getTechStackInformation will return “core Java”
8. Create a Driver class with main method.
9. Create objects of hrDepartment, techDepartment, adminDepartment classes in main method.
10. Call all methods in each class with their respective objects.
11. Call  isTodayAHoliday methods the objects of all the classes.

## Executed Output
Welcome to Admin Department<br />
Complete your documents submission<br />
Complete by EOD<br />
Today is not a Holiday<br />

Welcome to HR Department<br />
team Lunch<br />
Fill Today's Timesheet and mark your attendance<br />
Complete by EOD<br />
Today is not a Holiday<br />

Welcome to Tech Department<br />
Complete coding of Module 1<br />
Complete by EOD<br />
Core Java<br />
Today is not a Holiday<br />

