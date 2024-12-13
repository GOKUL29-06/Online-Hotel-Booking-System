# Online Hotel Booking System (OHBS)

**OHBS** is a web-based hotel booking platform built using **Agile methodologies**. This system allows users to search for hotels, book rooms, and manage their bookings, while admins and managers can manage hotel details, bookings, and customer information. The platform also includes email notifications and payment gateway integration for seamless bookings.


## Key Features

- **User Dashboard**: Users can search for hotels, view room details, book rooms, and view their booking history.
- **Admin Dashboard**: Admins can manage all hotel details, bookings, and customer records across the system.
- **Manager Dashboard**: Hotel managers can manage their own hotel's bookings and customer information.
- **Role-Based Access**: Different levels of access for users, admins, and managers, ensuring secure and customized views.
- **Booking Management**: Efficient handling of customer bookings, cancellations, and status updates for both users and managers.
- **Email Notifications**: Automated email confirmations and reminders for bookings using **JavaMail**.
- **Secure Payment Integration**: Payment gateway integration for secure and seamless transaction processing.

## Tech Stack

- **Frontend**: React.js, Bootstrap
- **Backend**: Spring Boot
- **Database**: MySQL
- **Authentication**: JWT & Spring Security
- **Email Service**: JavaMail Sender
- **Payment Gateway**: Stripe / PayPal (depending on your integration)
- **Code Simplification**: Lombok (for reducing boilerplate code in Java)

## Lombok

This project utilizes **Lombok** to simplify code. To use Lombok, add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.24</version> <!-- Use the latest version -->
    <scope>provided</scope>
</dependency>
```
## Using Lombok

To enable Lombok in your IDE:
    IntelliJ IDEA: Install the Lombok plugin and restart your IDE.
    Eclipse: Download the Lombok jar from the Lombok website and run it to set up.
  
## Installation
## Clone Repository:

      git clone [https://github.com/GOKUL29-06/Online-Hotel-Booking-System.git]
    

## Backend Setup:

1. Configure email and app password in the `application.properties` file:
  
        spring.mail.username=your-email@example.com
        spring.mail.password=your-app-password

2. Start the backend:
                
       mvn spring-boot:run


## Usage

## Admin Login:
      Admins can manage hotel information, bookings, and customer records across all hotels in the system.
## Manager Login:
      Managers can only manage bookings and customer records for their specific hotel(s).
## User Login: 
      Users can search for hotels, book rooms, and view their booking history.

## Development Process

- **The development of OHBS follows Agile methodologies, allowing iterative improvements based on feedback and testing. This ensures the application is both flexible and scalable.**

## Screenshots

