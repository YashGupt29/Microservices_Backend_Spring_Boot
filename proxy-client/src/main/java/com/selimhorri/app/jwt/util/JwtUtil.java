package com.selimhorri.app.jwt.util;

import io.jsonwebtoken.Claims;
import java.util.Date;
import java.util.function.Function;
import org.springframework.security.core.userdetails.UserDetails;

public interface JwtUtil {

  String extractUsername(final String token);

  Date extractExpiration(final String token);

  <T> T extractClaims(final String token, final Function<Claims, T> claimsResolver);

  String generateToken(final UserDetails userDetails);

  Boolean validateToken(final String token, final UserDetails userDetails);
}
