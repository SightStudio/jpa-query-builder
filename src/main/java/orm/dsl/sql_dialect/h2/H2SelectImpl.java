package orm.dsl.sql_dialect.h2;

import orm.TableEntity;
import orm.dsl.dml.SelectImpl;

public class H2SelectImpl<E> extends SelectImpl<E> {

    public H2SelectImpl(TableEntity<E> tableEntity) {
        super(tableEntity);
    }
}
