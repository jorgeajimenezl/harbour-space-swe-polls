plugins {
	java
	id("io.freefair.lombok") version "8.12.2"
	// id("org.springframework.boot") version "3.4.3"
	// id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	// implementation("org.springframework.boot:spring-boot-starter")
	// testImplementation("org.springframework.boot:spring-boot-starter-test")
	// testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.springframework:spring-context:6.1.6")
	testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
