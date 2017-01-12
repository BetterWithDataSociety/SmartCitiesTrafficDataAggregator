#!/bin/bash

curl -u admin:admin -X POST -F 'datafile=@./example_counts.tsv' http://localhost:8080/traffic
curl -u admin:admin -X POST -F 'datafile=@./example_counts.json' http://localhost:8080/traffic
