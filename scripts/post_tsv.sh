#!/bin/bash

curl -X POST -F 'datafile=@./example_counts.tsv' http://localhost:8080/traffic
curl -X POST -F 'datafile=@./example_counts.json' http://localhost:8080/traffic
