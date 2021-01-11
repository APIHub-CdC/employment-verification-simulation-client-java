package io.EmploymentVerificationSandbox.client.api;


import java.util.UUID;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.OffsetDateTime;

import io.EmploymentVerificationSandbox.client.ApiClient;
import io.EmploymentVerificationSandbox.client.ApiException;
import io.EmploymentVerificationSandbox.client.model.AckEVRequest;
import io.EmploymentVerificationSandbox.client.model.AckSuccessEVConsumption;
import io.EmploymentVerificationSandbox.client.model.EmploymentVerification;
import io.EmploymentVerificationSandbox.client.model.EmploymentVerificationMetadata;
import okhttp3.OkHttpClient;

public class EmploymentVerificationApiTest {
    private Logger logger = LoggerFactory.getLogger(EmploymentVerificationApiTest.class.getName());
    private final EmploymentVerificationApi api = new EmploymentVerificationApi();
    private ApiClient apiClient = null;
    private String xApiKey = "your_api_key";
    private UUID subscriptionId = null;
    private String url ="the_url";

    private UUID inquiryId = null;

    Integer count=0;

    @Before
    public void setUp() {
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(this.url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
        apiClient.setHttpClient(okHttpClient);
    }


    @Test
    public void postEmploymentVerificationTest() throws ApiException, InterruptedException {

        logger.info("POST");
        EmploymentVerification request = new EmploymentVerification();

        request.setCurp(null);
        request.setEmail(null);
        request.setNss(null); 
        request.setEmploymentVerificationRequestId(UUID.randomUUID());
        request.setSubscriptionId(this.subscriptionId);

        try {
            AckEVRequest response = api.postEmploymentVerification(this.xApiKey, request);
            
            Assert.assertNotNull(response);
            logger.info(response!=null?response.toString():null);

            if (response != null) {
                if (response.getInquiryId() != null) {
                    this.inquiryId = response.getInquiryId();
                    this.count = 0;
                    this.sendGetbyId();
                }

            }

        } catch (ApiException ae) {
            logger.error(Integer.toString(ae.getCode()));

            if (ae.getResponseBody() == null) {
                logger.error(ae.getMessage());
            } else {
                logger.error(ae.getResponseBody());
            }
        }
    }

    private void sendGetbyId() throws InterruptedException {        
        AckSuccessEVConsumption responseGet;
        try {

            logger.info("GET BY ID" );
            responseGet = api.getEmploymentVerification(this.xApiKey, this.inquiryId.toString());
            logger.info(responseGet.toString());
       
        } catch (ApiException ae) {   
            logger.error(Integer.toString(ae.getCode()));
            if (ae.getResponseBody() == null) {
                logger.error(ae.getMessage());
            } else {
                logger.error(ae.getResponseBody());
            }
        }

    }

    @Test
    public void getEmploymentVerificationsTest() throws ApiException {

        logger.info("GET LIST - > 200");
        String page = "1";
        String perPage = "15";
        OffsetDateTime startAt = null;
        OffsetDateTime endAt = null;
        String inquiryStatus = null;
        String successCheck = null;
        EmploymentVerificationMetadata response = api.getEmploymentVerifications(this.xApiKey, page, perPage, startAt,
                endAt, inquiryStatus, successCheck);
        logger.info(response.toString());
    }

}
