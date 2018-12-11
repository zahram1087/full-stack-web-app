##Lab 11: Building Full-Stack Web Apps

<!-- Short summary or background information -->
Create a hello world route at /hello, and ensure that you can visit that route in your browser and see data come back.

Create a route that turns words into UPPER CASE

## Approach & Efficiency
<!-- What approach did you take? -->
I approached this lab reviewing how to do a restful controller. Then how I can test for the methods.

## API
<!-- Description of each method publicly available to your Stack and Queue-->
##HelloWorldController CLASS:
1. Method called wordsToCapitalize that capitales and string that is passed in
2. RequestMapping to render hello world when the you visit "http://localhost:8080/hello"
3. RequestMapping to render a capitalized string when the string is added at the end of the route as such:
"http://localhost:8080/capitalize/this%20should%20be%20in%20all%20caps"
