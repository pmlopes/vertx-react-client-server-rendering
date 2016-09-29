#!/usr/bin/env bash
gulp
mvn package
java -jar target/react-isomorphic-2015-fat.jar \
  --redeploy="src/main/jsx/**/*.jsx,src/main/java/**/*.java,src/main/resources/**/*.ftl" \
  --on-redeploy="./devmode.sh"
