#!/bin/bash

for f in $(cat .gitignore); do
  if [[ -d $f ]]; then
    echo "Deleting contents of $f ..." 
    rm -rf $f/*
  fi
done

rm -rf hu.bme.mit.mdsd.dns2016.drones.behaviour/src/*
rm -rf hu.bme.mit.mdsd.dns2016.drones/src/*
