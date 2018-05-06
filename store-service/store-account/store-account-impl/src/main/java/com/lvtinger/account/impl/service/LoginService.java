package com.lvtinger.account.impl.service;

import com.lvtinger.core.object.ActionResponse;
import com.lvtinger.store.account.api.LoginAPI;

public class LoginService implements LoginAPI {
    public ActionResponse<String> login(String username, String password) {
        return null;
    }

    public ActionResponse<Boolean> exists(String username) {
        return null;
    }
}
