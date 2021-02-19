/*******************************************************************************
 * Copyright (c) 2019-2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/
package org.eclipse.winery.model.tosca.xml.extensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otPatternRefinementModel")
public class XOTPatternRefinementModel extends XOTTopologyFragmentRefinementModel {

    @Deprecated // required for XML deserialization
    public XOTPatternRefinementModel() { }

    public XOTPatternRefinementModel(Builder builder) {
        super(builder);
    }

    public static class Builder extends XOTTopologyFragmentRefinementModel.Builder {
        public Builder() { }

        public XOTPatternRefinementModel build() {
            return new XOTPatternRefinementModel(this);
        }

        @Override
        public Builder self() {
            return this;
        }
    }
}