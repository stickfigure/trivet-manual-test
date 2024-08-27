plugins {
	application
}

repositories {
    mavenCentral()
	mavenLocal()
}

dependencies {
	implementation(project(":interface"))
	implementation("com.voodoodyne.trivet:trivet:2.1-SNAPSHOT")

	implementation("org.eclipse.jetty:jetty-server:12.0.8")
	implementation("org.eclipse.jetty.ee10:jetty-ee10-webapp:12.0.8")
}
