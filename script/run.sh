#!/bin/bash

ls /dev/mmcblk0 > cnsys

mv cnsys ../dist

cd ../dist

java -jar RpySDMaker.jar

rm cnsys
