USER = "$(shell id -u):$(shell id -g)"

app:
	docker-compose up -d

app-build:
	docker-compose build

app-bash:
	docker-compose run --user=$(USER) app bash

stop:
	docker-compose stop