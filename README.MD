


gradle 使用的配置

```text

plugins {
    id 'org.springframework.boot' version '2.4.4'
    id 'io.spring.dependency-management' version '1.0.11.RELEASE'
    id 'java'
}

group = 'com.arc'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '1.8'

configurations {mavenCentral
    compileOnly {
        extendsFrom annotationProcessor
    }
}

repositories {
    mavenCentral()
}

ext {
    set('springCloudVersion', "2020.0.2")
}

dependencies {


    // web
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-websocket'
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'


    // 结构化存储 mysql
    runtimeOnly 'mysql:mysql-connector-java'

    // dao
    //implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.4'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-jdbc'
    implementation 'org.springframework.boot:spring-boot-starter-data-jdbc'

    // 非结构化存储 mongodb
    //implementation 'org.springframework.boot:spring-boot-starter-data-mongodb'
    //implementation 'org.springframework.boot:spring-boot-starter-data-mongodba-redis'

    // cache

    // mq
    //implementation 'org.springframework.boot:spring-boot-starter-amqp'
    //implementation 'org.springframework.kafka:spring-kafka'

    // 健康管理
    //implementation 'org.springframework.boot:spring-boot-starter-actuator'
    //implementation 'org.springframework.cloud:spring-cloud-sleuth-zipkin'

    // 批量操作
    //implementation 'org.springframework.boot:spring-boot-starter-batch'

    // 安全
    //implementation 'org.springframework.boot:spring-boot-starter-security'
    //implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity5'

    // 邮件
    //implementation 'org.springframework.boot:spring-boot-starter-mail'

    // 定时操作
    //implementation 'org.springframework.boot:spring-boot-starter-quartz'

    // 校验
    implementation 'org.springframework.boot:spring-boot-starter-validation'

    // 开发工具
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'

    // lang3 https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
    implementation group: 'org.apache.commons', name: 'commons-lang3', version: '3.12.0'

    // test
    //testImplementation 'org.springframework.boot:spring-boot-starter-test'
    //testImplementation 'org.springframework.amqp:spring-rabbit-test'
    //testImplementation 'org.springframework.batch:spring-batch-test'
    //testImplementation 'org.springframework.kafka:spring-kafka-test'
    //testImplementation 'org.springframework.security:spring-security-test'
}

dependencyManagement {
    imports {
        mavenBom "org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"
    }
}

test {
    useJUnitPlatform()
}

```