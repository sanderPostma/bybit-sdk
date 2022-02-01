/*
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.0.1
 * Contact: IT@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.bybit.sdk.api;

import com.bybit.sdk.model.JsonRpcEnvelope;
import com.bybit.sdk.model.LinearMyPositionEnvelope;
import com.bybit.sdk.model.LinearSetLeverage;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LinearPositionsApi
 */
@Ignore
public class LinearPositionsApiTest {

    private final LinearPositionsApi api = new LinearPositionsApi();

    /**
     * Get my position list.
     *
     * This will get my position list.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void linearPositionsMyPositionTest() throws Exception {
        String symbol = null;
        LinearMyPositionEnvelope response = api.linearPositionsMyPosition(symbol);

        // TODO: test validations
    }
    /**
     * Set leverage
     *
     * This will Set Leverage
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void linearPositionsSaveLeverageTest() throws Exception {
        LinearSetLeverage body = null;
        JsonRpcEnvelope response = api.linearPositionsSaveLeverage(body);

        // TODO: test validations
    }
}
