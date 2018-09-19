# To build run

`docker build -t custom-scala --force-rm .`

# To run scala project

`docker run -ti --rm -v /{path to dir project}:/data custom-scala scala /data/{scala object to run}.scala`
