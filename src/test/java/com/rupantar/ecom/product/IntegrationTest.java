package com.rupantar.ecom.product;

import com.rupantar.ecom.product.config.AsyncSyncConfiguration;
import com.rupantar.ecom.product.config.EmbeddedMongo;
import com.rupantar.ecom.product.config.EmbeddedRedis;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ProductserviceApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedMongo
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
