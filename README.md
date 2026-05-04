Mobile Application Development Lab

Experiment: Multi-Page Consumer App with Database Integration
Submitted by:
Name: Manthan Ghorpade (22UCS039)
Class: Final Year B.Tech (CSE-A)

CONSUMER BILLING APPLICATION 
1. Introduction
Consumer Billing Application is an Android based mobile application developed using Java and XML in Android Studio. The application is designed to calculate electricity bill amount based on consumer details, units consumed and rate per unit. It also provides a registration module to save consumer information into SQLite local database and a display module to view saved consumer records.
2. Objectives
• To create a mobile app for electricity consumer bill calculation.
• To accept consumer details from the user.
• To calculate total electricity bill amount.
• To pass data between multiple activities using Intent.
• To register and store consumer information in SQLite database.
• To display stored consumer records.
3. Software and Technologies Used
Android Studio
Java Programming Language
XML for Layout Design
SQLite Database
Android SDK / Emulator
4. Modules of the Application
Part A – Consumer Billing Calculation:
Screen 1 accepts Consumer Number and Name.
Screen 2 accepts Units Consumed and Rate Per Unit.
Total Bill Amount = Units Consumed × Rate Per Unit.
Screen 3 displays Consumer Number and Total Bill Amount.

Part B – Consumer Registration and Database Storage:
Screen 4 registers Consumer Number, First Name and Password.
Screen 5 displays all saved consumer records from SQLite database.
5. Intent Passing Used in the Project
Intent passing is used to transfer data from MainActivity to SecondActivity and from SecondActivity to ThirdActivity. Consumer Number, Consumer Name and Total Bill Amount are passed between screens for smooth navigation.
6. SQLite Database Used
SQLite database is used to store consumer registration details permanently. Database table contains Consumer Number, First Name and Password. Functions used are insertData() to insert records and getData() to fetch/display records.
7. User Interface Design Constraints Satisfied
• ConstraintLayout / Relative Layout used
• Each page has different background color
• Text colors are different
• One image is added in the application
• Buttons and input fields are styled properly

9. Important Manifest.xml Configuration
If starting app from MainActivity:
<activity
    android:name=".MainActivity"
    android:exported="true">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>

If starting app from RegisterActivity:
<activity
    android:name=".RegisterActivity"
    android:exported="true">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>

Only one activity should contain MAIN and LAUNCHER intent filter.


10. Conclusion
Thus, the Consumer Billing Application was successfully developed using Android Studio. The application performs electricity bill calculation, uses intent passing for transferring data between activities, and stores consumer registration details using SQLite database.
