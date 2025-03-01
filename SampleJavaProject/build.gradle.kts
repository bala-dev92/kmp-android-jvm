plugins {
    id("java")
}

group = "com.bala.kmpsample"
version = "unspecified"


dependencies {
    implementation(project(":KmpLibrary"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}