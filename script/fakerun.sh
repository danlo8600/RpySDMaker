#!/bin/bash

echo /dev/mmcblk0 > cnsys

mv cnsys ../dist

cd ../dist

java -jar RpyMakeSD.jar

rm cnsys

