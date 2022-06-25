/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.data.r2dbc.postgres.jsonb;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.r2dbc.annotation.R2dbcRepository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@R2dbcRepository(dialect = Dialect.POSTGRES)
public interface SalePgJsonbRepository extends CrudRepository<SalePgJsonb, Long> {

    @Override
    @Join(value = "items", type = Join.Type.LEFT_FETCH)
    Optional<SalePgJsonb> findById(@NonNull Long id);

    void updateData(@Id Long id, @Parameter("data") Map<String, String> data, @Parameter("dataList") List<String> dataList);

}
