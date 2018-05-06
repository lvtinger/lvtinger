package com.lvtinger.store.account.api;

import com.lvtinger.core.object.ActionResponse;

/**
 * 登录接口
 */
public interface LoginAPI {
    ActionResponse<String> login(String username, String password);
    ActionResponse<Boolean> exists(String username);
}
