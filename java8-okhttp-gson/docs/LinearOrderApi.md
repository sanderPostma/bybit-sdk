# LinearOrderApi

All URIs are relative to *//api.bybit.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conditionalOrderCancel**](LinearOrderApi.md#conditionalOrderCancel) | **POST** /private/linear/stop-order/cancel | Cancel Active Order
[**conditionalOrderNew**](LinearOrderApi.md#conditionalOrderNew) | **POST** /private/linear/stop-order/create | Create Active Order
[**conditionalOrderReplace**](LinearOrderApi.md#conditionalOrderReplace) | **POST** /private/linear/stop-order/replace | Replace Active Order
[**orderCancel**](LinearOrderApi.md#orderCancel) | **POST** /private/linear/order/cancel | Cancel Active Order
[**orderNew**](LinearOrderApi.md#orderNew) | **POST** /private/linear/order/create | Create Active Order
[**orderReplace**](LinearOrderApi.md#orderReplace) | **POST** /private/linear/order/replace | Replace Active Order

<a name="conditionalOrderCancel"></a>
# **conditionalOrderCancel**
> LinearCancelConditionalOrderEnvelope conditionalOrderCancel(body)

Cancel Active Order

This will cancel linear Conditional order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.LinearOrderApi;


LinearOrderApi apiInstance = new LinearOrderApi();
LinearConditionalOrderCancel body = new LinearConditionalOrderCancel(); // LinearConditionalOrderCancel | 
try {
    LinearCancelConditionalOrderEnvelope result = apiInstance.conditionalOrderCancel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearOrderApi#conditionalOrderCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinearConditionalOrderCancel**](LinearConditionalOrderCancel.md)|  |

### Return type

[**LinearCancelConditionalOrderEnvelope**](LinearCancelConditionalOrderEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conditionalOrderNew"></a>
# **conditionalOrderNew**
> LinearCreateConditionalOrderEnvelope conditionalOrderNew(body)

Create Active Order

This will create linear Conditional order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.LinearOrderApi;


LinearOrderApi apiInstance = new LinearOrderApi();
LinearConditionalOrderCreate body = new LinearConditionalOrderCreate(); // LinearConditionalOrderCreate | 
try {
    LinearCreateConditionalOrderEnvelope result = apiInstance.conditionalOrderNew(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearOrderApi#conditionalOrderNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinearConditionalOrderCreate**](LinearConditionalOrderCreate.md)|  |

### Return type

[**LinearCreateConditionalOrderEnvelope**](LinearCreateConditionalOrderEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="conditionalOrderReplace"></a>
# **conditionalOrderReplace**
> LinearConditionalCreateOrderEnvelope conditionalOrderReplace(body)

Replace Active Order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.LinearOrderApi;


LinearOrderApi apiInstance = new LinearOrderApi();
LinearConditionalOrderReplace body = new LinearConditionalOrderReplace(); // LinearConditionalOrderReplace | 
try {
    LinearConditionalCreateOrderEnvelope result = apiInstance.conditionalOrderReplace(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearOrderApi#conditionalOrderReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinearConditionalOrderReplace**](LinearConditionalOrderReplace.md)|  |

### Return type

[**LinearConditionalCreateOrderEnvelope**](LinearConditionalCreateOrderEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderCancel"></a>
# **orderCancel**
> LinearCancelOrderEnvelope orderCancel(body)

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
    LinearCancelOrderEnvelope result = apiInstance.orderCancel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearOrderApi#orderCancel");
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

<a name="orderNew"></a>
# **orderNew**
> LinearCreateOrderEnvelope orderNew(body)

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
    LinearCreateOrderEnvelope result = apiInstance.orderNew(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearOrderApi#orderNew");
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

<a name="orderReplace"></a>
# **orderReplace**
> LinearCreateOrderEnvelope orderReplace(body)

Replace Active Order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.LinearOrderApi;


LinearOrderApi apiInstance = new LinearOrderApi();
LinearOrderReplace body = new LinearOrderReplace(); // LinearOrderReplace | 
try {
    LinearCreateOrderEnvelope result = apiInstance.orderReplace(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinearOrderApi#orderReplace");
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

