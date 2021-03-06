package mapsee.protocol;

import com.google.gson.JsonElement;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Request {
    private Header header;
    private JsonElement payload;

    public String identifier() {
        return this.header.identifier();
    }
}
