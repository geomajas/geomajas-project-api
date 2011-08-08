/*
 * This is part of Geomajas, a GIS framework, http://www.geomajas.org/.
 *
 * Copyright 2008-2011 Geosparc nv, http://www.geosparc.com/, Belgium.
 *
 * The program is available in open source according to the GNU Affero
 * General Public License. All contributions in this program are covered
 * by the Geomajas Contributors License Agreement. For full licensing
 * details, see LICENSE.txt in the project root.
 */

package org.geomajas.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that an interface is expected to have more than one implementation.
 * This is used by the bean name generator to determine the default bean name.
 *
 * @author Joachim Van der Auwera
 * @since 1.10.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Api
public @interface ExpectAlternatives {

}
