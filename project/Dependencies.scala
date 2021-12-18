import sbt._

object Dependencies {

  object Versions {
    val zio            = "1.0.11"
    val zioReactive    = "1.3.5"
    val zioCluster     = "0.2.0"
    val zioLogging     = "0.5.14"
    val zioKafka       = "0.15.0"
    val zioMetrics     = "1.0.12"
    val zioConfig      = "1.0.6"
    val akka           = "2.6.17"
    val circe          = "0.13.0"
    val slick          = "3.3.3"
    val akkaHttp       = "10.2.7"
    val slf4j          = "1.7.29"
    val enumeratum     = "1.6.1"
    val sttp           = "3.3.5"
    val jwtCirce       = "8.0.2"
    val grpcNetty      = "1.40.1"
    val bouncyCastle   = "1.69"
    val bouncyGPG      = "2.3.0"
    val alpakkaFtp     = "3.0.3"
    val scopt          = "4.0.1"
    val scalaPB        = "1.18.1-1"
    val scalaCSVParser = "0.13.1"
    val flywaydb       = "8.0.3"
    val scalaXml       = "2.0.1"

    object Test {
      val containers = "0.39.5"
      val kafka      = "2.8.1"
      val gatling    = "3.4.0"
    }
  }


    // val scalapbRuntime        = "com.thesamet.scalapb"                               %% "scalapb-runtime"                         % scalapb.compiler.Version.scalapbVersion
    // val scalapbRuntimeProto   = "com.thesamet.scalapb"                               %% "scalapb-runtime"                         % scalapb.compiler.Version.scalapbVersion % "protobuf"
    // val scalapbRuntimeGrpc    = "com.thesamet.scalapb"                               %% "scalapb-runtime-grpc"                    % scalapb.compiler.Version.scalapbVersion

    val allDeps = List(
      "dev.zio"                                            %% "zio"                                     % Versions.zio,
      "dev.zio"                                            %% "zio-streams"                             % Versions.zio,
      "dev.zio"                                            %% "zio-kafka"                               % Versions.zioKafka,
      "dev.zio"                                            %% "zio-interop-reactivestreams"             % Versions.zioReactive,
      "dev.zio"                                            %% "zio-akka-cluster"                        % Versions.zioCluster,
      "dev.zio"                                            %% "zio-config"                              % Versions.zioConfig,
      "dev.zio"                                            %% "zio-config-typesafe"                     % Versions.zioConfig,
      "dev.zio"                                            %% "zio-logging"                             % Versions.zioLogging,
      "dev.zio"                                            %% "zio-logging-slf4j"                       % Versions.zioLogging,
      "dev.zio"                                            %% "zio-logging-slf4j-bridge"                % Versions.zioLogging,
      "dev.zio"                                            %% "zio-metrics-prometheus"                  % Versions.zioMetrics,
      "com.typesafe.akka"                                  %% "akka-actor"                              % Versions.akka,
      "com.typesafe.slick"                                 %% "slick"                                   % Versions.slick,
      "com.typesafe.slick"                                 %% "slick-hikaricp"                          % Versions.slick,
      "io.circe"                                           %% "circe-core"                              % Versions.circe,
      "io.circe"                                           %% "circe-generic"                           % Versions.circe,
      "io.circe"                                           %% "circe-generic-extras"                    % Versions.circe,
      "io.circe"                                           %% "circe-parser"                            % Versions.circe,
      "com.typesafe.akka"                                  %% "akka-stream"                             % Versions.akka,
      "com.typesafe.akka"                                  %% "akka-http-core"                          % Versions.akkaHttp,
      // "com.typesafe.akka"                                  %% "akka-http-xml"                           % Versions.akkaHttp,
      "com.beachape"                                       %% "enumeratum"                              % Versions.enumeratum,
      "com.beachape"                                       %% "enumeratum-circe"                        % Versions.enumeratum,
      "com.github.jwt-scala"                               %% "jwt-circe"                               % Versions.jwtCirce,
      "com.softwaremill.sttp.client3"                      %% "core"                                    % Versions.sttp,
      "com.softwaremill.sttp.client3"                      %% "async-http-client-backend-zio"           % Versions.sttp,
      "com.softwaremill.sttp.client3"                      %% "circe"                                   % Versions.sttp,
      "io.grpc"                                             % "grpc-netty"                              % Versions.grpcNetty,
      "org.bouncycastle"                                    % "bcpkix-jdk15on"                          % Versions.bouncyCastle,
      "org.bouncycastle"                                    % "bcpg-jdk15on"                            % Versions.bouncyCastle,
      "name.neuhalfen.projects.crypto.bouncycastle.openpgp" % "bouncy-gpg"                              % Versions.bouncyGPG,
      "com.lightbend.akka"                                 %% "akka-stream-alpakka-ftp"                 % Versions.alpakkaFtp,
      "com.github.scopt"                                   %% "scopt"                                   % Versions.scopt,
      // "com.thesamet.scalapb.common-protos"                 %% "proto-google-common-protos-scalapb_0.11" % Versions.scalaPB                        % "protobuf",
      // "com.thesamet.scalapb.common-protos"                 %% "proto-google-common-protos-scalapb_0.11" % Versions.scalaPB,
      "io.github.zamblauskas"                              %% "scala-csv-parser"                        % Versions.scalaCSVParser,
      "org.scala-lang.modules"                             %% "scala-xml"                               % Versions.scalaXml,
      "dev.zio"                 %% "zio-test"                   % Versions.zio             % "test",
      "dev.zio"                 %% "zio-test-sbt"               % Versions.zio             % "test",
      "dev.zio"                 %% "zio-test-magnolia"          % Versions.zio             % "test",
      "org.slf4j"                % "slf4j-nop"                  % Versions.slf4j           % "test",
      "com.h2database"           % "h2"                         % "1.4.200"                % "test",
      "org.flywaydb"             % "flyway-core"                % Versions.flywaydb        % "test",
      "com.dimafeng"            %% "testcontainers-scala-mysql" % Versions.Test.containers % "test",
      "mysql"                    % "mysql-connector-java"       % "8.0.24"                 % "test",
      "io.github.embeddedkafka" %% "embedded-kafka"             % Versions.Test.kafka      % "test",
      "io.gatling.highcharts" % "gatling-charts-highcharts" % Versions.Test.gatling % "test",
      "io.gatling"            % "gatling-test-framework"    % Versions.Test.gatling % "test"
    )

    val zioTestFramework = new TestFramework("zio.test.sbt.ZTestFramework")
}