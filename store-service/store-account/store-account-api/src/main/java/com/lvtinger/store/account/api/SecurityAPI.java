package com.lvtinger.store.account.api;

import com.lvtinger.core.object.ActionResponse;

/**
 * 账户安全接口
 */
public interface SecurityAPI {
    /**
     * 修改密码
     * @param accountId
     * @param password
     * @return
     */
    ActionResponse<String> change(Long accountId, String password);

    /**
     * 忘记密码
     * @param username
     * @return
     */
    ActionResponse<String> forget(String username);

    /**
     * 重置密码
     * @param username
     * @param password
     * @return
     */
    ActionResponse<String> reset(String username, String password);
}