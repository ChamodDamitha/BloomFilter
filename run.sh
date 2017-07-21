#!/bin/bash
java -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=settings=profile,duration=30s,dumponexit=true,filename=bloom-filter-20-7-2017.jfr -Xmx8g -Xms8g -cp .:target/BloomFilter-1.0-SNAPSHOT.jar:classes:target/classes: Main
