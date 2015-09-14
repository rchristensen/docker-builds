#!/bin/bash

# Triggers an sbt launch for all versions listed below, triggering jar downloads for sbt itself
# Then triggers the sample sbt project compilation for all scala versions listed below, to download
# the compiler interface, and compile it.

sbt_versions=("0.13.9" "0.13.8" "0.13.7" "0.13.6" "0.13.5" "0.13.2" "0.13.0")
scala_versions=("2.11.7" "2.11.6" "2.11.5" "2.11.4" "2.11.2" "2.11.1" "2.11.0" "2.10.5" "2.10.4" "2.10.3" "2.10.2" "2.10.1" "2.10.0")

cd $HOME/sample

for v in "${sbt_versions[@]}"
do :
    sbt -Dsbt.version=$v compile
done

for v in "${scala_versions[@]}"
do :
    sbt ++${v} compile
done

cd /
