#!/bin/bash

HOST=${WEB_HOST:-localhost}
PORT=${WEB_PORT:-8081}

read -r -d '' JSON <<EOF
{
  "url": "http://${HOST}:${PORT}/api/post-broker"
}
EOF

echo $JSON > config.json

"$@"
