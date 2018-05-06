package com.lvtinger.account.impl.domain;

/**
 * 账户状态
 */
public interface AccountStatus {
    /**
     * 默认状态
     */
    int normal = 0;
    /**
     * 锁定状态
     */
    int locked = 1;
    /**
     * 忘记密码
     */
    int forget = 2;
}