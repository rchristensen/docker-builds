#!/bin/bash

cd $HOME/sample-deps

sbt ++2.11.7 test:compile

cd /
