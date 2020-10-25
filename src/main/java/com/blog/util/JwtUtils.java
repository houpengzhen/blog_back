package com.blog.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import sun.awt.SunHints;

import java.util.Date;

@Component
@ConfigurationProperties(prefix = "markerhub.jwt")
public class JwtUtils {

    @Value("${markerhub.jwt.secret:#{null}}")
    private String secret;
    @Value("${markerhub.jwt.expire:#{null}}")
    private long expire;
    @Value("${markerhub.jwt.header:#{null}}")
    private String header;

    public String generateToken(String userId){
        Date nowDate = new Date();
        // token 过期时间
        Date expirDate = new Date(nowDate.getTime() + expire * 1000);

        return Jwts.builder().setHeaderParam("typ","JWT").setSubject(userId+"").setIssuedAt(nowDate).setExpiration(expirDate).signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    public Claims getClaimByToken(String token){
        try{
            return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 判断token是否过期
     * @param expiration
     * @return true -> 过期
     */
    public boolean isTokenExpired(Date expiration){
        return expiration.before(new Date());
    }

}
