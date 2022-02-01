# LinearOrderApi

All URIs are relative to *//api.bybit.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**linearOrderCancel**](LinearOrderApi.md#linearOrderCancel) | **POST** /private/linear/order/cancel | Cancel Active Order
[**linearOrderNew**](LinearOrderApi.md#linearOrderNew) | **POST** /private/linear/order/create | Create Active Order
[**linearOrderReplace**](LinearOrderApi.md#linearOrderReplace) | **POST** /private/linear/order/replace | Replace Active Order

<a name="linearOrderCancel"></a>
# **linearOrderCancel**
> LinearCancelOrderEnvelope linearOrderCancel(body)

Cancel Active Order

This will cancel linear active order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.LinearOrderApi;


LinearOrderApi apiInstance = new LinearOrderApi();
LinearOrderCancel body = new LinearOrderCancel(); // LinearOrderCancel | 
try {
    LinearCancelOrderEnvelope result = apiInstance.linearOrderCancel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearOrderApi#linearOrderCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinearOrderCancel**](LinearOrderCancel.md)|  |

### Return type

[**LinearCancelOrderEnvelope**](LinearCancelOrderEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linearOrderNew"></a>
# **linearOrderNew**
> LinearCreateOrderEnvelope linearOrderNew(body)

Create Active Order

This will create linear order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.LinearOrderApi;


LinearOrderApi apiInstance = new LinearOrderApi();
LinearOrderCreate body = new LinearOrderCreate(); // LinearOrderCreate | 
try {
    LinearCreateOrderEnvelope result = apiInstance.linearOrderNew(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearOrderApi#linearOrderNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinearOrderCreate**](LinearOrderCreate.md)|  |

### Return type

[**LinearCreateOrderEnvelope**](LinearCreateOrderEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linearOrderReplace"></a>
# **linearOrderReplace**
> LinearCreateOrderEnvelope linearOrderReplace(body)

Replace Active Order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.LinearOrderApi;


LinearOrderApi apiInstance = new LinearOrderApi();
LinearOrderReplace body = new LinearOrderReplace(); // LinearOrderReplace | 
try {
    LinearCreateOrderEnvelope result = apiInstance.linearOrderReplace(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearOrderApi#linearOrderReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinearOrderReplace**](LinearOrderReplace.md)|  |

### Return type

[**LinearCreateOrderEnvelope**](LinearCreateOrderEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

