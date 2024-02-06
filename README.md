## spring-mvC-example
This project demonstrates the Spring MVC but focusing on the <b>C</b> in <b>MVC</b> which stands for <b>Controller</b>.
<br>

## So, What is this project?
It is a Cloud Kitchen which uses the following Controllers:
- HomeController.class
- StartersController.class
- MainCourseController.class
- SoupsController.class
- RiceAndBiryaniController.class

When you hit ```localhost:8081/home``` route it displays the menu of the cloud kitchen which is handled by the HomeController.
In the menu we have the following sections:
- Starters
- Soups
- Main Courses
- Rice and Biryani

You can navigate to ```localhost:8081/menu/starters```, ```/menu/soups```, ```/menu/main-courses```, ```/menu/rice-biryani``` routes which are handled by the StarteController, SoupsCotroller, MainCourseController, and RiceAndBiryaniController respectively.

### Note:
This project uses the server port# 8081.
