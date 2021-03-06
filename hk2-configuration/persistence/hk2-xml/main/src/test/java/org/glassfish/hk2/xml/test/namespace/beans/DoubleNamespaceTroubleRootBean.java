/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.hk2.xml.test.namespace.beans;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import org.glassfish.hk2.xml.test.namespace.NamespaceCommon;

/**
 * Illustrates the same key (Alice) but with different namespaces
 * 
 * @author jwells
 *
 */
@XmlRootElement(namespace=NamespaceCommon.NAMESPACE_0, name="double-namespace-trouble")
public interface DoubleNamespaceTroubleRootBean {
    @XmlElement(name="Alice", namespace=NamespaceCommon.NAMESPACE_A)
    public String getAlice();
    
    // No namespace
    @XmlElement(name="Alice")
    public String getAliceDefault();
    
    @XmlElement(name="Alice", namespace=NamespaceCommon.NAMESPACE_B)
    public String getAliceB();
    
    @XmlElement(name="Alice", namespace=NamespaceCommon.NAMESPACE_C)
    public String getAliceC();

}
