/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 * <p>
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */

package org.openmrs.module.locationbasedaccess.aop;

import org.aopalliance.aop.Advice;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.locationbasedaccess.aop.interceptor.PersonServiceInterceptorAdvice;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class PersonSearchAdviser extends StaticMethodMatcherPointcutAdvisor implements Advisor {

    private static final Log log = LogFactory.getLog(PersonSearchAdviser.class);
    private Set<String> restrictedGetMethodNames = new HashSet<String>();

    public PersonSearchAdviser() {
        restrictedGetMethodNames.add("getPeople");
        restrictedGetMethodNames.add("getPerson");
        restrictedGetMethodNames.add("getPersonByUuid");
        restrictedGetMethodNames.add("getSimilarPeople");
    }

    @Override
    public boolean matches(Method method, Class targetClass) {
        return restrictedGetMethodNames.contains(method.getName());
    }

    @Override
    public Advice getAdvice() {
        return new PersonServiceInterceptorAdvice();
    }

}
