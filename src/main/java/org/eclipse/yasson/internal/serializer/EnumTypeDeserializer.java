/*******************************************************************************
 * Copyright (c) 2016, 2017 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Roman Grigoriadi
 ******************************************************************************/

package org.eclipse.yasson.internal.serializer;

import org.eclipse.yasson.internal.Unmarshaller;
import org.eclipse.yasson.internal.model.JsonBindingModel;

import java.lang.reflect.Type;

/**
 * Deserializer for {@link Enum} type.
 *
 * @author David Kral
 */
public class EnumTypeDeserializer extends AbstractValueTypeDeserializer<Enum> {

    /**
     * Creates a new instance.
     *
     * @param model Binding model.
     */
    public EnumTypeDeserializer(JsonBindingModel model) {
        super(Enum.class, model);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected Enum deserialize(String jsonValue, Unmarshaller unmarshaller, Type rtType) {
        return Enum.valueOf((Class<Enum>) rtType, jsonValue);
    }
}
