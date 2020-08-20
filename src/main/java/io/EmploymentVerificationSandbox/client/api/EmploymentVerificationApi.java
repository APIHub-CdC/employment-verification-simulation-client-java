package io.EmploymentVerificationSandbox.client.api;

import io.EmploymentVerificationSandbox.client.ApiCallback;
import io.EmploymentVerificationSandbox.client.ApiClient;
import io.EmploymentVerificationSandbox.client.ApiException;
import io.EmploymentVerificationSandbox.client.ApiResponse;
import io.EmploymentVerificationSandbox.client.Configuration;
import io.EmploymentVerificationSandbox.client.Pair;
import io.EmploymentVerificationSandbox.client.ProgressRequestBody;
import io.EmploymentVerificationSandbox.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.EmploymentVerificationSandbox.client.model.AckEVRequest;
import io.EmploymentVerificationSandbox.client.model.AckFailureEVConsumption;
import io.EmploymentVerificationSandbox.client.model.AckSuccessEVConsumption;
import io.EmploymentVerificationSandbox.client.model.AgregationErrors;
import io.EmploymentVerificationSandbox.client.model.EmploymentVerification;
import io.EmploymentVerificationSandbox.client.model.EmploymentVerificationMetadata;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmploymentVerificationApi {
    private ApiClient apiClient;
    public EmploymentVerificationApi() {
        this(Configuration.getDefaultApiClient());
    }
    public EmploymentVerificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call getEmploymentVerificationCall(String xApiKey, String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/tp/cl/v1/employmentverifications/{inquiryId}"
            .replaceAll("\\{" + "inquiryId" + "\\}", apiClient.escapeString(inquiryId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEmploymentVerificationValidateBeforeCall(String xApiKey, String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getEmploymentVerification(Async)");
        }
        if (inquiryId == null) {
            throw new ApiException("Missing the required parameter 'inquiryId' when calling getEmploymentVerification(Async)");
        }
        
        okhttp3.Call call = getEmploymentVerificationCall(xApiKey, inquiryId, progressListener, progressRequestListener);
        return call;
    }
    
    public AckSuccessEVConsumption getEmploymentVerification(String xApiKey, String inquiryId) throws ApiException {
        ApiResponse<AckSuccessEVConsumption> resp = getEmploymentVerificationWithHttpInfo(xApiKey, inquiryId);
        return resp.getData();
    }
    
    public ApiResponse<AckSuccessEVConsumption> getEmploymentVerificationWithHttpInfo(String xApiKey, String inquiryId) throws ApiException {
        okhttp3.Call call = getEmploymentVerificationValidateBeforeCall(xApiKey, inquiryId, null, null);
        Type localVarReturnType = new TypeToken<AckSuccessEVConsumption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getEmploymentVerificationAsync(String xApiKey, String inquiryId, final ApiCallback<AckSuccessEVConsumption> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getEmploymentVerificationValidateBeforeCall(xApiKey, inquiryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AckSuccessEVConsumption>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getEmploymentVerificationsCall(String xApiKey, String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/tp/cl/v1/employmentverifications";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("perPage", perPage));
        if (startAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
        if (endAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endAt", endAt));
        if (inquiryStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("inquiryStatus", inquiryStatus));
        if (successCheck != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("successCheck", successCheck));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEmploymentVerificationsValidateBeforeCall(String xApiKey, String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getEmploymentVerifications(Async)");
        }
        
        okhttp3.Call call = getEmploymentVerificationsCall(xApiKey, page, perPage, startAt, endAt, inquiryStatus, successCheck, progressListener, progressRequestListener);
        return call;
    }
    
    public EmploymentVerificationMetadata getEmploymentVerifications(String xApiKey, String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck) throws ApiException {
        ApiResponse<EmploymentVerificationMetadata> resp = getEmploymentVerificationsWithHttpInfo(xApiKey, page, perPage, startAt, endAt, inquiryStatus, successCheck);
        return resp.getData();
    }
    
    public ApiResponse<EmploymentVerificationMetadata> getEmploymentVerificationsWithHttpInfo(String xApiKey, String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck) throws ApiException {
        okhttp3.Call call = getEmploymentVerificationsValidateBeforeCall(xApiKey, page, perPage, startAt, endAt, inquiryStatus, successCheck, null, null);
        Type localVarReturnType = new TypeToken<EmploymentVerificationMetadata>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getEmploymentVerificationsAsync(String xApiKey, String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ApiCallback<EmploymentVerificationMetadata> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getEmploymentVerificationsValidateBeforeCall(xApiKey, page, perPage, startAt, endAt, inquiryStatus, successCheck, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmploymentVerificationMetadata>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call postEmploymentVerificationCall(String xApiKey, EmploymentVerification request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/tp/cl/v1/employmentverifications";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call postEmploymentVerificationValidateBeforeCall(String xApiKey, EmploymentVerification request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postEmploymentVerification(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling postEmploymentVerification(Async)");
        }
        
        okhttp3.Call call = postEmploymentVerificationCall(xApiKey, request, progressListener, progressRequestListener);
        return call;
    }
    
    public AckEVRequest postEmploymentVerification(String xApiKey, EmploymentVerification request) throws ApiException {
        ApiResponse<AckEVRequest> resp = postEmploymentVerificationWithHttpInfo(xApiKey, request);
        return resp.getData();
    }
    
    public ApiResponse<AckEVRequest> postEmploymentVerificationWithHttpInfo(String xApiKey, EmploymentVerification request) throws ApiException {
        okhttp3.Call call = postEmploymentVerificationValidateBeforeCall(xApiKey, request, null, null);
        Type localVarReturnType = new TypeToken<AckEVRequest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call postEmploymentVerificationAsync(String xApiKey, EmploymentVerification request, final ApiCallback<AckEVRequest> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = postEmploymentVerificationValidateBeforeCall(xApiKey, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AckEVRequest>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
