/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 * <p>
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */

package org.openmrs.module.locationbasedaccess;

public class LocationBasedAccessConstants {

    public static final  String LOCATION_ATTRIBUTE_GLOBAL_PROPERTY_NAME = "locationbasedaccess.locationAttributeUuid";
    public static final  String LOCATION_USER_PROPERTY_NAME = "locationUuid";
    public static final String ENCOUNTER_RESTRICTION_TYPE_PATIENT_LOCATION = "patientLocation";
    public static final String ENCOUNTER_RESTRICTION_TYPE_ENCOUNTER_LOCATION = "encounterLocation";

    public static final String REF_APP_LOCATION_USER_PROPERTY_NAME = "referenceapplication.locationUserPropertyName";
    public static final String PERSONATTRIBUTETYPE_NAME = "LocationAttribute";
    public static final String PERSONATTRIBUTETYPE_FORMAT = "java.lang.String";
    public static final String PERSONATTRIBUTETYPE_UUID = "0a93cbc6-5d65-4886-8091-47a25d3df944";

    public static final String PATIENT_RESTRICTION_GLOBAL_PROPERTY_NAME = "locationbasedaccess.access.patient";
    public static final String LOCATION_RESTRICTION_GLOBAL_PROPERTY_NAME = "locationbasedaccess.access.location";
    public static final String PERSON_RESTRICTION_GLOBAL_PROPERTY_NAME = "locationbasedaccess.access.person";
    public static final String USER_RESTRICTION_GLOBAL_PROPERTY_NAME = "locationbasedaccess.access.user";
    public static final String ENCOUNTER_RESTRICTION_GLOBAL_PROPERTY_NAME = "locationbasedaccess.access.encounter";
    public static final String LOCATION_BASED_RESTRICTION_VALUE_TRUE = "true";

}
