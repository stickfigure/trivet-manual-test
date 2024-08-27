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
}
