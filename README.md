### Hotel Management System

This project have been developed using maven and java.

___

**Steps to setup the project:**

1. Ensure you have maven installed.
2. Clone the project from github.
   
   ```
   git clone git@github.com:YadavGulshan/Hotel-Management-System.git
   ```
3. Open intellij idea or Netbeans and load all the dependencies.
4. Import the sql file into your mysql database.
5. Run the project.

___

#### Steps to setup the email service:

1. Create a google account.
2. Ensure that you have enabled the two factor authentication.
3. If not then, Head to the my account [page](https://myaccount.google.com/security) and click on the "Enable two-factor authentication" button.
4. Click on `App Password`
   ![App Password](https://telegra.ph/file/c11be1863089a14607808.png)
5. Select `Other` in Select App dropdown.
   ![Select App](https://telegra.ph/file/0767296ced9752c253fd0.png)
6. Name your Application.
7. And now paste your email address and your generated password for the app in [env.java file](https://github.com/YadavGulshan/Hotel-Management-System/blob/main/src/main/java/com/mycompany/HotelReservation/env/env.java).

**Your smtp server is ready to rock!!**

> **Note: **
> 
> > For security reasons, this service will only be limited to your first used app's IP address.

___

**Project UI**

***DashBoard***

<img src="https://telegra.ph/file/6bc83c3d0fefd491747d7.png" title="" alt="Dashboard" data-align="center">

***Check In Section***

<img src="https://telegra.ph/file/584484d5d122c9c45962f.png" title="" alt="Check In Section" data-align="center">

***Check Out Section***

<img src="https://telegra.ph/file/30ca5ccffe58979be19c6.png" title="" alt="Check Out Section" data-align="center">

***Email Receipt***

<img src="https://telegra.ph/file/477f8d7af1aed6dc1896c.png" title="" alt="Email Reciept" data-align="center">

***Generated Reciept***

<img src="https://telegra.ph/file/23fdf765d3f0108e5d639.png" title="" alt="Generated Reciept" data-align="center">

___

**Credits**


**Mansi and Mayank Viramgama**
> Developed the UI design

[**Rahul Yadav**](https://github.com/rahul007-bit/)<br>

> Made UI functional and also faced and fixed hell lot of complexity while making code usable for both netbeans and intellij.
> 
> > That was a big mess.
> > <br>

[**Yadav Gulshan**](https://github.com/YadavGulshan) <br>

> Implemented Invoice generation and Email reciept functionality.
> <br>

___

Made with ❤️ in India.
