plugins {
  kotlin("jvm")
  id("com.apollographql.apollo")
  id("application")
}

dependencies {
  implementation(kotlin("stdlib"))
  testImplementation(kotlin("test-junit"))

  implementation(project(":node"))
  apollo(project(":node"))
  apollo(project(":root"))
}

application {
  mainClass.set("LeafKt")
}

apollo {
  generateKotlinModels.set(true)
}