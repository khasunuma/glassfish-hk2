/*
 * Copyright (c) 2010, 2018 Oracle and/or its affiliates. All rights reserved.
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

package org.glassfish.hk2.classmodel.reflect.test.model;

import org.glassfish.hk2.classmodel.reflect.test.model.qualifier.Synchronous;

/**
 * Created by IntelliJ IDEA.
 * User: dochez
 * Date: Jan 12, 2010
 * Time: 2:46:08 PM
 * To change this template use File | Settings | File Templates.
 */
@Synchronous
public class SynchronousPaymentProcessor implements PaymentProcessor {
    
    @Override
    public void process(Payment payment) {
        
    }
}
