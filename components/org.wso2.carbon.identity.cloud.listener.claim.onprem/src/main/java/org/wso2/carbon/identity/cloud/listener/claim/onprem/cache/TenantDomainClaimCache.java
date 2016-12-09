/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.cloud.listener.claim.onprem.cache;

import org.wso2.carbon.identity.application.common.cache.BaseCache;

/**
 * Cache for caching domain name with a single reference.
 */
public class TenantDomainClaimCache extends BaseCache<TenantDomainClaimCacheKey, TenantDomainClaimCacheEntry> {

    private static final String SESSION_DATA_CACHE_NAME = "TenantDomainClaimCache";

    private static volatile TenantDomainClaimCache instance;

    private TenantDomainClaimCache() {
        super(SESSION_DATA_CACHE_NAME);
    }

    public static TenantDomainClaimCache getInstance() {
        if (instance == null) {
            synchronized (TenantDomainClaimCache.class) {
                if (instance == null) {
                    instance = new TenantDomainClaimCache();
                }
            }
        }
        return instance;
    }
}