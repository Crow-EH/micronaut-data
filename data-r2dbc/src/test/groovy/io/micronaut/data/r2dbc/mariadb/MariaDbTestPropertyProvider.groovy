package io.micronaut.data.r2dbc.mariadb

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.SharedTestResourcesDatabaseTestPropertyProvider
import io.micronaut.data.r2dbc.TestResourcesDatabaseTestPropertyProvider

trait MariaDbTestPropertyProvider implements SharedTestResourcesDatabaseTestPropertyProvider {

    @Override
    Dialect dialect() {
        return Dialect.MYSQL
    }

    @Override
    String dbType() {
        return "mariadb"
    }

    @Override
    int sharedSpecsCount() {
        return 10
    }
}
