package com.sandyhandle.webapp.finathon.application.services;

import com.sandyhandle.webapp.finathon.application.entities.AppUser;
import com.sandyhandle.webapp.finathon.application.entities.dto.*;

public interface AuthenticationService {
    AppUser signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signIn(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

    void signout(SignOutRequest signOutRequest);
}
