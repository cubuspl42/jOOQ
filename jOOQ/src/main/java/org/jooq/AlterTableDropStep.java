/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;


/**
 * The step in the <code>ALTER TABLE</code> DSL used to <code>DROP</code>
 * columns.
 *
 * @author Lukas Eder
 */
public interface AlterTableDropStep extends AlterTableFinalStep {

    /**
     * Add a <code>CASCADE</code> clause to the
     * <code>ALTER TABLE .. DROP COLUMN</code> statement.
     */
    @Support
    AlterTableFinalStep cascade();

    /**
     * Add a <code>RESTRICT</code> clause to the
     * <code>ALTER TABLE .. DROP COLUMN</code> statement.
     */
    @Support
    AlterTableFinalStep restrict();
}
