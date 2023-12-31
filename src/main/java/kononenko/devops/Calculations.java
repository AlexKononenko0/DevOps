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

public class Calculations {

    private static final Logger logger = Logger.getLogger(Calculations.class);

    /**
     * Code serves to select an arithmetic operation and perform it.
     *
     * @param num1 the first input number.
     * @param num2 the second input number.
     * @return result - BigInteger
     */
    BigInteger calc(BigInteger num1, BigInteger num2, char operation) {
        Input input = new Input();
        BigInteger result;
        switch (operation) {
            case '+' -> result = num1.add(num2);
            case '-' -> result = num1.subtract(num2);
            case '*' -> result = num1.multiply(num2);
            case '/' -> result = num1.divide(num2);
            default -> {
                logger.info("Operation not recognized, please try again.");
                result = calc(num1, num2, input.getOperation());//рекурсия
            }
        }
        return result;
    }

}
