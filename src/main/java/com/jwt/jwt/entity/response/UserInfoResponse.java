package com.jwt.jwt.entity.response;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserInfoResponse {
    private Long id;
    private String username;
    private List<String> roles;
}
