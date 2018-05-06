package com.lvtinger.account.impl.domain;

import com.lvtinger.core.object.PersistentObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account extends PersistentObject<Long> {
    private static final long serialVersionUID = 6069672828235736223L;

    private String username;
    private String password;
    private Integer status;

}