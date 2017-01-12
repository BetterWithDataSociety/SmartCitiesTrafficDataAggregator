#!/bin/bash

curl -X POST -F 'datafile=@./example_counts.tsv' http://demo.semweb.co/iot/traffic
curl -X POST -F 'datafile=@./example_counts.json' http://demo.semweb.co/iot/traffic
