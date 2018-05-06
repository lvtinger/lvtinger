package com.lvtinger.account.impl.service;

import com.lvtinger.core.object.ActionResponse;
import com.lvtinger.store.account.api.SecurityAPI;

public class SecurityService implements SecurityAPI {
    public ActionResponse<String> change(Long accountId, String password) {
        return null;
    }

    public ActionResponse<String> forget(String username) {
        return null;
    }

    public ActionResponse<String> reset(String username, String password) {
        return null;
    }
}