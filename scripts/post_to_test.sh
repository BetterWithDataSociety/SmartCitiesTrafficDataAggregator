#!/bin/bash

curl -u admin:admin -X POST -F 'datafile=@./example_counts.tsv' http://demo.semweb.co/iot/traffic
curl -u admin:admin -X POST -F 'datafile=@./example_counts.json' http://demo.semweb.co/iot/traffic
