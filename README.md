# simhttp

To start server in port 5000

    lein ring server-headless 5000

To test file uploading using HTTP POST:

    curl -X POST -F file=@<path-to-file> http://<host-ip>:5000

To test file uploading using HTTP PUT:

    curl -X PUT -F file=@test.txt http://localhost:3000

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2015 FIXME
