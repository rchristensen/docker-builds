#!/bin/bash

cd $HOME/sample

sbt -Dsbt.version=0.13.9 compile

sbt ++2.11.7 compile

cd /
