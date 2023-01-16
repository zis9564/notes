#!/usr/bin/env bash

# set -x
set -e

plugins_dir=./kafka/connectors/ #директория хранения коннекторов
src_url_list=./kafka/connectors_list.txt #список uri необходимых коннекторов

# check dir plugins dir and download if the dir is empty.
if [ -n "$(ls -A $plugins_dir 2>/dev/null)" ];
	echo "connectors found.";
else	
	echo "fetching required connectors..";
	then wget -i $src_url_list -q -N -nv --directory-prefix=$plugins_dir;
	unzip -n -q $plugins_dir\*.zip -d $plugins_dir;
	rm $plugins_dir*.zip;
	echo "success.";
fi