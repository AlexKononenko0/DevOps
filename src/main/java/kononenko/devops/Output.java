/**
 * Oleksandr Kononenko
 * <p>
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 * <p>
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package kononenko.devops;

import org.apache.log4j.Logger;

import java.math.BigInteger;


public class Output {
    private static final org.apache.log4j.Logger logger = Logger.getLogger(Output.class);

    /**
     * Code serves to display result
     *
     * @param result
     * @return result - BigInteger
     */
    BigInteger output(BigInteger result) {
        logger.info("Result operation: " + result);
        return result;
    }
}
