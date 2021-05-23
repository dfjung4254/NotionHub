FROM node:14.13.0-alpine

# create destination directory
WORKDIR /front

# update and install dependency
RUN apk update && apk upgrade
RUN apk add git
RUN apk add bash

# copy the app, note .dockerignore
COPY . /front/
RUN yarn install

# build necessary, even if no static files are needed,
# since it builds the server as well
RUN yarn build

# set app serving to permissive / assigned
ENV NUXT_HOST=0.0.0.0
# set app port
ENV NUXT_PORT=80

# default : dev-api-server
ENV BASE_URL=http://34.64.211.184:8080

# start the app
CMD [ "yarn", "start" ]
