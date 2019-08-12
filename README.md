# springboot-jwt

## Things to do:
1. Clone this repo: `git clone https://github.com/hendisantika/springboot-jwt.git`
2. Go to the folder: `cd springboot-jwt`
3. Run the app: `mvn clean spring-boot:run`
4. Open terminal, copy this code to register account: 
    Request:
    ```
    curl -d '{"username":"naruto", "password":"naruto"}' -H "Content-Type: application/json" -X POST http://localhost:8080/register | jq .
    ```
    
    Response:
    ```
     % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                     Dload  Upload   Total   Spent    Left  Speed
    100    63    0    21  100    42     40     80 --:--:-- --:--:-- --:--:--    80
    {
      "username": "naruto"
    }
    ```
5. Type this to authenticate the user:
   Request:
   ```
   curl -d '{"username":"naruto", "password":"naruto"}' -H "Content-Type: application/json" -X POST http://localhost:8080/authenticate | jq .
   ```
   
   Response:
   ```
    % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                     Dload  Upload   Total   Spent    Left  Speed
    100   229    0   187  100    42    383     86 --:--:-- --:--:-- --:--:--   383
    {
      "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJuYXJ1dG8iLCJleHAiOjE1NjU2MzMyNzQsImlhdCI6MTU2NTYxNTI3NH0.NGRlS0i3VB7GU4_hv9BHHb1wHliqM3t5APrAo7I8mO4DrREqIbIasfgNtF9pzNbwxNHe9L4eLbYBD0ox31swsA"
    }
    ```
6. Request with JWT
    Request:
    ```
    curl -H 'Accept: application/json' -H "Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJuYXJ1dG8iLCJleHAiOjE1NjU2MzQ5MDUsImlhdCI6MTU2NTYxNjkwNX0.hdIIMQKWP0J4en3vYwWtQbX63KjKdHyzp_qonpYtMlE1Ph53-VDB3P8EEksJufq_zYB63Npe23RezU-RXhEMYg" http://localhost:8080/hello | jq .
    ```
    
    Response:
    ```
    Hello World
    ```     
  