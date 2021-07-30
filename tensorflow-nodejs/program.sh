#!/bin/bash


shadow(){
    ./node_modules/.bin/shadow-cljs "$@"
}

dev(){
    yarn
    shadow watch program
}

entry(){
    node target/main.js
}

release(){
    yarn
    shadow -A:core release program
}


"$@"
