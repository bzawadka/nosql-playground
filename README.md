[![Build Status](https://travis-ci.org/bzawadka/nosql-playground.svg?branch=master)](https://travis-ci.org/bzawadka/nosql-playground)
[![codecov.io](https://codecov.io/github/bzawadka/nosql-playground/coverage.svg?branch=master)](https://codecov.io/github/bzawadka/nosql-playground?branch=master)

# nosql-playground

## MongoDB - document store
http://db-engines.com/en/article/Document+Stores

show dbs
use myDb
show collections

db.users.insert({username:"dafi",password:"duck"})
db.users.save({username:"micky",password:"g11k2jlkdas"})
db.users.find()
db.users.remove({"username":"micky"}  )
db.users.ensureIndex({username:1})
db.users.getIndices( )


## Cassandra - wide column store
http://db-engines.com/en/article/Wide+Column+Stores
