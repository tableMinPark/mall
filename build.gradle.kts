plugins {
	java
	id("org.springframework.boot") version "3.3.5"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.study"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	"developmentOnly"("org.springframework.boot:spring-boot-devtools")

	implementation("org.projectlombok:lombok")

//	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//	runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
