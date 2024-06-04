package homework3.task3.adapter;

import homework3.task3.json.JsonSource;
import homework3.task3.yml.YmlSource;

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
