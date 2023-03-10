package io.quarkus.oidc.runtime;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import io.quarkus.oidc.OidcTenantConfig;

public class OidcRecorderTest {

    @Test
    public void testtoProxyOptionsWithHostCheckPresent() {
        OidcTenantConfig.Proxy proxy = new OidcTenantConfig.Proxy();
        proxy.host = Optional.of("server.example.com");
        assertTrue(OidcRecorder.toProxyOptions(proxy).isPresent());
    }

    @Test
    public void testtoProxyOptionsWithoutHostCheckNonPresent() {
        OidcTenantConfig.Proxy proxy = new OidcTenantConfig.Proxy();
        assertFalse(OidcRecorder.toProxyOptions(proxy).isPresent());
    }

}
