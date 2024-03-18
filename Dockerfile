FROM mysql:latest 
ENV MYSQL_ROOT_PASSWORD=rpassword
ENV MYSQL_PASSWORD=password
ENV MYSQL_USER=pino
ADD schema.sql /docker-entrypoint-initdb.d