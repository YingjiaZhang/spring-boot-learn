package pres.zy.springsecurity.study.jwt;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JwtTest {

    private static final String CLAIM_KEY_USER_ID = "uid";

    @Test
    public void should_generate_jwt_token() throws Exception {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USER_ID, "Z");
        System.out.println(JwtUtil.generateToken(claims));
    }

    @Test
    public void should_get_claim_from_jwt_token() throws Exception {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USER_ID, "Z");
        String token = JwtUtil.generateToken(claims);
        System.out.println(JwtUtil.getClaimsFromToken(token));
    }



}
