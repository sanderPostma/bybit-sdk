# OrderApi

All URIs are relative to *//api.bybit.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderCancel**](OrderApi.md#orderCancel) | **DELETE** /spot/v1/order | Cancel active order
[**orderNew**](OrderApi.md#orderNew) | **POST** /spot/v1/order | Place active order
[**orderQuery**](OrderApi.md#orderQuery) | **GET** /spot/v1/order | Get active order

<a name="orderCancel"></a>
# **orderCancel**
> SpotCancelOrderEnvelope orderCancel(orderId, orderLinkId)

Cancel active order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | 
String orderLinkId = "orderLinkId_example"; // String | 
try {
    SpotCancelOrderEnvelope result = apiInstance.orderCancel(orderId, orderLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**|  | [optional]
 **orderLinkId** | **String**|  | [optional]

### Return type

[**SpotCancelOrderEnvelope**](SpotCancelOrderEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderNew"></a>
# **orderNew**
> SpotCreateOrderEnvelope orderNew(symbol, side, type, qty, price, timeInForce, orderLinkId)

Place active order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String symbol = "symbol_example"; // String | 
String side = "side_example"; // String | 
String type = "type_example"; // String | 
BigDecimal qty = new BigDecimal(); // BigDecimal | 
BigDecimal price = new BigDecimal(); // BigDecimal | 
TimeInForceSpot timeInForce = new TimeInForceSpot(); // TimeInForceSpot | 
String orderLinkId = "orderLinkId_example"; // String | 
try {
    SpotCreateOrderEnvelope result = apiInstance.orderNew(symbol, side, type, qty, price, timeInForce, orderLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | [optional]
 **side** | **String**|  | [optional]
 **type** | **String**|  | [optional]
 **qty** | **BigDecimal**|  | [optional]
 **price** | **BigDecimal**|  | [optional]
 **timeInForce** | [**TimeInForceSpot**](.md)|  | [optional]
 **orderLinkId** | **String**|  | [optional]

### Return type

[**SpotCreateOrderEnvelope**](SpotCreateOrderEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="orderQuery"></a>
# **orderQuery**
> SpotGetOrderEnvelope orderQuery(orderId, orderLinkId)

Get active order

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.OrderApi;


OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | 
String orderLinkId = "orderLinkId_example"; // String | 
try {
    SpotGetOrderEnvelope result = apiInstance.orderQuery(orderId, orderLinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**|  | [optional]
 **orderLinkId** | **String**|  | [optional]

### Return type

[**SpotGetOrderEnvelope**](SpotGetOrderEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

