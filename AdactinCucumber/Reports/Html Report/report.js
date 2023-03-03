$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In The Adactin Application",
  "description": "",
  "id": "hotel-booking-in-the-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-the-adactin-application;user-login-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The User Name In User Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And Navigate TO Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefnition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 3102697100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Enter_The_User_Name_In_User_Field()"
});
formatter.result({
  "duration": 121923900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 66723800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Click_The_Login_Button_And_Navigate_TO_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2622948800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User Booking The Hotel",
  "description": "",
  "id": "hotel-booking-in-the-adactin-application;user-booking-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select  The  Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Enter The Valid Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Enter The valid Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select Adult Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The Childrens Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Click The Search Button And Navigate To Select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefnition.user_Select_The_Location()"
});
formatter.result({
  "duration": 106650500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 153519300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 160913500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 140846900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Enter_The_Valid_Check_In_Date()"
});
formatter.result({
  "duration": 97558800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Enter_The_valid_Check_Out_Date()"
});
formatter.result({
  "duration": 92036000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Select_Adult_Per_Room()"
});
formatter.result({
  "duration": 126460700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Select_The_Childrens_Per_Room()"
});
formatter.result({
  "duration": 125072300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Click_The_Search_Button_And_Navigate_To_Select_Hotel_page()"
});
formatter.result({
  "duration": 696863400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User Verify By Booking Details",
  "description": "",
  "id": "hotel-booking-in-the-adactin-application;user-verify-by-booking-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user Verify and click The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user Click The Continue Button And Navigate To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefnition.user_Verify_and_click_The_Radio_Button()"
});
formatter.result({
  "duration": 55655700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Click_The_Continue_Button_And_Navigate_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 724733300,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Book Hotel To Hotel Functionality",
  "description": "",
  "id": "hotel-booking-in-the-adactin-application;book-hotel-to-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user Enter The First Name",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user Enter The Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Enter The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Enter The Valid Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Select The Credit Card tye",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Select the Expire Month",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Select The Expire Year",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enter The Valid Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Click the Book Now Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefnition.user_Enter_The_First_Name()"
});
formatter.result({
  "duration": 61612600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Enter_The_Last_Name()"
});
formatter.result({
  "duration": 63464900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Enter_The_Billing_Address()"
});
formatter.result({
  "duration": 118641800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Enter_The_Valid_Credit_Card_Number()"
});
formatter.result({
  "duration": 79470100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Select_The_Credit_Card_tye()"
});
formatter.result({
  "duration": 129012800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Select_the_Expire_Month()"
});
formatter.result({
  "duration": 190260800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Select_The_Expire_Year()"
});
formatter.result({
  "duration": 191249700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Enter_The_Valid_Cvv_Number()"
});
formatter.result({
  "duration": 62415000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnition.user_Click_the_Book_Now_Button()"
});
formatter.result({
  "duration": 55815500,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Booking Confirmation Page Functionality",
  "description": "",
  "id": "hotel-booking-in-the-adactin-application;booking-confirmation-page-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "user Verify And Click The Logout Buttons",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefnition.user_Verify_And_Click_The_Logout_Buttons()"
});
formatter.result({
  "duration": 383983100,
  "status": "passed"
});
});