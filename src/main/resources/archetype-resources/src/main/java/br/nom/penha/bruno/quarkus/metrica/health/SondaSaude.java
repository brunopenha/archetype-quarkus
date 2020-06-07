package br.nom.penha.bruno.penha.metrica.heath;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

@Health
@ApplicationScoped
public class SondaSaude implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.
        builder().
        name("quarkus").
        up().
        build();
    }

    
}