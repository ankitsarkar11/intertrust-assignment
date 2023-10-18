#!/bin/bash
./allure-2.21.0/bin/allure generate
echo "Reports at: https://reports.testkube.olympus.ankitsarkar.com/$(cut -c 5-9 <<< '$(echo $HOSTNAME)')/index.html"
