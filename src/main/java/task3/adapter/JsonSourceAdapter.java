package task3.adapter;

import task3.json.JsonSource;
import task3.yml.YmlSource;

public class JsonSourceAdapter extends YmlSource {
    private final JsonSource jsonSource;

    public JsonSourceAdapter(JsonSource jsonSource) {
        this.jsonSource = jsonSource;
    }

    @Override
    public String getData() {
        return jsonSource.getBody().toUpperCase();
    }
}
