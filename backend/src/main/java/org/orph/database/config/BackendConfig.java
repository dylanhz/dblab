package org.orph.database.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.orph.database.mapper")
public class BackendConfig {

}
