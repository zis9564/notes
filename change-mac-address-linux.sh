#!/usr/bin/env bash

sudo ip link set dev wlp3s0 down
sudo ip link set dev wlp3s0 address 88:2F:02:78:D1:9A
sudo ip link set dev wlp3s0 up