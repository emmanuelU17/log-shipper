package org.log.shipper;

import jakarta.json.Json;

import java.net.URI;

final class LoggerUtil {

    static final URI uri;

    static {
        final String url = System.getProperty("DISCORD_WEBHOOK_URL");
        if (url == null || url.isBlank()) throw new CustomNotFoundException("Please specify webhook url");
        uri = URI.create(url);
    }

    static String toJson(final String message) {
        return Json.createObjectBuilder().add("content", message).build().toString();
    }

}
