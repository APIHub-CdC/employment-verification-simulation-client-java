# Employment Verification Sandbox

This API lets you verify a person employment status. If a person has a job it also returns the industrial sector and the industry COVID risk segment.

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the dependencies, the following command must be executed:
```shell
mvn install -Dmaven.test.skip=true
```

## Getting started

#### Step 1. Get your ```x-api-key```
 Get your ```x-api-key``` Following step 1, 2 and 3 the start guide ***https://developer.circulodecredito.com.mx/guia-de-inicio*** 

#### Step 2. Change url and request data
In the ```EmploymentVerificationApiTest.java``` file, found at ```src/test/java/io/EmploymentVerificationSandbox/client/api/```. The request and URL data for API consumption must be modified in ```private String url ="the_url";```, as shown in the following code snippet with the corresponding data:


``` java

public class EmploymentVerificationApiTest {
    ...
    private String xApiKey = "your_api_key"; //Change for your x-api-key
    private UUID subscriptionId = null; //Change for valid subscriptionId
    private String url ="the_url"; // Change for url valid
    ...
    ...
    @Test
    public void postEmploymentVerificationTest() throws ApiException, InterruptedException {
        ...
        EmploymentVerification request = new EmploymentVerification();
        request.setCurp(null);  // Change for valid data
        request.setEmail(null); // Change for valid data
        request.setNss(null);  // Change for valid data
        request.setEmploymentVerificationRequestId(UUID.randomUUID());
        request.setSubscriptionId(this.subscriptionId);
        ...
    }
    ...
```

### Step 3. Run the unit test

Having the previous steps, all that remains is to run the unit test, with the following command:
```shell
mvn test -Dmaven.install.skip=true
```