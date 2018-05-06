package com.lvtinger.store.account.api;

import com.lvtinger.core.object.ActionResponse;

/**
 * 注册接口
 */
public interface RegisterAPI {
    /**
     * 账户存在
     * @param username
     * @return
     */
    ActionResponse<Boolean> exists(String username);

    /**
     * 注册账户
     * @param username
     * @param password
     * @return
     */
    ActionResponse<Boolean> register(String username, String password);
}