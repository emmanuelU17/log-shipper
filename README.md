# Simple Java application that ships application logs to discord channel using webhooks

## Getting started
In your cli ``
clear && mvn clean package -DskipTests && java -Dmessage=<enter-message-to-send> -DDISCORD_WEBHOOK_URL=<enter-discord-webhook-url> -jar target/log-shipper-1.0-SNAPSHOT-jar-with-dependencies.jar
``

## Technologies
1. Java 21

## Dependencies
1. Maven assembly-plugin to package application with the necessary dependencies
2. Jakarta json-api and Parsson to convert objects to json
3. Assertj-core and Junit jupiter-engine for testing.

## Discord
1. [Markdown Text 101 (Chat Formatting: Bold, Italic, Underline)](https://support.discord.com/hc/en-us/articles/210298617-Markdown-Text-101-Chat-Formatting-Bold-Italic-Underline)
2. [Developer docs allowed-mentions-object](https://discord.com/developers/docs/resources/channel#allowed-mentions-object)