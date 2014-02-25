/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.marshalling.util;

import org.jboss.marshalling.reflect.SerializableField;
import java.io.IOException;

/**
 * A read field whose value is a byte type.
 */
public class ByteReadField extends ReadField {

    private final byte value;

    /**
     * Construct a new instance.
     *
     * @param field the serializable field
     * @param value the value
     */
    public ByteReadField(final SerializableField field, final byte value) {
        super(field.getName(), false);
        this.value = value;
    }

    /**
     * Construct a new instance with the default value.
     *
     * @param field the serializable field
     */
    public ByteReadField(final SerializableField field) {
        super(field.getName(), true);
        value = 0;
    }

    /** {@inheritDoc} */
    public Kind getKind() {
        return Kind.BYTE;
    }

    /** {@inheritDoc} */
    public byte getByte() throws IOException {
        return value;
    }
}
