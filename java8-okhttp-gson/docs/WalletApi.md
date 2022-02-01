# WalletApi

All URIs are relative to *//api.bybit.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletGetBalance**](WalletApi.md#walletGetBalance) | **GET** /v2/private/wallet/balance | get wallet balance info

<a name="walletGetBalance"></a>
# **walletGetBalance**
> WalletBalanceEnvelope walletGetBalance(coin)

get wallet balance info

### Example
```java
// Import classes:
//import com.bybit.sdk.handler.ApiException;
//import com.bybit.sdk.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String coin = "coin_example"; // String | Coin.enum {BTC,EOS,XRP,ETH,USDT}
try {
    WalletBalanceEnvelope result = apiInstance.walletGetBalance(coin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#walletGetBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coin** | **String**| Coin.enum {BTC,EOS,XRP,ETH,USDT} | [optional]

### Return type

[**WalletBalanceEnvelope**](WalletBalanceEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

