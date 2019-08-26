package com.mezeron.multitenancy;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;


@Component
public class TenantIdentifierResolver implements CurrentTenantIdentifierResolver {

    @Override
    public String resolveCurrentTenantIdentifier() {
        String tenantId =ThreadLocalUtil.getTenant();
        System.out.println("resolveCurrentTenantIdentifier->tenantId:"+tenantId);
        if (tenantId != null) {
            return tenantId;
        }
        return "db1";
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
