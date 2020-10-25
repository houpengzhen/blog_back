package com.blog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {

    private String tokenn;

    public JwtToken(String jwt){
        this.tokenn = jwt;
    }

    @Override
    public Object getPrincipal() {
        return tokenn;
    }

    @Override
    public Object getCredentials() {
        return tokenn;
    }
}
