# LinearPositionsApi

All URIs are relative to *//api.bybit.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linearPositionsMyPosition**](LinearPositionsApi.md#linearPositionsMyPosition) | **GET** /private/linear/position/list | Get my position list.
[**linearPositionsSaveLeverage**](LinearPositionsApi.md#linearPositionsSaveLeverage) | **POST** /private/linear/position/set-leverage | Set leverage

<a name="linearPositionsMyPosition"></a>
# **linearPositionsMyPosition**
> LinearMyPositionEnvelope linearPositionsMyPosition(symbol)

Get my position list.

This will get my position list.

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.LinearPositionsApi;


LinearPositionsApi apiInstance = new LinearPositionsApi();
String symbol = "symbol_example"; // String | 
try {
    LinearMyPositionEnvelope result = apiInstance.linearPositionsMyPosition(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearPositionsApi#linearPositionsMyPosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | [optional]

### Return type

[**LinearMyPositionEnvelope**](LinearMyPositionEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="linearPositionsSaveLeverage"></a>
# **linearPositionsSaveLeverage**
> JsonRpcEnvelope linearPositionsSaveLeverage(body)

Set leverage

This will Set Leverage

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.LinearPositionsApi;


LinearPositionsApi apiInstance = new LinearPositionsApi();
LinearSetLeverage body = new LinearSetLeverage(); // LinearSetLeverage | 
try {
    JsonRpcEnvelope result = apiInstance.linearPositionsSaveLeverage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearPositionsApi#linearPositionsSaveLeverage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinearSetLeverage**](LinearSetLeverage.md)|  |

### Return type

[**JsonRpcEnvelope**](JsonRpcEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

