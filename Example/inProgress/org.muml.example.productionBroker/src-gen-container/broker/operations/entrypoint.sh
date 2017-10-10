#!/bin/bash

HOST=${WEB_HOST:-localhost}
PORT=${WEB_PORT:-3000}

read -r -d '' JSON <<EOF
{
  "baseurl": "http://${HOST}:${PORT}/api/"
}
EOF

echo $JSON > config.json

"$@"
