package example.domain.indentifier;

import java.util.UUID;

/**
 * 予約番号
 */
public class RequestNumber {
    UUID value;

    public RequestNumber() {};

    private RequestNumber(UUID value) {
        this.value = value;
    }

    public static RequestNumber generate() {
        return new RequestNumber(UUID.randomUUID());
    }

    public static RequestNumber from(String uuidText) {
        return new RequestNumber(UUID.fromString(uuidText));
    }
}
