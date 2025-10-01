package co.com.patterns.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Query {
    private final String table;
    private List<String> fields;
    private List<String> conditions;
    private List<String> orderFields;
    private int limitCount;

    public Query(String table) {
        this.table = table;
    }

    public String getTable() {
        return table;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public List<String> getConditions() {
        return conditions;
    }

    public List<String> getOrderFields() {
        return orderFields;
    }

    public void setOrderFields(List<String> orderFields) {
        this.orderFields = orderFields;
    }

    public int getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(int limitCount) {
        this.limitCount = limitCount;
    }

    static class QueryBuilder {
        private final Query query;

        public QueryBuilder(String table) {
            query = new Query(table);
        }

        public QueryBuilder select(String... select) {
            query.setFields(List.of(select));
            return this;
        }

        public QueryBuilder where(String... wheres) {
            if (Objects.isNull(query.conditions)) {
                query.conditions = new ArrayList<>();
            }
            query.conditions.addAll(Arrays.asList(wheres));
            return this;
        }

        public QueryBuilder orderBy(String field, String direction) {
            query.setOrderFields(List.of(field, direction));
            return this;
        }

        public QueryBuilder limit(int limit) {
            query.setLimitCount(limit);
            return this;
        }

        public String execute() {
            String fieldsValue = String.join(", ", query.getFields());
            String conditionsValue = String.join(" and ", query.getConditions());
            String orderFieldsValue = String.join(" ", query.getOrderFields());

            return String.format("SELECT %s FROM %s WHERE %s ORDER BY %s LIMIT %d",
                    fieldsValue,
                    query.getTable(),
                    conditionsValue,
                    orderFieldsValue,
                    query.getLimitCount()
            );
        }
    }
}
