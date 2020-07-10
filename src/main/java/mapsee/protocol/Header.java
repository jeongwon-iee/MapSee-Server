package mapsee.protocol;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Header {
    private String namespace;
    private String name;
    private String messageId;
    private String dialogRequestId;

    public String identifier() {
        return String.format("%s.%s", this.namespace, this.name);
    }
}
