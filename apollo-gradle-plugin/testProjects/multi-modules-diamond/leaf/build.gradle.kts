plugins {
  kotlin("jvm")
  id("com.apollographql.apollo")
  id("application")
}

dependencies {
  implementation(kotlin("stdlib"))
  testImplementation(kotlin("test-junit"))

  implementation(project(":node1"))
  apollo(project(":node1"))
  implementation(project(":node2"))
  apollo(project(":node2"))
}

application {
  mainClass.set("LeafKt")
}
