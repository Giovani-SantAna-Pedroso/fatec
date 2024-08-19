#!/bin/bash

# get the day of the week 
DOW=$(date +%u)
DAY=$(date '+%Y-%m-%d')

if [ $DOW -eq 1 ]; then 
  cd ~/codes/fatec/s1/seg/ 
elif [ $DOW -eq 2 ]; then 
  cd ~/codes/fatec/s1/ter/ 
elif [ $DOW -eq 3 ]; then 
  cd ~/codes/fatec/s1/seg/ 
elif [ $DOW -eq 4 ]; then 
  cd ~/codes/fatec/s1/seg/ 
elif [ $DOW -eq 5 ]; then 
  cd ~/codes/fatec/s1/seg/ 
elif [ $DOW -eq 6 ]; then 
  cd ~/codes/fatec/s1/seg/ 
fi

mkdir $DAY
cd ./$DAY 
touch NOTES.md
tmux
