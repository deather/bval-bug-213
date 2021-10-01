#! /bin/sh

TOMEE_PLUS_URL="https://dlcdn.apache.org/tomee/tomee-8.0.8/apache-tomee-8.0.8-plus.tar.gz"
TOMEE_FOLDER="apache-tomee-plus-8.0.8"
TOMEE_ARCHIVE="${TOMEE_FOLDER}.tar.gz"

if [ ! -e "${TOMEE_ARCHIVE}" ]; then
  wget "${TOMEE_PLUS_URL}" -O "${TOMEE_ARCHIVE}" || exit 1
fi

if [ ! -e "${TOMEE_FOLDER}" ]; then
  tar -xzf "${TOMEE_ARCHIVE}" || exit 1
fi

gradle war || exit 1

cp "build/libs/bug-bval.war" "${TOMEE_FOLDER}/webapps/" || exit 1

"${TOMEE_FOLDER}/bin/catalina.sh" jpda run
