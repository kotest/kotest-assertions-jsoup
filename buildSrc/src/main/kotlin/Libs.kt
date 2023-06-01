object Libs {

   const val kotlinVersion = "1.4.31"
   const val org = "io.kotest.extensions"

   object Kotlin {
      const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
   }

   object Kotest {
      private const val version = "4.4.3"
      const val assertionsShared = "io.kotest:kotest-assertions-shared:$version"
      const val assertionsCore = "io.kotest:kotest-assertions-core:$version"
      const val api = "io.kotest:kotest-framework-api:$version"
      const val junit5 = "io.kotest:kotest-runner-junit5-jvm:$version"
   }

   object JSoup {
      const val jsoup = "org.jsoup:jsoup:1.16.1"
   }
}
