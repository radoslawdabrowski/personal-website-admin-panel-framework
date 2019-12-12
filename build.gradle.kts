import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("plugin.jpa") version "1.2.71"
	id("org.springframework.boot") version "2.1.5.RELEASE"
	id("io.spring.dependency-management") version "1.0.7.RELEASE"
	war
	kotlin("jvm") version "1.2.71"
	kotlin("plugin.spring") version "1.2.71"
	id ("io.github.ddimtirov.codacy") version "0.1.0"
	jacoco
}

group = "pl.radoslawdabrowski"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_12

repositories {
	maven { setUrl("http://dl.bintray.com/typesafe/maven-releases/com/typesafe/netty/netty-http-pipelining/") }
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect:2.4.1")
	implementation("org.webjars:bootstrap:4.3.1")
	implementation("org.mapstruct:mapstruct:1.3.0.Final")
	implementation("org.projectlombok:lombok:1.18.10")

	annotationProcessor("org.mapstruct:mapstruct-processor:1.3.0.Final")

	compile("io.springfox:springfox-swagger2:2.7.0")
	compile("io.springfox:springfox-swagger2:2.7.0")

	compileOnly("ch.qos.logback:logback-classic:1.2.3")
	runtimeOnly("org.springframework.boot:spring-boot-devtools")
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

tasks.jacocoTestReport {
	reports {
		xml.isEnabled = true
	}
}

codacy {
	toolVersion = "2.0.0"
}
