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
package org.jooq.util.sqlite;

import org.jooq.Field;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 * The {@link SQLDialect#SQLITE} specific DSL.
 *
 * @author Lukas Eder
 */
public class SQLiteDSL extends DSL {

    /**
     * No instances
     */
    private SQLiteDSL() {
    }

    // -------------------------------------------------------------------------
    // General pseudo-columns
    // -------------------------------------------------------------------------

    /**
     * Retrieve the SQLite-specific <code>_rowid_</code> pseudo-field.
     * <code>_rowid_</code> was chosen over <code>rowid</code> as it is less
     * likely to be used as an actual table column in client code.
     *
     * @see <a
     *      href="http://www.sqlite.org/lang_createtable.html#rowid">http://www.sqlite.org/lang_createtable.html#rowid</a>
     */
    public static Field<Long> rowid() {
        return field("_rowid_", Long.class);
    }
}
