/*
 * Copyright (c) 2014, 2018 Oracle and/or its affiliates. All rights reserved.
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

package org.glassfish.hk2.configuration.hub.api;

/**
 * @author jwells
 *
 */
public interface Instance {
    /**
     * Gets the bean (or bean-like-map) associated with
     * this instance
     * 
     * @return The non-null bean or bean-like map
     */
    public Object getBean();
    
    /**
     * Gets information about this instance.  Can be
     * used to describe the bean in some useful way
     * 
     * @return The possibly null metadata associated
     * with this instance
     */
    public Object getMetadata();
    
    /**
     * Sets an object containing information about this
     * instance.  Can be used to describe the bean in
     * some useful way
     * 
     * @param metadata The possibly null metadata
     * to be associated with this instance
     */
    public void setMetadata(Object metadata);
}
