package com.bill99.mam.platform.remote.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.bill99.mam.platform.remote.dto.RemoteBaseResponse;

@Getter
@Setter
@ToString(callSuper = true)
public class HatBankCardAuthResp extends RemoteBaseResponse {
    private static final long serialVersionUID = -5278152284611680053L;
    private String token;
}
